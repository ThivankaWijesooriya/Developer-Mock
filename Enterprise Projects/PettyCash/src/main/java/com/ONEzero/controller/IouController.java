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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ONEzero.DAO.AuthoritiesDAO;
import com.ONEzero.DAO.AuthoritiesDAOImpl;
import com.ONEzero.DAO.DepartmentDAO;
import com.ONEzero.DAO.DepartmentDAOImpl;
import com.ONEzero.DAO.EmployeeDAO;
import com.ONEzero.DAO.EmployeeDAOImpl;
import com.ONEzero.DAO.EmployeeTypeDAO;
import com.ONEzero.DAO.EmployeeTypeDAOImpl;
import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;
import com.ONEzero.DAO.VoucherDAO;
import com.ONEzero.DAO.VoucherDAOImpl;
import com.ONEzero.model.Cheque;
import com.ONEzero.model.Employee;
import com.ONEzero.model.Iou;
import com.ONEzero.model.Pages;
import com.google.gson.Gson;

@Controller
public class IouController {
	
	
	private Logger logger = Logger.getLogger(IouController.class);
	private HttpSession session;
	
	

	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		

		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, trimmerEditor);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(true);
		databinder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));

			

	}
		

	@RequestMapping(value = "/IOU", method = RequestMethod.GET)
	public String ViewIOU(Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			IouDAO ioudao = new IouDAOImpl();
			
			
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			
			String userid = (String)session.getAttribute("userid");
			
			String list =ioudao.getIouByUserId(userid);

				
	        model.addAttribute("ioulist",list);
	        
	        
			return "pIOU";
			
		}
		
	}
	
	
	
	@RequestMapping(value = "/IOU/Create", method = RequestMethod.GET)
	public String CreateIOU(Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			IouDAO ioudao = new IouDAOImpl();
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
					
			Map<String, String> CatType =ioudao.fillColumnCategoryType();
			String balance = ioudao.getPettyCashBalance();
	        String userid = (String) session.getAttribute("userid");
	        Employee emp = retreobj.getEmployeeById(userid);
							
			
			model.addAttribute("IOU", new Iou());
			model.addAttribute("CatListType",CatType);
			model.addAttribute("balance",balance);
			model.addAttribute("rptoff", emp.getTemprptoff1());
			

			return "pCreateIOU";
			
						
		}
		

	}
	
	
	@RequestMapping(value = "/IOU/Create/Submit", method = RequestMethod.POST)
	public String CreateIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,HttpServletRequest request) {
		
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		Employee emp = new Employee();
		
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		String createdBy = (String) session.getAttribute("name");
		emp = retreobj.getEmployeeById(userid);
				
		
		model.addAttribute("CatListType",CatType);		
		model.addAttribute("balance",balance);
		model.addAttribute("rptoff", emp.getTemprptoff1());
		
		    				
		
	       if (br.hasErrors()) {
				
				/*logger.info("Form Validation Errors have Occured");*/
				
				logger.error(br);       
				
				return "pCreateIOU";				
				
			}

			else {
							    			   
			    
			    Iou.setEnteredby(createdBy);
			    emp.setUserid(userid);
			    Iou.setEmployee(emp);
			   				
				
				ioudao.createIOU(Iou);
				// IOU Created

				return "redirect:/IOU";
				
				
			}

	}
	
	
	@RequestMapping(value = "/IOU/Update", method = RequestMethod.GET)
	public String UpdateIOU(@RequestParam("louid") String louid, Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			IouDAO ioudao = new IouDAOImpl();		
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
			
			Map<String, String> CatType =ioudao.fillColumnCategoryType();
			Iou iou =ioudao.getiouById(louid);
			String balance = ioudao.getPettyCashBalance();		
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			
			
			model.addAttribute("CatListType",CatType);
			model.addAttribute("IOU", iou);
			model.addAttribute("balance",balance);
			model.addAttribute("rptoff", emp.getTemprptoff1());
			model.addAttribute("iouref",louid);

			
			return "pUpdateIOU";
			
		}
		

	}
	
	
	@RequestMapping(value = "/IOU/Update/Submit", method = RequestMethod.POST)
	public String UpdateIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,HttpServletRequest request) {
		
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		String updatedBy = (String) session.getAttribute("name");
		Employee emp = retreobj.getEmployeeById(userid);
		
		
		model.addAttribute("CatListType",CatType);		
		model.addAttribute("balance",balance);
		model.addAttribute("rptoff", emp.getTemprptoff1());
		model.addAttribute("iouref",Iou.getIouno());
		
				
		
	       if (br.hasErrors()) {
				
				logger.info("Form Validation Errors have Occured");
				logger.info(br.hasErrors());
				/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
				
				return "pUpdateIOU";				
				
			}

			else {
							   			    
			    
			    Iou.setUpdatedby(updatedBy);				
				ioudao.updateIouById(Iou);
				

			    return "redirect:/IOU";
				
				
			}

	}
	
	
	@RequestMapping(value = "/IOU/Delete", method = RequestMethod.GET)
	public String DeleteIOU(@RequestParam("louid2") String louid,Model model,HttpServletRequest request) {
						
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
		   return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
			
			Iou iou =ioudao.getiouById(louid);
			Map<String, String> CatType =ioudao.fillColumnCategoryType();
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			
			
			model.addAttribute("IOU", iou);		
			model.addAttribute("CatListType",CatType);
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());
			

			return "pDeleteIOU";
			
		}


	}
	
	
	@RequestMapping(value = "/IOU/Delete/Submit", method = RequestMethod.POST)
	public String DeleteIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,HttpServletRequest request) {
		
		
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();	
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		Employee emp = retreobj.getEmployeeById(userid);
		String deletedBy = (String) session.getAttribute("name");
		
		
		model.addAttribute("CatListType",CatType);		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());
		
		
		
	       if (br.hasErrors()) {
				
				logger.info("Form Validation Errors have Occured");
				logger.info(br.hasErrors());
				/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
				
				return "pDeleteIOU";				
				
			}

			else {
				
							   
			    Iou.setDeletedby(deletedBy);
				ioudao.deleteIouById(Iou);
				

				return "redirect:/IOU";
								
			}

	}
	

	//Delete Controller
	@RequestMapping(value = "/IOU/Approve/GET", method = RequestMethod.GET)
	public String ApproveIOU(Model model,HttpServletRequest request) {
		
		session = request.getSession();

		String userid = (String) session.getAttribute("userid");
		
		IouDAO ioudao = new IouDAOImpl();
		String balance = ioudao.getPettyCashBalance();
		model.addAttribute("balance",balance);
		
		AuthoritiesDAO authority = new AuthoritiesDAOImpl();
		
		if(authority.AuthorizedReportingOfficer(userid)==true) {
			

			String list =ioudao.getAlliou();
					
			
	        model.addAttribute("ioulist",list);
			return "pApproveIOU";
						
			
		}
		
		else {
			
			return "redirect:/AccessDenied";
		}
		

	}
	

	
	@RequestMapping(value = "/IOU/Approve/Readonly", method = RequestMethod.GET)
	public String viewApproveIOU(@RequestParam("louid1") String louid,Model model,HttpServletRequest request) {
		
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			IouDAO ioudao = new IouDAOImpl();
			AuthoritiesDAO authority = new AuthoritiesDAOImpl();
					

			String userid = (String) session.getAttribute("userid");
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);	
			
		
			if(authority.AuthorizedReportingOfficer(userid)==true) {
				
				
				
				Iou iou = ioudao.getiouById(louid);
				Map<String, String> CatType = ioudao.fillColumnCategoryType();
				
				Employee emp = retreobj.getEmployeeById(userid);
				Boolean AuthReject = authority.ValidateReject(louid);
				
				
				model.addAttribute("IOU", iou);			
				model.addAttribute("CatListType",CatType);			
						
				model.addAttribute("rptoff", emp.getTemprptoff1());
				model.addAttribute("AuthReject",AuthReject);
				model.addAttribute("appcomments",iou.getApprovalComments());
				

				return "pViewIOUApproval";
							
				
			}
			
			else {
				
				return "redirect:/AccessDenied";
			}
			
			
		}
		

	}
	
	
	@RequestMapping(value = "/IOU/Approve/Submit", method = RequestMethod.POST)
	public String viewApproveIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,
	@RequestParam("comments") String comments,HttpServletRequest request ) 
	
	
	{
				
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		AuthoritiesDAO authority = new AuthoritiesDAOImpl();
		
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();	
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		String approvedBy = (String) session.getAttribute("name");
		Employee emp = retreobj.getEmployeeById(userid);
		Boolean AuthReject = authority.ValidateReject(Iou.getIouno());
		
		
		model.addAttribute("CatListType",CatType);		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());
		model.addAttribute("AuthReject",AuthReject);
		
				
		
	       if (br.hasErrors()) {
				
				/*logger.info("Form Validation Errors have Occured");*/
				logger.error(br);     
				
				return "pViewIOUApproval";				
				
			}

			else {
				
			    
			    Iou.setComments(comments);
			    			   
			    Iou.setApprovedby(approvedBy);
			    
				ioudao.ApproveIouById(Iou);

				return "redirect:/Request/Approve/GET";
				
				
			}

	}
	
	
	
	@RequestMapping(value = "/IOU/Reject/Submit", method = RequestMethod.POST)
	public String viewRejectIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,
	@RequestParam("comments") String comments,HttpServletRequest request,@RequestParam("actionstat") String actionstat) 
	
	{
		
		
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();			
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		Employee emp = retreobj.getEmployeeById(userid);
		String rejectedBy = (String) session.getAttribute("name");
		
		
		model.addAttribute("balance",balance);	
		model.addAttribute("rptoff", emp.getTemprptoff1());		
		model.addAttribute("CatListType",CatType);
		
		
	       if (br.hasErrors()) {
				
				logger.info("Form Validation Errors have Occured");
				logger.info(br.hasErrors());
				/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
				
				/*return "pViewIOURejection";*/
				return null;	
				
			}

			else {
				
			    
			    Iou.setComments(comments);
			    Iou.setRejectedby(rejectedBy);
				ioudao.RejectIouById(Iou,actionstat); 
				

			    if(actionstat.equalsIgnoreCase("AppReject")) {
			    	
			    	
			    	return "redirect:/Request/Approve/GET";
			    	
			    }
			    
			    if(actionstat.equalsIgnoreCase("AuthReject")) {
			    	
			    	// AuthReject
			    	
			    	return "redirect:/Request/Authorize/GET";
			    }
				
				
			    return null;
			}

	}
	
	
	@RequestMapping(value = "/IOU/Authorize/GET", method = RequestMethod.GET)
	public String AuthorizeIOU(Model model,HttpServletRequest request) {
		
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
			int pageid = 5;
			
			String userid = (String) session.getAttribute("userid");
			
			AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
			
			IouDAO ioudao = new IouDAOImpl();
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			List<Pages> AccessiblePages = authdao.AuthorizedPageViewer(userid);
			
		
			 for(Pages page : AccessiblePages) {

				  if(page.getPageid()== pageid) {
					  
					  
						String list =ioudao.getAlliou();
								
						
				        model.addAttribute("ioulist",list);
						return "pAuthorizeIOU";
					  
					  
				  }
				  
				  
	         }
			
			 return "redirect:/AccessDenied";	
			
		}
		

	}
	
	
	@RequestMapping(value = "/IOU/Authorize/Readonly", method = RequestMethod.GET)
	public String viewAuthorizeIOU(@RequestParam("louid") String louid,Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			AuthoritiesDAO authority = new AuthoritiesDAOImpl();
			
			
			Iou iou =ioudao.getiouById(louid);
			Map<String, String> CatType =ioudao.fillColumnCategoryType();
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			Boolean AuthReject = authority.ValidateReject(louid);
			Boolean AuthApproved = authority.ValidateApproved(louid);
			
				
			model.addAttribute("IOU", iou);		
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());	
			model.addAttribute("CatListType",CatType);
			model.addAttribute("AuthReject",AuthReject);
			model.addAttribute("AuthApproved",AuthApproved);
			model.addAttribute("AuthComments",iou.getAuthorizeComments());
			

			return "pViewIOUAuthorize";
			
		}
		

	}
	
	@RequestMapping(value = "/IOU/Authorize/Submit", method = RequestMethod.POST)
	public String viewAuthorizeIOUSubmit(@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br,Model model,
	@RequestParam("comments") String comments,HttpServletRequest request ) 
	
	{
		
		
		IouDAO ioudao = new IouDAOImpl();
		session = request.getSession();
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		AuthoritiesDAO authority = new AuthoritiesDAOImpl();
		
		
		Map<String, String> CatType =ioudao.fillColumnCategoryType();			
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		Employee emp = retreobj.getEmployeeById(userid);
		String authorizedBy = (String) session.getAttribute("name");
		Boolean AuthReject = authority.ValidateReject(Iou.getIouno());
		
		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());		
		model.addAttribute("CatListType",CatType);
		model.addAttribute("AuthReject",AuthReject);
		
		
		
	       if (br.hasErrors()) {
				
				logger.info("Form Validation Errors have Occured");
				logger.info(br.hasErrors());
				/*logger.error(br);*/ // <- UNDO THIS COMMENT TO SEE CRITICAL ERROR LOG		       
				
				return "pViewIOUAuthorize";				
				
			}

			else {
				
			    
			    Iou.setComments(comments);		    
			    Iou.setAuthorizedby(authorizedBy);		   
				ioudao.AuthorizeIouById(Iou);
				

				return "redirect:/Request/Authorize/GET";
				
				
			}

	}
	
	
	
	
	
	@RequestMapping(value = "/IOU_Return", method = RequestMethod.GET)
	public String IOUreturn (Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			
			String userid = (String) session.getAttribute("userid");
			
			String list =ioudao.getAlliouReturnsById(userid);
			model.addAttribute("ioulist",list);
	        
			return "pIOUreturn";
			
		}

	}
	
	
	@RequestMapping(value = "/IOU_Return/CreateIouReturn", method = RequestMethod.GET)
	public String CreateIOUreturn (Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			
			
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			Map ioucolumn = ioudao.fillColumnIOU(userid);
			
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());		
	        model.addAttribute("IOU",new Iou());
	        model.addAttribute("iounolist",ioucolumn);
	       
	        
			return "pCreateIouReturn";
			
		}


	}
	
	
	@RequestMapping(value = "/IOU_Return/CreateIouReturn/Submit", method = RequestMethod.POST)
	public String CreateIOUreturnSubmit (@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br, Model model, HttpServletRequest request) {
		
		IouDAO ioudao = new IouDAOImpl();		
		EmployeeDAO retreobj = new EmployeeDAOImpl();
		session = request.getSession();
		
		
		String balance = ioudao.getPettyCashBalance();
		String userid = (String) session.getAttribute("userid");
		Employee emp = retreobj.getEmployeeById(userid);
		Map ioucolumn = ioudao.fillColumnIOU(userid);
		
		
		model.addAttribute("balance",balance);		
		model.addAttribute("rptoff", emp.getTemprptoff1());       
        model.addAttribute("iounolist",ioucolumn);
        
       
        
        if(br.hasErrors()) {
        	
        	logger.error(br);
        	
        	return "pCreateIouReturn";
        	
        }
        
        
        else {
        	
        	String returnedby = (String) session.getAttribute("name");
        	Iou.setReturnedby(returnedby);
        	
        	ioudao.IOUreturn(Iou);
        	
        	return "redirect:/IOU_Return";
        }
		

	}
	
	@RequestMapping(value = "/IOU_Return/ViewIouReturn", method = RequestMethod.GET)
	public String ViewIOUreturn (Model model, HttpServletRequest request, @RequestParam("iouno")String iouno) {
				
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns(); // To display all Iou's for View Iou Page
	        Iou iou = ioudao.getiouById(iouno);
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("IOU",iou);
	        
	       
			return "pViewIouReturn";
			
		}
        

	}
	
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Authorize", method = RequestMethod.GET)
	public String ViewIOUreturnAuthorize (Model model, HttpServletRequest request, @RequestParam("authorizeiouno")String iouno) {
				
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
			
			return "redirect:/login";
					
		}
		
		else {
			
	        IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			Boolean AuthReject = authdao.ValidateReject(iouno);
			Boolean AuthApproved = authdao.ValidateApproved(iouno);
	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        Iou iou = ioudao.getiouById(iouno);
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("IOU",iou);
	        model.addAttribute("AuthReject",AuthReject);
	        model.addAttribute("AuthApproved",AuthApproved);
	        
	       
			return "pViewIouReturnAuthorize";
			
			
		}


	}
	
	
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Authorize/Submit", method = RequestMethod.POST)
	public String ViewIOUreturnAuthorizeSubmit (@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br, Model model, HttpServletRequest request) {
		
		    IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        session = request.getSession();
	        AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        Boolean AuthReject = authdao.ValidateReject(Iou.getIouno());
	        Boolean AuthApproved = authdao.ValidateApproved(Iou.getIouno());
	        
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("AuthReject",AuthReject);
	        model.addAttribute("AuthApproved",AuthApproved);
	             
        
         if(br.hasErrors()) {
        	
        	logger.error(br);
        	
        	System.out.println("Error");
        	
        	return "pViewIouReturnAuthorize";
        	
        }
        
        
        else {
        	
        	ioudao.AuthorizeIouReturn(Iou);
        	
        	return "redirect:/Request/Authorize/GET";
        }
		

	}
	
	// IOU Authorizer Reject
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Reject/Submit", method = RequestMethod.POST)
	public String ViewIOUreturnRejectSubmit (@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br, Model model, HttpServletRequest request) {
		
		    IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        session = request.getSession();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	             
        
         if(br.hasErrors()) {
        	
        	logger.error(br);
        	
        	System.out.println("Error");
        	
        	return "pViewIouReturnAuthorize";
        	
        }
        
        
        else {
        	
        	ioudao.RejectIouReturn(Iou);
        	
        	return "redirect:/Request/Authorize/GET";
        }
		

	}
	
	// IOU Approver Reject
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Reject/Approver/Submit", method = RequestMethod.POST)
	public String ViewIOUreturnApproverRejectSubmit (@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br, Model model, HttpServletRequest request) {
		
		    IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        session = request.getSession();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	             
        
         if(br.hasErrors()) {
        	
        	logger.error(br);
        	
        	System.out.println("Error");
        	
        	return "pViewIouReturnAuthorize";
        	
        }
        
        
        else {
        	
        	ioudao.RejectIouReturn(Iou);
        	
        	return "redirect:/Request/Approve/GET";
        }
		

	}
	
	
	
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Approve", method = RequestMethod.GET)
	public String ViewIOUreturnApprove (Model model, HttpServletRequest request, @RequestParam("approveiouno")String iouno) {
				
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
	        IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        Iou iou = ioudao.getiouById(iouno);
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("IOU",iou);
	        
	       
			return "pViewIouReturnApprove";
			
		}


	}
	
	
	@RequestMapping(value = "/IOU_Return/ViewIouReturn/Approve/Submit", method = RequestMethod.POST)
	public String ViewIOUreturnApproveSubmit (@Valid @ModelAttribute("IOU") Iou Iou, BindingResult br, Model model, HttpServletRequest request) {
		
		    IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        session = request.getSession();
	       
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        
	              
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	       
	                    
         if(br.hasErrors()) {
        	
        	logger.error(br);
        	
        	System.out.println("Error");
        	
        	return "pViewIouReturnApprove";
        	
        }
        
        
        else {
        	
        	ioudao.ApproveIouReturn(Iou);
        	
        	return "redirect:/Request/Approve/GET";
        }
		

	}
	
	
	@RequestMapping(value = "/GetAmount", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody String getAmount(@RequestParam(value="iouid",required=false) String id, HttpServletRequest request)
	{
		
		Gson gson = new Gson();

		IouDAO ioudao = new IouDAOImpl();
		BigDecimal amount = ioudao.getAmount(id);
				
		JSONObject object = new JSONObject();
		object.put("amount", amount.toString());
		
		String result = gson.toJson(object);
				
				
		return result;
		
	}
	
	@RequestMapping(value="/IOU/GetIouInquiry", method=RequestMethod.GET)
	public String getIouInquiry(Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
			
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			
			String userid = (String) session.getAttribute("userid");
			
			String list =ioudao.getAllAuthorizedIOU(userid);
			
	        model.addAttribute("ioulist",list);
			
			return "pIouInquiry";
			
		}

	}
	
	
	@RequestMapping(value = "/IOU/Inquire/Readonly", method = RequestMethod.GET)
	public String viewInquiryIOU(@RequestParam("louid1") String louid,Model model,HttpServletRequest request) {
		
		
			session = request.getSession();
			
			if(session.getAttribute("LoggedName")== null) {
					
				return "redirect:/login";
						
			}
			
			else {
				
				
				EmployeeDAO retreobj = new EmployeeDAOImpl();
				IouDAO ioudao = new IouDAOImpl();
				AuthoritiesDAO authority = new AuthoritiesDAOImpl();
			

			    String userid = (String) session.getAttribute("userid");
			    
				
				Iou iou = ioudao.getiouById(louid);
				Map<String, String> CatType = ioudao.fillColumnCategoryType();
				String balance = ioudao.getPettyCashBalance();
				Employee emp = retreobj.getEmployeeById(userid);
				Boolean AuthReject = authority.ValidateReject(louid);
				
				
				model.addAttribute("IOU", iou);			
				model.addAttribute("CatListType",CatType);			
				model.addAttribute("balance",balance);			
				model.addAttribute("rptoff", emp.getTemprptoff1());
				model.addAttribute("AuthReject",AuthReject);
				
				
				return "pViewIouInquiry";
				
			}
								
	}
	
	
	@RequestMapping(value = "/Inquiry/IOU/Authorize/Readonly", method = RequestMethod.GET)
	public String inquiryViewAuthorizeIOU(@RequestParam("louid") String louid,Model model, HttpServletRequest request) {
		
		session = request.getSession();	
		
		if(session.getAttribute("LoggedName")== null) {
			
			return "redirect:/login";
					
		}
		
		else {
			
			
			IouDAO ioudao = new IouDAOImpl();
			EmployeeDAO retreobj = new EmployeeDAOImpl();
			AuthoritiesDAO authority = new AuthoritiesDAOImpl();
			
			
			Iou iou =ioudao.getiouById(louid);
			Map<String, String> CatType =ioudao.fillColumnCategoryType();
			String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			Boolean AuthReject = authority.ValidateReject(louid);
			
				
			model.addAttribute("IOU", iou);		
			model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());	
			model.addAttribute("CatListType",CatType);
			model.addAttribute("AuthReject",AuthReject);
			model.addAttribute("AuthComments",iou.getAuthorizeComments());
			

			return "pInquiryViewIOUAuthorize";
			
		}
		

	}
	
	
	@RequestMapping(value = "/Inquiry/IOU_Return/ViewIouReturn/Authorize", method = RequestMethod.GET)
	public String inquiryViewIOUreturnAuthorize (Model model, HttpServletRequest request, @RequestParam("authorizeiouno")String iouno) {
				
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        AuthoritiesDAO authdao = new AuthoritiesDAOImpl();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
			Boolean AuthReject = authdao.ValidateReject(iouno);
	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns();
	        Iou iou = ioudao.getiouById(iouno);
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("IOU",iou);
	        model.addAttribute("AuthReject",AuthReject);
	        
	       
			return "pInquiryViewIouReturnAuthorize";
			
		}
        

	}
	
	@RequestMapping(value="/Inquiry/IOU_Return/Authorize" , method=RequestMethod.GET)
	public String getAuthorizedIouReturnByUser(HttpServletRequest request,Model model) {
		
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			IouDAO ioudao = new IouDAOImpl();
	        
			String balance = ioudao.getPettyCashBalance();
			model.addAttribute("balance",balance);
			
			
			String userid = (String) session.getAttribute("userid");
			
			String list =ioudao.getAllAuthorizediouReturnsById(userid);
			model.addAttribute("ioulist",list);
			
			return "pIOUreturnInquiry";
			
		}

	}
	
	
	@RequestMapping(value = "/IOU_Return/Inquiry/ViewIouReturn", method = RequestMethod.GET)
	public String ViewInquiryIOUreturn (Model model, HttpServletRequest request, @RequestParam("iouno")String iouno) {
				
		session = request.getSession();
		
		if(session.getAttribute("LoggedName")== null) {
				
			return "redirect:/login";
					
		}
		
		else {
			
			
	        IouDAO ioudao = new IouDAOImpl();
	        EmployeeDAO retreobj = new EmployeeDAOImpl();
	        
	        String balance = ioudao.getPettyCashBalance();
			String userid = (String) session.getAttribute("userid");
			Employee emp = retreobj.getEmployeeById(userid);
	        
	        Map ioucolumn = ioudao.fillColumnIouWithReturns(); // To display all Iou's for View Iou Page
	        Iou iou = ioudao.getiouById(iouno);
	        
	        model.addAttribute("balance",balance);		
			model.addAttribute("rptoff", emp.getTemprptoff1());  
	        model.addAttribute("iounolist",ioucolumn);
	        model.addAttribute("IOU",iou);
	        
	       
			return "pViewAuthorizedIouReturn";
			
		}


	}
	

}
