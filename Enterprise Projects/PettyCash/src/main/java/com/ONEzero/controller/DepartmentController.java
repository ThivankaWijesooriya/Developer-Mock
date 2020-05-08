package com.ONEzero.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.DepartmentDAO;
import com.ONEzero.DAO.DepartmentDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.model.Department;
import com.ONEzero.model.Pages;



@Controller
public class DepartmentController {
	
	
	private HttpSession session;
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	
	}
	
	
	
	
	@RequestMapping(value = "/Department", method = RequestMethod.GET)
	public String GetAllDepartment(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		if(session.getAttribute("LoggedName")== null) {
				
				return "redirect:/login";
					
		}
		
		else {
			
			
			int pageid = 1;
						
			String userid = (String) session.getAttribute("userid");
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
					  DepartmentDAO departmentdao = new DepartmentDAOImpl();
					  String deptlist = departmentdao.getAllDepartments();
						
					  model.addAttribute("deptlist",deptlist);
						
					  return "pDepartment";
					  
					  
				  }
	         }
			

			 return "redirect:/AccessDenied";
			
		}
		

	}
	

	
	
	@RequestMapping(value = "/Department/Submit", method = RequestMethod.POST)
	public String SubmitDepartment(
			Model model,@RequestParam("data") String dataInputs,HttpServletRequest request) {

		Department deptobj = new Department();	 
		JSONParser parser = new JSONParser();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
		
			JSONObject dept = (JSONObject) parser.parse(dataInputs); 
			
			String deptname = (String) dept.get("deptname");
			int status = Integer.parseInt( (String) dept.get("status")) ;
			String remarks = (String) dept.get("remarks");
			
			
			deptobj.setDeptname(deptname);
			deptobj.setStatus(status);
			deptobj.setRemarks(remarks);
			
			session = request.getSession();
			String createdBy = (String) session.getAttribute("name");
			deptobj.setEnteredby(createdBy);
			
	        DepartmentDAO departmentdao = new DepartmentDAOImpl();
	        departmentdao.createDepartment(deptobj);
	        
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

		
		return "pDepartment";

	}
	
	@RequestMapping(value = "/Department/Delete", method = RequestMethod.POST)
	public String DeleteDepartment(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {
		
		
		Department deptobj = new Department();	 
		JSONParser parser = new JSONParser();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject dept = (JSONObject) parser.parse(dataInputs);
			
			String deptid = (String) dept.get("deptid");
			int status = Integer.parseInt((String)dept.get("status"));
			deptobj.setDeptid(deptid);
			deptobj.setStatus(status);
			
			session = request.getSession();
			String deletedBy = (String) session.getAttribute("name");
			deptobj.setDeletedby(deletedBy);
			
			DepartmentDAO departmentdao = new DepartmentDAOImpl();
			
			departmentdao.deleteDepartmentById(deptobj);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		
		
		return "pDepartment";

	}
	
	
	@RequestMapping(value = "/Department/Update", method = RequestMethod.POST)
	public String UpdateDepartment(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		Department deptobj = new Department();	 
		JSONParser parser = new JSONParser();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject dept = (JSONObject) parser.parse(dataInputs);
			String deptid = (String) dept.get("deptid");
			String deptname = (String) dept.get("deptname");
			int status = Integer.parseInt( (String) dept.get("status")) ;
			String remarks = (String) dept.get("remarks");
			
			deptobj.setDeptid(deptid);
			deptobj.setDeptname(deptname);
			deptobj.setStatus(status);
			deptobj.setRemarks(remarks);
			
			session = request.getSession();
			String updatedBy = (String) session.getAttribute("name");
			deptobj.setUpdatedby(updatedBy);
			
			DepartmentDAO deptDAO = new DepartmentDAOImpl();
			deptDAO.updateDepartmentById(deptobj);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pDepartment";

	}

}
