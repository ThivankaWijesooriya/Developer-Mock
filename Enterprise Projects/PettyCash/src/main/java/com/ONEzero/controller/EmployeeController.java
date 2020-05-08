package com.ONEzero.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.DepartmentDAO;
import com.ONEzero.DAO.DepartmentDAOImpl;
import com.ONEzero.DAO.DesignationDAO;
import com.ONEzero.DAO.DesignationDAOImpl;
import com.ONEzero.DAO.EmployeeDAO;
import com.ONEzero.DAO.EmployeeDAOImpl;
import com.ONEzero.DAO.EmployeeTypeDAO;
import com.ONEzero.DAO.EmployeeTypeDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.DAO.ShiftDAO;
import com.ONEzero.DAO.ShiftDAOImpl;
import com.ONEzero.model.Employee;
import com.ONEzero.model.Pages;
import com.google.gson.Gson;

@Controller
public class EmployeeController {
	
	private Logger logger = Logger.getLogger(HomeController.class);
	private HttpSession session;
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);


		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(true);
		databinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
		
		

	}
	
	
	@RequestMapping(value = "/Employee/GetAll", method = RequestMethod.GET)
	public String GetEmployee(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			int pageid = 6;
						
			String userid = (String) session.getAttribute("userid");
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
						EmployeeDAO empdao = new EmployeeDAOImpl();
						String empimg = empdao.getAllEmployee();
						
						
						
					/*	InputStream img = rs.getBinaryStream("blobimage");
						
						byte [] imgbyte = IOUtils.toByteArray(img);

						Base64 codec = new Base64();
						String encoded = codec.encodeBase64String(imgbyte);*/ //BASE64 conversion :)
						
						
						
						if(authdao.AuthorizedReportingOfficer(userid)== true) {
							
							session.setAttribute("Appr", true);
							
						}
						
						else {
							
							session.setAttribute("Appr", false);
						}
						
						
						model.addAttribute("emplist", empimg);   
						
						return "pEmployee";

					  
					  
				  }
				  			  
	         }

			 return "redirect:/AccessDenied";
			
		}
		

	}	
	

	
	
	@RequestMapping(value = "/Employee/Update/Get", method = RequestMethod.GET)
	public String UpdateEmployee(@RequestParam("empid3") String empid,
			Model model,HttpServletRequest request) {

		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			model.addAttribute("employeepath",empid);
			
			EmployeeTypeDAO type = new EmployeeTypeDAOImpl();
			Map<Integer, String> EmployeeType =type.fillColumnEmployeeType();
			
			model.addAttribute("EmpListType",EmployeeType);

			DesignationDAO obj = new DesignationDAOImpl();
			String desiglist = obj.getDesignationToEmployeeMast();
			model.addAttribute("alldesig", desiglist);

			DepartmentDAO obj2 = new DepartmentDAOImpl();
			String deptlist = obj2.getDepartmentsToEmployeeMast();
			model.addAttribute("alldept", deptlist);
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			Employee emp = retreobj.getEmployeeById(empid);
			
			
			model.addAttribute("Employee", emp);
			
			//Manually Populate Employee ID text Box
			model.addAttribute("empidno",emp.getEmployeeNo());
			
			
			return "pModifyEmployee";
			
		}
		

	}
	
	
	@RequestMapping(value = "/Employee/Update/Submit", method = RequestMethod.POST)
	public String UpdateEmployeesubmit(@Valid @ModelAttribute("Employee") Employee Employee, BindingResult br,
	Model model,@RequestParam("empidno") String empid,HttpServletRequest request) {
		
		//Manually Populate Employee ID text Box
		model.addAttribute("empidno",empid);
		
		EmployeeTypeDAO type = new EmployeeTypeDAOImpl();
		Map<Integer, String> EmployeeType =type.fillColumnEmployeeType();
		
		model.addAttribute("EmpListType",EmployeeType);

		DesignationDAO obj = new DesignationDAOImpl();
		String desiglist = obj.getDesignationToEmployeeMast();
		model.addAttribute("alldesig", desiglist);

		DepartmentDAO obj2 = new DepartmentDAOImpl();
		String deptlist = obj2.getDepartmentsToEmployeeMast();
		model.addAttribute("alldept", deptlist);
		
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		
		/*ShiftDAO shiftobj = new ShiftDAOImpl();
		String shiftlist = shiftobj.getShiftsToEmployeeMast();
		model.addAttribute("allshifts", shiftlist);*/
		
		
		/*EmployeeDAO empobj = new EmployeeDAOImpl();
		String refofficerlist = empobj.getAllReportingOfficers();
		model.addAttribute("allref",refofficerlist );*/
		
		

       if (br.hasErrors()) {
			
			logger.info("Form Validation Errors have Occured");
			logger.info(br.hasErrors());
			/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG
				
			
			return "pModifyEmployee";
								
			
		}

		else {
			
			
			if(!Employee.getMultiimage().isEmpty()) {
				
				try {
					
					byte [] img = Employee.getMultiimage().getBytes();
					
					Employee.setImage(img);
					
					System.out.println("Image Setted");
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
			else {
				
				Employee.setImage(null);
				
				System.out.println("No image");
				
			}
			
			
			Employee.setEmployeeNo(empid);
			
			
			session =request.getSession();
			String UpdatedBy = (String) session.getAttribute("name");
			Employee.setUpdatedby(UpdatedBy);
			
			EmployeeDAO Empobj = new EmployeeDAOImpl();
			Empobj.updateEmployeeById(Employee);

			return "redirect:/Employee/GetAll";
			
			
		}
				

	}
	
	
	
	
	@RequestMapping(value = "/Employee/View/Get", method = RequestMethod.GET)
	public String ViewEmployee(@RequestParam("empid") String empid,
		Model model,HttpServletRequest request) {

		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
		   return "redirect:/login";
					
		}
		
		else {
			
			EmployeeTypeDAO type = new EmployeeTypeDAOImpl();
			Map<Integer, String> EmployeeType =type.fillColumnEmployeeType();
			
			model.addAttribute("EmpListType",EmployeeType);

			DesignationDAO obj = new DesignationDAOImpl();
			String desiglist = obj.getDesignationToEmployeeMast();
			model.addAttribute("alldesig", desiglist);

			DepartmentDAO obj2 = new DepartmentDAOImpl();
			String deptlist = obj2.getDepartmentsToEmployeeMast();
			model.addAttribute("alldept", deptlist);
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
					
			
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			Employee emp = retreobj.getEmployeeById(empid);
			
			model.addAttribute("Employee", emp);
			
			
			return "pViewEmployee";
			
		}
		

	}
	
	
	@RequestMapping(value = "/Shift/GetAll", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getShift(@RequestParam("shiftname")String shiftname)
	{
		
		ShiftDAO shift = new ShiftDAOImpl();
		String shiftlist = shift.getShiftByid(shiftname);
		
							
		return shiftlist;
		
	}
	
	
	@RequestMapping(value = "/Dept/GetAll", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getDept(@RequestParam("deptname")String deptname)
	{
		
		DepartmentDAO deptdao = new DepartmentDAOImpl();
		String deptlist = deptdao.getDepartmentsByName(deptname);
		
							
		return deptlist;
		
	}
	
	
	@RequestMapping(value = "/Desig/GetAll", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getDesig(@RequestParam("designame")String designame)
	{
		
		DesignationDAO desigdao = new DesignationDAOImpl();
		String desiglist = desigdao.getDesignationByName(designame);
		
		
							
		return desiglist;
		
	}
	
	
	@RequestMapping(value = "/Emptype/GetAll", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getEmptype(@RequestParam("emptype")String emptype)
	{
		
		EmployeeTypeDAO emtypedao = new EmployeeTypeDAOImpl();
		String emptypelist = emtypedao.getEmployeeTypeByName(emptype);
		
							
		return emptypelist;
		
	}
	
	
	
	

}
