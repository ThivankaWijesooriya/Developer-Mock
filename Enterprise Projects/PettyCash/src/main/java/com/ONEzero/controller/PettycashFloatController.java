package com.ONEzero.controller;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.EmployeeDAO;
import com.ONEzero.DAO.EmployeeDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.model.Cheque;
import com.ONEzero.model.Employee;
import com.ONEzero.model.Pages;

@Controller
public class PettycashFloatController {
	
	private HttpSession session;
	private Logger logger = Logger.getLogger(PettycashFloatController.class);
	
	
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);

	
	}
	
	
	
	@RequestMapping(value = "/PettyCashFloat", method = RequestMethod.GET)
	public String PettyCashFloat(Model model, HttpServletRequest request) {
		
		
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
		   return "redirect:/login";
					
		}
		
		else {
						
			int pageid = 7;
			
			String userid = (String) session.getAttribute("userid");
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
					    if(authdao.isAdmin(userid)== true) {
							
							session.setAttribute("Admin", true);
							
						}
						
						else {
							
							session.setAttribute("Admin", false);
							
						}
					  
						
						String pettylist = ioudao.getAllpettycashfloat();
						
						model.addAttribute("floatinglist", pettylist);
						
						
						return "pPettyCashFloat";
					  
					  
				  }
				  
	         }
			

			 return "redirect:/AccessDenied";
			
			
		}
		
				

	}
	
	
	@RequestMapping(value = "/PettyCashFloat/Create", method = RequestMethod.GET)
	public String ViewPettyCashFloat(Model model,HttpServletRequest request) {
		
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
				return "redirect:/login";
					
		}
		
		else {
			
			int pageid = 7;
			
			String userid = (String) session.getAttribute("userid");
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  

						EmployeeDAO retreobj = new EmployeeDAOImpl();
							

						Employee emp = retreobj.getEmployeeById(userid);
						
						
						model.addAttribute("cheque", new Cheque());		
						model.addAttribute("rptoff", emp.getTemprptoff1());
						
						
						return "pCreatePettyCashFloat";
					   
					  
				  }
				  
	         }
			

			 return "redirect:/AccessDenied";
			
		}
		
				

	}
	
	
	
	@RequestMapping(value = "/PettyCashFloat/Create/Submit", method = RequestMethod.POST)
	public String SubmitPettyCashFloat(@Valid @ModelAttribute("cheque") Cheque cheque, BindingResult br,Model model,
			HttpServletRequest request) {
		
		
		session = request.getSession();
		String userid = (String) session.getAttribute("userid");
		
		IouDAO ioudao = new IouDAOImpl();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		
		String balance = ioudao.getPettyCashBalance();
		Employee emp = retreobj.getEmployeeById(userid);
		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());
		
		
		
		if (br.hasErrors()) {
			
			/*logger.info("Errors Occured");*/
			logger.error(br); // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
	
			
			return "pCreatePettyCashFloat";	
			
		}

		else {
			
		    
		    session = request.getSession();
		    
		    String createdBy = (String) session.getAttribute("name");
		    cheque.setEnteredby(createdBy);
		    
		    if(cheque.getChequedt()!= null) {
		    	
		    	
		    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				cheque.setDate(df.format(cheque.getChequedt()));
		    	
		    }
		    
		    if(cheque.getMultipartimage()!= null) {
		    	
		    	try {
		    				    		
		    	 byte [] tempimage = cheque.getMultipartimage().getBytes();
		    	 cheque.setByteimage(tempimage);
		    	 
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
		    	
		    }
		    
		    
		   
		    ioudao.CreatePettyCashFloat(cheque);

		    return "redirect:/PettyCashFloat";
			
			
		}
				

	}
	
	
	
	@RequestMapping(value = "/PettyCashFloat/view", method = RequestMethod.GET)
	public String GetPettyCashFloat(Model model,@RequestParam("cheqid") String cheqid,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
		   return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
			Cheque chq = ioudao.getchequeById(cheqid);
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			
			model.addAttribute("cheque",chq);
			model.addAttribute("img",chq.getBase64image());
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());
			
			
			return "pViewPettyCashFloat";
			
		}
				

	}
	
	
	@RequestMapping(value = "/PettyCashFloat/Update", method = RequestMethod.GET)
	public String UpdatePettyCashFloat(Model model,@RequestParam("cheqid2") String cheqid,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
		   return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
			Cheque chq = ioudao.getchequeById(cheqid);
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			
			model.addAttribute("cheque",chq);
			model.addAttribute("img",chq.getBase64image());
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());
			
			
			return "pUpdatePettyCashFloat";
			
		}
				

	}
	
	
	@RequestMapping(value = "/PettyCashFloat/Update/Submit", method = RequestMethod.POST)
	public String SubmitUpdatePettyCashFloat(@Valid @ModelAttribute("cheque") Cheque cheque, BindingResult br,Model model,
			HttpServletRequest request) {
		
		
		session = request.getSession();
		String userid = (String) session.getAttribute("userid");
		
		IouDAO ioudao = new IouDAOImpl();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		
		String balance = ioudao.getPettyCashBalance();
		Employee emp = retreobj.getEmployeeById(userid);
		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());
		
		
		
		if (br.hasErrors()) {
			
			logger.info("Errors Occured");
			/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
	
			
			return "pUpdatePettyCashFloat";	
			
		}

		else {
			
		    
		    session = request.getSession();
		    
		    String updatedby = (String) session.getAttribute("name");
		    cheque.setUpdatedby(updatedby);
		    
		    if(cheque.getChequedt()!= null) {
		    	
		    	
		    	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				cheque.setDate(df.format(cheque.getChequedt()));
		    	
		    }
		    
		    if(cheque.getMultipartimage().isEmpty()==false) {
		    	
		    	try {
		    				    		
		    	 byte [] tempimage = cheque.getMultipartimage().getBytes();
		    	 cheque.setByteimage(tempimage);
		    	 
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
		    	
		    }
		    
		    else {
		    	
		    	cheque.setByteimage(null);
		    }
		    

		    ioudao.UpdatePettyCashFloat(cheque);

		    return "redirect:/PettyCashFloat";
			
			
		}
				

	}

}
