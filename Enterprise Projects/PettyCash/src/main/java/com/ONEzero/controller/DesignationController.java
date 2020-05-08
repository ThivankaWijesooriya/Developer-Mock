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
import com.ONEzero.DAO.DepartmentDAO;
import com.ONEzero.DAO.DepartmentDAOImpl;
import com.ONEzero.DAO.DesignationDAO;
import com.ONEzero.DAO.DesignationDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.model.Designation;
import com.ONEzero.model.Pages;

@Controller
public class DesignationController {
	
	private HttpSession session;
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	

	}
	
	
	@RequestMapping(value = "/Designation", method = RequestMethod.GET)
	public String GetAllDesignation(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			int pageid = 2;
			
			String userid = (String) session.getAttribute("userid");
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
					    DesignationDAO desigdao = new DesignationDAOImpl();
						String desiglist = desigdao.getAllDesignation();
						
						model.addAttribute("desiglist",desiglist);
						
						return "pDesignation";
					  
					  
				  }
				  
				  
	         }
			 
		
			 return "redirect:/AccessDenied";
			
		}
		

	}
	
	
	@RequestMapping(value = "/Designation/Submit", method = RequestMethod.POST)
	public String SubmitDesignation(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {
		
		JSONParser parser = new JSONParser();
		Designation desig = new Designation();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject object = (JSONObject)parser.parse(dataInputs);
			
			
			String name = (String) object.get("designame");
			int status = Integer.parseInt((String)object.get("status"));
			String remarks = (String) object.get("remarks");
			
			
			desig.setDesigname(name);
			desig.setStatus(status);
			desig.setRemarks(remarks);
			
			session = request.getSession();
			String createdBy = (String) session.getAttribute("name");
			desig.setEnteredby(createdBy);
			
			DesignationDAO Desigdao = new DesignationDAOImpl();
			Desigdao.createDesignation(desig);
			
	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	
		
		return "pDesignation";

	}
	
	@RequestMapping(value = "/Designation/Delete", method = RequestMethod.POST)
	public String DeleteDesignation(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		
		JSONParser parser = new JSONParser();
		Designation desig = new Designation();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject object = (JSONObject)parser.parse(dataInputs);
			String desigid = (String)object.get("desigid");
			int status = Integer.parseInt(((String)object.get("state")));
			
			desig.setDesigid(desigid);
			desig.setStatus(status);
			
			session = request.getSession();
			String deletedBy = (String) session.getAttribute("name");
			desig.setDeletedby(deletedBy);
			
			DesignationDAO desigdao = new DesignationDAOImpl();
			desigdao.deleteDesignationById(desig);
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		return "pDesignation";

	}
	
	
	@RequestMapping(value = "/Designation/Update", method = RequestMethod.POST)
	public String UpdateDesignation(@RequestParam("data") String dataInputs,HttpServletRequest request,Model model) {

		
		JSONParser parser = new JSONParser();
		Designation desig = new Designation();
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		try {
			
			JSONObject object = (JSONObject)parser.parse(dataInputs);
			
			String id = (String) object.get("desigid");
			String name = (String) object.get("designame");
			int status = Integer.parseInt((String)object.get("status")) ;
			String remarks = (String) object.get("remarks");
			
			
			desig.setDesigid(id);
			desig.setDesigname(name);
			desig.setStatus(status);
			desig.setRemarks(remarks);
			
			session = request.getSession();
			String updatedBy = (String) session.getAttribute("name");
			desig.setUpdatedby(updatedBy);
			
			DesignationDAO Desigdao = new DesignationDAOImpl();
			Desigdao.updateDesignationById(desig);
			
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
		}
		
		return "pDesignation";

	}

}
