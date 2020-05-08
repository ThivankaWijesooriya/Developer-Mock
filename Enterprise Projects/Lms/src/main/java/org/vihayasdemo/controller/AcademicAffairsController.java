package org.vihayasdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.vihayasdemo.service.AcademicPartners;
import org.vihayasdemo.service.Awards;
import org.vihayasdemo.service.ModuleSpecification;
import org.vihayasdemo.service.ProgramDetails;
import org.vihayasdemo.service.RPL;
import org.vihayasdemo.service.UnitSpecification;

@Controller
public class AcademicAffairsController {


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String academic_partner(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		
		
		    String ID = "002";
	
			String AcademicPartners = new AcademicPartners().getAcademicPartners(ID);
			data.put("AcademicPartners", AcademicPartners);
		
		
		return "academic_partner";
  
	}
	
	@RequestMapping(value = "/ap/academic_partner/add", method = RequestMethod.POST)
	public String academic_partner_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/academic_partner");
		//System.out.println(dataInputs);
		new AcademicPartners().setAcademicPartner(dataInputs);
		return "academic_partner";
	}
	
	@RequestMapping(value = "/ap/academic_partner/Update", method = RequestMethod.POST)
	public String academic_partner_UPDATE(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs,@RequestParam("key") String keyvalue) {
		m.addAttribute("mapping", "academic_affairs/academic_partner");
		/*System.out.println("hello"+dataInputs);*/
		new AcademicPartners().UpdateAcademicPartners(dataInputs,keyvalue);
		return "academic_partner";
	}
	
	
	
	@RequestMapping(value = "/ap/program_details", method = RequestMethod.GET)
	public String program_details(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/program_details");
		
		
		String ID = "002";
		  
			String ProgramDetails = new ProgramDetails().getProgramDetails(ID);
			String awardprogram = new Awards().getAward(ID);
			String Academic = new AcademicPartners().getAcademicPartners(ID);
			String Qualiframe = new Awards().getQualificationframework();
			
			data.put("ProgramDetails", ProgramDetails);
			data.put("awardprogram", awardprogram);
			data.put("Academic", Academic);
			data.put("Qualiframe", Qualiframe);
	
		
		
		return "program_details";
	}
	
	@RequestMapping(value = "/ap/program_details/add", method = RequestMethod.POST)
	public String Program_Details_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/program_details");
		//System.out.println(dataInputs);
		new ProgramDetails().setProgramDetails(dataInputs);
		return "program_details";
	}
	
	@RequestMapping(value = "/ap/program_details/Update", method = RequestMethod.POST)
	public String Program_Details_UPDATE(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs,@RequestParam("key") String keyvalue) {
		m.addAttribute("mapping", "academic_affairs/program_details");
		/*System.out.println("hello"+dataInputs);*/
		new ProgramDetails().UpdateProgram(dataInputs, keyvalue);
		return "program_details";
	}
	
	
	@RequestMapping(value = "/ap/rpl", method = RequestMethod.GET)
	public String rpl(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/rpl");
		
        
		
		String ID = "002";
		
			String RPL = new RPL().getRPL(ID);
			data.put("RPL", RPL);
	
		
		
		return "rpl";
	}
	
	@RequestMapping(value = "/ap/rpl/add", method = RequestMethod.POST)
	public String rpl_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/rpl");
		//System.out.println(dataInputs);
		new RPL().setRPL(dataInputs);
		return "rpl";
	}
	
	
	@RequestMapping(value = "/ap/rpl/Update", method = RequestMethod.POST)
	public String rpl_UPDATE(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs,@RequestParam("key") String keyvalue) {
		m.addAttribute("mapping", "academic_affairs/rpl");
		System.out.println("hello"+dataInputs);
		new RPL().UpdateRPL(dataInputs, keyvalue);
		return "rpl";
	}
	
	@RequestMapping(value = "/ap/unit_specification", method = RequestMethod.GET)
	public String unit_specification(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/unit_specification");
		
		String ID = "002";
		
			String Unit = new UnitSpecification().getUnitspec(ID);
			data.put("Unit", Unit);

		return "unit_specification";
	}
	
	
	@RequestMapping(value = "/ap/unit_specification22", method = RequestMethod.GET)
	public String unit_spec(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/unitspec");
		
		String ID = "002";
		
			String Unit = new UnitSpecification().getUnitspec(ID);		
			data.put("Unit", Unit);

		return "unitspec";
	}
	
	
	@RequestMapping(value = "/ap/unit_specification/add", method = RequestMethod.POST)
	public String unit_specification_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/unit_specification");
		//System.out.println(dataInputs);
		new UnitSpecification().setUnitSpecification(dataInputs);
		return "unitspec";
	}
	
	@RequestMapping(value = "/ap/module_specification", method = RequestMethod.GET)
	public String module_specification(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/module_specification");
		
		String ID = "002";
		
			String module = new ModuleSpecification().getModulespec(ID);
			data.put("module", module);
		
		
		
		return "module_specification";
	}
	
	
	@RequestMapping(value = "/ap/module_specification22", method = RequestMethod.GET)
	public String module_specification2(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/modulespec2");
		
		String ID = "002";
		
			String unitv = new ModuleSpecification().getUnitspec(ID);
			//System.out.println("Hello"+unitv);
			data.put("unitv", unitv);
		
			
		
		return "modulespec2";
	}
	
	
	@RequestMapping(value = "/ap/module_specification/add", method = RequestMethod.POST)
	public String module_specification_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/unit_specification");
		//System.out.println(dataInputs);
		new ModuleSpecification().setModuleSpecification(dataInputs);
		return "modulespec2";
	}
	
	
	@RequestMapping(value = "/ap/award", method = RequestMethod.GET)
	public String users(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/award");
		
		String ID = "002";
		
			String awardv = new Awards().getAward(ID);
			//System.out.println("Hello"+unitv);
			data.put("awardv", awardv);


		return "award";
	}
	
	@RequestMapping(value = "/ap/award22", method = RequestMethod.GET)
	public String award2(Model m, HttpSession session, HttpServletRequest request, ModelMap data) {
		m.addAttribute("mapping", "academic_affairs/award2");
		
		String ID = "002";
		
			String rpl = new Awards().getRPL(ID);
			String module = new Awards().getModulespec(ID);
			String QF = new Awards().getQualificationframework(); // to get dynamic qualification frame details
			
			//System.out.println("Hello");
			//System.out.println("Hello"+unitv);
			data.put("rpl", rpl);
			data.put("module", module);
			data.put("QF", QF);
			
		
		
			
		
		return "award2";
	}
	
	@RequestMapping(value = "/ap/award22/add", method = RequestMethod.POST)
	public String award_ADD(Model m, HttpSession session, HttpServletRequest request, ModelMap data, @RequestParam("data") String dataInputs) {
		m.addAttribute("mapping", "academic_affairs/award2");
		//System.out.println(dataInputs);
		new Awards().setAwards(dataInputs);
		return "award2";
	}
	
	
	
	
	
	
	
}
