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
import com.ONEzero.DAO.DesignationDAO;
import com.ONEzero.DAO.DesignationDAOImpl;
import com.ONEzero.DAO.ShiftDAO;
import com.ONEzero.DAO.ShiftDAOImpl;
import com.ONEzero.model.Pages;
import com.ONEzero.model.Shift;

@Controller
public class ShiftController {
	
	private HttpSession session;
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	

	}
	
	
	@RequestMapping(value = "/Shift", method = RequestMethod.GET)
	public String GetShift(Model model,HttpServletRequest request) {
		
		int pageid = 3;
		
		session = request.getSession();
		String userid = (String) session.getAttribute("userid");
		
		AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
		
		List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
		
	
		 for(Pages page : AccessiblePages) {

			  if(page.getPageid()== pageid) {
				  
				  
				    ShiftDAO shiftdao = new ShiftDAOImpl();
					String shiftlist = shiftdao.getAllshifts();
					
					model.addAttribute("shiftlist",shiftlist);

					return "pShift";
				  
				  
			  }
			  
			  
         }
		
		 return "redirect:/AccessDenied";
		

	}
	
	
	@RequestMapping(value = "/Shift/Submit", method = RequestMethod.POST)
	public String SubmitShift(@RequestParam("data") String dataInputs,HttpServletRequest request) {
		
		
		JSONParser parser = new JSONParser();
		Shift shiftobj = new Shift();
		
		try {
			
			JSONObject object = (JSONObject) parser.parse(dataInputs);
			
			
			
			String shiftname = (String)object.get("shiftname");
			
			int status = Integer.parseInt((String)object.get("status"));
			
			String remarks = (String) object.get("remarks");
			
			
			shiftobj.setDescription(shiftname);
			shiftobj.setStatus(status);
			shiftobj.setRemarks(remarks);
			
			session = request.getSession();
			String createdBy = (String) session.getAttribute("name");
			shiftobj.setEnteredby(createdBy);
			
			ShiftDAO shiftdao = new ShiftDAOImpl();
			
			shiftdao.createShift(shiftobj);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}

		
		
		return "pShift";

	}
	
	@RequestMapping(value = "/Shift/Delete", method = RequestMethod.POST)
	public String DeleteShift(@RequestParam("data") String dataInputs,HttpServletRequest request) {

		JSONParser parser = new JSONParser();
		Shift shiftobj = new Shift();
		
		try {
			
			JSONObject object = (JSONObject)parser.parse(dataInputs);
			
            int shiftid = Integer.parseInt((String)object.get("shiftid"));
			
			int status = Integer.parseInt((String)object.get("status"));
			
			shiftobj.setShiftid(shiftid);
			shiftobj.setStatus(status);
			
			session = request.getSession();
			String deletedBy = (String) session.getAttribute("name");
			shiftobj.setDeletedby(deletedBy);
			
			ShiftDAO shiftdao = new ShiftDAOImpl();
			shiftdao.deleteShiftById(shiftobj);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pShift";

	}
	
	
	@RequestMapping(value = "/Shift/Update", method = RequestMethod.POST)
	public String UpdateShift(@RequestParam("data") String dataInputs, HttpServletRequest request) {

		JSONParser parser = new JSONParser();
		Shift shiftobj = new Shift();
		
		try {
			
			JSONObject object  = (JSONObject)parser.parse(dataInputs);
			
            int shiftid = Integer.parseInt((String)object.get("shiftid"));
			
			String shiftname = (String)object.get("shiftname");
			
			int status = Integer.parseInt((String)object.get("status"));
			
			String remarks = (String) object.get("remarks");
			
			
			shiftobj.setShiftid(shiftid);
			shiftobj.setDescription(shiftname);
			shiftobj.setStatus(status);
			shiftobj.setRemarks(remarks);
			
			session = request.getSession();
			String updatedBy = (String) session.getAttribute("name");
			shiftobj.setUpdatedby(updatedBy);
			
			ShiftDAO shiftdao = new ShiftDAOImpl();
			shiftdao.updateShiftById(shiftobj);
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return "pShift";

	}
	

}
