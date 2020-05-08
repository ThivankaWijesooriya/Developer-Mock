package com.ONEzero.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.EmployeeTypeDAO;
import com.ONEzero.DAO.EmployeeTypeDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.DAO.ShiftDAO;
import com.ONEzero.DAO.ShiftDAOImpl;
import com.ONEzero.model.EmployeeType;
import com.ONEzero.model.Pages;

@Controller
public class EmployeeTypeController {
	
	private HttpSession session;
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	

	}
		
	
	@RequestMapping(value = "/Employeetype", method = RequestMethod.GET)
	public String GetAllEmployeetype(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
				return "redirect:/login";
					
		}
		
		else {
			
			
			int pageid = 4;
			
			String userid = (String) session.getAttribute("userid");
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
						EmployeeTypeDAO employeetypedao = new EmployeeTypeDAOImpl();
						
						String employeetypelist = employeetypedao.getAllEmployeeTypes();
						
						
						model.addAttribute("employeetypelist",employeetypelist);
						
						return "pEmployeetype";
					  
					  
				  }
				  
				  
	         }
			
			 return "redirect:/AccessDenied";
			
		}
		


	}
	
	
	@RequestMapping(value = "/Employeetype/Submit", method = RequestMethod.POST)
	public String SubmitEmployeetype(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		JSONParser parser = new JSONParser();
		EmployeeType emptype = new EmployeeType();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		
		try {
			
		JSONObject object = (JSONObject)parser.parse(dataInputs);
		
		/*int emptypeid = Integer.parseInt((String) object.get("emptypeid"));*/
		String emptypedes = (String)object.get("emptypedes");
		int status = Integer.parseInt((String)object.get("status"));
		String remarks = (String) object.get("remarks");
		
		
		/*emptype.setEmptypeid(emptypeid);*/
		emptype.setDescription(emptypedes);
		emptype.setStatus(status);
		emptype.setRemarks(remarks);
		
		session = request.getSession();
		String createdBy = (String) session.getAttribute("name");
		emptype.setEnteredby(createdBy);
		
		EmployeeTypeDAO emptypedao = new EmployeeTypeDAOImpl();
		emptypedao.createEmployeeType(emptype);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pEmployeetype";

	}
	
	@RequestMapping(value = "/Employeetype/Delete", method = RequestMethod.POST)
	public String DeleteEmployeetype(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		JSONParser parser = new JSONParser();
		EmployeeType emptype = new EmployeeType();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject object = (JSONObject) parser.parse(dataInputs);
			
			int emptypeid = Integer.parseInt((String) object.get("emptypeid"));
			int status = Integer.parseInt((String)object.get("status"));
			
			
			emptype.setEmptypeid(emptypeid);
			emptype.setStatus(status);
			
			session = request.getSession();
			String deletedBy = (String) session.getAttribute("name");
			emptype.setDeletedby(deletedBy);
			
			
			EmployeeTypeDAO emptypedao = new EmployeeTypeDAOImpl();
			emptypedao.deleteEmployeeTypeById(emptype);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pEmployeetype";

	}
	
	
	@RequestMapping(value = "/Employeetype/Update", method = RequestMethod.POST)
	public String UpdateEmployeetype(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		JSONParser parser = new JSONParser();
		EmployeeType emptype = new EmployeeType();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject object = (JSONObject)parser.parse(dataInputs);
			
			int emptypeid = Integer.parseInt((String) object.get("emptypeid"));
			String emptypedes = (String)object.get("emptypedes");
			int status = Integer.parseInt((String)object.get("status"));
			String remarks = (String) object.get("remarks");
			
			emptype.setEmptypeid(emptypeid);
			emptype.setDescription(emptypedes);
			emptype.setStatus(status);
			emptype.setRemarks(remarks);
			
            session = request.getSession();
            String updatedBy = (String) session.getAttribute("name");
            emptype.setUpdatedby(updatedBy);
			
			EmployeeTypeDAO emptypedao = new EmployeeTypeDAOImpl();
			emptypedao.updateEmployeeTypeById(emptype);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pEmployeetype";

	}

}
