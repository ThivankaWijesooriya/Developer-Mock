package com.ONEzero.controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.validation.Valid;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.crypto.*;

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
import com.ONEzero.DAO.ReportDAO;
import com.ONEzero.DAO.ReportDAOImpl;
import com.ONEzero.DAO.ShiftDAO;
import com.ONEzero.DAO.ShiftDAOImpl;
import com.ONEzero.DAO.VoucherDAO;
import com.ONEzero.DAO.VoucherDAOImpl;
import com.ONEzero.model.Category;
import com.ONEzero.model.Employee;
import com.ONEzero.model.Pages;
import com.ONEzero.model.SummaryReport;
import com.ONEzero.service.AES_Service;
import com.ONEzero.service.SummaryService;
import com.google.gson.Gson;



@Controller
public class HomeController {
	
	
	
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
	
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Login() {

		return "redirect:/login";

	}
	
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String Loginpage() {

		return "Login";

	}
	
	
	@RequestMapping(value = "/AccessDenied", method = RequestMethod.GET)
	public String AccessDenied(Model model) {

        IouDAO ioudao = new IouDAOImpl();
		
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		
		return "pAccessDenied";

	}
	
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String HomePage(HttpServletRequest request,Model model) {
		
		
		AuthoritiesDAO authdao = new AuthoritiesDAOImpl();	
		IouDAO ioudao = new IouDAOImpl();
		
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);	
		
		session = request.getSession();
		String userid = (String) session.getAttribute("userid");
		
		
		if(session.getAttribute("LoggedName")== null) {
			
			return "redirect:/login";
			
		}
				
		else {
			
						
			if(authdao.isAdmin(userid)== true) {
				
				session.setAttribute("Admin", true);
				
			}
			
			else {
				
				session.setAttribute("Admin", false);
				
			}
			
			// Checking if user Is a Authorizer
			
			if(authdao.isAuthorizer(userid)== true) {
				
				session.setAttribute("Auth", true);
			}
			
			else {
				
				session.setAttribute("Auth", false);
			}
			
			// Checking if user Is a Reporting Officer
			
			if(authdao.AuthorizedReportingOfficer(userid)== true) {
				
				session.setAttribute("Appr", true);
				
			}
			
			else {
				
				session.setAttribute("Appr", false);
			}
			
			// Looping through pageid's located at common nav
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);		
			session.setAttribute("refpages", AccessiblePages);
			
			
			return "pHome";
			
						
		}
				

	}
	
	
	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(Model model,RedirectAttributes ra) {
		
		
		if(session != null) {
			
			session.invalidate();
			
			
			String logout = "<div class=\"alert alert-success col-xs-offset-1 col-xs-10\">\r\n" + 
            		"You have been logged out.</div>";
		 
			ra.addFlashAttribute("logoutmsg", logout);	
			
			return "redirect:/login";
		}
		
		else {
			
			return null;
		}
		

	}
	
	
	@RequestMapping(value = "/login/submit", method = RequestMethod.POST)
	public String LoginSubmission(@RequestParam(value="username",required=false) String username,
	@RequestParam(value="password",required=false) String password,HttpServletRequest request,Model model, RedirectAttributes ra) {
				
		
		EmployeeDAO empdao = new EmployeeDAOImpl();
		session =request.getSession();
		Employee emp=null;
		
				
		if(username == null || password == null) {
			
			String strVar = "<div class=\"alert alert-danger col-xs-offset-1 col-xs-10\">\r\n" + 
            		"Invalid username or password.</div>";
			
			
			ra.addFlashAttribute("loginErrormsg",strVar);
			
			return "redirect:/login";
			
		}
		
		
		else {
			
			session.setAttribute("username", username.trim());
			session.setAttribute("password", password.trim());
			
			
			emp = empdao.authenticateUser(username, password);
			
		}
		
		// If invalid user then Userid = null and if condition fails ( Failed Login )
		
		if(emp.getUserid() != null) {
			
			
			Employee emp2 = empdao.getEmployeeById(emp.getUserid());
			
			session.setAttribute("name", emp2.getKnownname());
			session.setAttribute("userid", emp.getUserid());
			session.setAttribute("LoggedName", emp.getEmpfirstname());
			
			return "redirect:/Home";
		}

		else {
			
            String strVar = "<div class=\"alert alert-danger col-xs-offset-1 col-xs-10\">\r\n" + 
            		"Invalid username or password.</div>";
			
			
			ra.addFlashAttribute("loginErrormsg",strVar);
			
			return "redirect:/login";
			
		}
		
		

	}
	
	


	@RequestMapping(value = "/Employee/Create", method = RequestMethod.GET)
	public String Homepage(Model model,HttpServletRequest request) {
	
		session = request.getSession();
		
	    if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
				
		}
	    
	    else {
	    	
			EmployeeTypeDAO type = new EmployeeTypeDAOImpl();
			DesignationDAO obj = new DesignationDAOImpl();
			DepartmentDAO obj2 = new DepartmentDAOImpl();
			ShiftDAO shiftobj = new ShiftDAOImpl();
			EmployeeDAO empobj = new EmployeeDAOImpl();
			IouDAO ioudao = new IouDAOImpl();

			
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
					
			Map<Integer, String> EmployeeType =type.fillColumnEmployeeType();
			String desiglist = obj.getDesignationToEmployeeMast();
			String deptlist = obj2.getDepartmentsToEmployeeMast();
					
			
			model.addAttribute("EmpListType",EmployeeType);
			model.addAttribute("Employee", new Employee());		
			model.addAttribute("alldesig", desiglist);		
			model.addAttribute("alldept", deptlist);		
			
			
				    
			return "pCreateEmployee";
	    	
	    	
	    }


	}
	
	

	@RequestMapping(value = "/Employee/Submit", method = RequestMethod.POST)
	public String SubmitEmployeeForm(@Valid @ModelAttribute("Employee") Employee Employee, BindingResult br,
			Model model,HttpServletRequest request) {
		
		
		EmployeeTypeDAO type = new EmployeeTypeDAOImpl();
		DesignationDAO obj = new DesignationDAOImpl();
		DepartmentDAO obj2 = new DepartmentDAOImpl();
		ShiftDAO shiftobj = new ShiftDAOImpl();
		EmployeeDAO empobj = new EmployeeDAOImpl();
		session = request.getSession();
		

		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		
		Map<Integer, String> EmployeeType =type.fillColumnEmployeeType();
		String desiglist = obj.getDesignationToEmployeeMast();
		String deptlist = obj2.getDepartmentsToEmployeeMast();
				
		
		model.addAttribute("EmpListType",EmployeeType);		
		model.addAttribute("alldesig", desiglist);		
		model.addAttribute("alldept", deptlist);		
				
		
		/* USED TO REMOVE LEADING ZERO'S FROM STRING */
		
	/*  int intemptype = Integer.parseInt(Employee.getEmployeetype());
		if(intemptype==2) {
			
			final Integer trimZeroes = Integer.parseInt(Employee.getEmployeeNo());
			System.out.println(trimZeroes.toString());
		} 
	*/			
					
		if (br.hasErrors()) {
			
			logger.info("Form Validation Errors have Occured");
			logger.info(br.hasErrors());
			/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG
			
									
			return "pCreateEmployee";
							
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
			
			
			String createdby = (String)session.getAttribute("name");	
			
			Employee.setUserid(Employee.getEmployeeNo());
			Employee.setEnteredby(createdby);
			
					
			empobj.createEmployee(Employee);

			return "redirect:/Employee/GetAll";
						
			
		}

	}
	
	
	
	
	@RequestMapping(value = "/UserManagement", method = RequestMethod.GET)
	public String UserManagement(Model model,HttpServletRequest request) {
		
		int pageid = 8;
		
		EmployeeDAO empdao = new EmployeeDAOImpl();
		AuthoritiesDAO authority = new AuthoritiesDAOImpl();
		session = request.getSession();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		
		String username = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");
		String userid = (String) session.getAttribute("userid");
		
		Employee emp = empdao.authenticateUser(username, password);
		
		// If invalid user then Userid = null and if condition fails ( Failed Login )
		
		if(emp.getUserid() != null) {
			
			
			List<Pages> AccessiblePages = authority.AuthorizedPageViewer(userid);
			
			
			 for(Pages page : AccessiblePages) {
				 

				  if(page.getPageid()== pageid) {
					  
					  
					 String empimg = empdao.getAllEmployee();							
					 model.addAttribute("emplist", empimg);

					 return "pUsermgmt";
					  
					  
				  }
				  
				  
	         }
			 
			
			 return "redirect:/AccessDenied";
			
		}
		

		else {
			        
			
			return "redirect:/login";
			
		}
		
	

	}
	
	
	
	
	@RequestMapping(value = "/UserManagement/view", method = RequestMethod.GET)
	public String viewUserManagement(Model model,@RequestParam("uid") String uid, HttpServletRequest request) {
		
			int pageid = 8;
			
			EmployeeDAO empdao = new EmployeeDAOImpl();
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			session = request.getSession();
			String userid = (String) session.getAttribute("userid"); // Current Logged User
			
			   
			 if(session.getAttribute("LoggedName")== null) {
					
				return "redirect:/login";
						
			 }
			 
			 else {
				 
				 
				 List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
					
					
				 for(Pages pagelist : AccessiblePages) {
					 
		
					  if(pagelist.getPageid()== pageid) {
						  
						  
						    Employee emp = empdao.getEmployeeById(uid);
							Pages page = authdao.getPages(uid);
						  
							model.addAttribute("userid", uid);
							model.addAttribute("EmpName", emp.getEmpfullname());		
							model.addAttribute("Pages", page);
							
							return "pViewUsermgmt";
						  
					  }
					  
					  
		        }
				 
				 
			    return "redirect:/AccessDenied";   
				 
				 
			 }
	   	    	
	}
	
	
	@RequestMapping(value = "/UserManagement/view/Submit", method = RequestMethod.POST)
	public String viewUserManagementSubmit(Model model,@ModelAttribute("Pages")Pages page,@RequestParam("userid") String uid,HttpServletRequest request) {
		
		
		EmployeeDAO empdao = new EmployeeDAOImpl();
		AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		Employee emp = empdao.getEmployeeById(uid);
		authdao.SubmitPageAuthorities(uid, page);
		
					
		// Checking if user Is a Admin
		session = request.getSession();
		String userid = (String) session.getAttribute("userid"); // Current Logged User
					
		if(authdao.isAdmin(userid)== true) {
			
			session.setAttribute("Admin", true);
			
		}
		
		else {
			
			session.setAttribute("Admin", false);
			
		}
		
		// Checking if user Is a Authorizer
		
		if(authdao.isAuthorizer(userid)== true) {
			
			session.setAttribute("Auth", true);
		}
		
		else {
			
			session.setAttribute("Auth", false);
		}
		
		
		// Checking if user Is a Reporting Officer
		
		if(authdao.AuthorizedReportingOfficer(userid)== true) {
			
			session.setAttribute("Appr", true);
			
		}
		
		else {
			
			session.setAttribute("Appr", false);
		}
			
		// Looping through pageid's located at common nav
		
		List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);		
		session.setAttribute("refpages", AccessiblePages);
		
		// Looping through pageid's located at common nav
		
       
		model.addAttribute("userid", uid);
		model.addAttribute("EmpName", emp.getEmpfullname());
      		
		return "redirect:/UserManagement";
		
	}
	
	
	@RequestMapping(value = "/PasswordManagement", method = RequestMethod.GET)
	public String PasswordMgmt(Model model,HttpServletRequest request) {

		 session = request.getSession();
		
		 if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		 }
		 
		 else {
			 
				EmployeeDAO empdao = new EmployeeDAOImpl();
				
				IouDAO ioudao = new IouDAOImpl();
				String balance = ioudao.getPettyCashBalance();
				model.addAttribute("balance",balance);
				
				String userid = (String)session.getAttribute("userid");
				Employee employee = empdao.getEmployeeById(userid);
				
				model.addAttribute("Page", new Pages());
				model.addAttribute("name",employee.getEmpfullname());
				
				return "pPasswordmgmt";
			 
		 }

	}
	
	
	@RequestMapping(value = "/Password/Validate", method=RequestMethod.POST)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String ValidatePassword(@RequestParam("data")String data,HttpServletRequest request,Model model){
		
		EmployeeDAO empdao = new EmployeeDAOImpl();
		JSONParser parser = new JSONParser();
		session = request.getSession();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
		  JSONObject object = (JSONObject) parser.parse(data);
		  String userid = (String) session.getAttribute("userid");
		  Employee emp = empdao.getEmployeeById(userid);
		  
		  String currentPass = (String)object.get("currentPass");
		  Employee emp2 = empdao.authenticateUser(emp.getUsername(), currentPass);
		  
		  if(emp2.getUserid() != null) {
			  
			  String newPass = (String) object.get("newPass");
			  empdao.changePassword(userid,newPass);
			  return "Password Correct";
		  }
		  
		  else {
			  
			  return "Password Incorrect";
		  }
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return null;
		
	}
	
	@RequestMapping(value = "/All/ReportingOfficers", method=RequestMethod.GET)
	public @ResponseBody String ReportingOfficer(@RequestParam("rptname")String name) {
		
		EmployeeDAO empobj = new EmployeeDAOImpl();
		
		String rptofficers = empobj.getAllReportingOfficers(name);
				
		return rptofficers;
	}
	
	
	
	@RequestMapping(value="/Reports",method=RequestMethod.GET)
	public String getReports(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			VoucherDAO voudao = new VoucherDAOImpl();
			String transList = voudao.getAllTransaction();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			model.addAttribute("voulist",transList);
			
			return "pReports";
			
		}
		

	}
	
	
	@RequestMapping(value="/Reports/Search", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getReimbursement(@RequestParam(value="fromDate",required=false,defaultValue="")String fromDate,
	@RequestParam(value="toDate",required=false,defaultValue="")String toDate) 
	{
		
		
		ReportDAO report = new ReportDAOImpl();
		String reimburseList = report.getReimbursement(fromDate, toDate);
		

		return reimburseList;
		
	}
	
	
	
	@RequestMapping(value="/Reports/SummaryReports",method=RequestMethod.GET)
	public String getSummaryReports(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
						
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			
			ReportDAO rptdao = new ReportDAOImpl();
			List<Category> catlist = rptdao.getCategoryList();
			List<SummaryReport> deptlist = rptdao.getDeptSummary();
			
			SummaryService sumapi = new SummaryService();
			String strstring = sumapi.getSummaryReport(catlist ,deptlist);
			
			model.addAttribute("balance",balance);
			
			model.addAttribute("catlist",strstring);
			
			return "pSummaryReport";
			
		}
		

	}
	
	
	@RequestMapping(value="/Reports/UnsettledIou",method=RequestMethod.GET)
	public String getUnsettledReports(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			VoucherDAO voudao = new VoucherDAOImpl();
			String transList = voudao.getAllTransaction();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			model.addAttribute("voulist",transList);
			
			return "pUnsettledIOU";
			
		}
		

	}
	
	

}
