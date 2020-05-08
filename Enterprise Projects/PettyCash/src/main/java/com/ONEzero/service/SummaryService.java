package com.ONEzero.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ONEzero.model.Category;
import com.ONEzero.model.CostBreakDown;
import com.ONEzero.model.SummaryReport;
import com.google.gson.Gson;

public class SummaryService {
	
	private String catname;
	private BigDecimal supportCost= BigDecimal.ZERO;
	private BigDecimal softCost = BigDecimal.ZERO;
	private BigDecimal adminCost = BigDecimal.ZERO;

	
	public String getSummaryReport(List<Category> catlist, List<SummaryReport> deptList) {
		
		List<CostBreakDown> breakdownList =  new ArrayList<>();
		String strreport = null;
		
		for(Category cat: catlist) {
			
			catname = cat.getCatname();
			
			for(SummaryReport sumobj : deptList) {
				
				if(cat.getCatname().equalsIgnoreCase(sumobj.getCatname())) {
					
																				
					if(sumobj.getDeptname().equalsIgnoreCase("Software")) {
						
						softCost = sumobj.getTotal();
					}
					
					else if (sumobj.getDeptname().equalsIgnoreCase("Support Service")) {
						
						supportCost = sumobj.getTotal();
					}
					
					else {
						
						adminCost = sumobj.getTotal();
					}
															
					CostBreakDown costobj =  new CostBreakDown(catname,supportCost,softCost,adminCost);	
					breakdownList.add(costobj);
					
				}
				
				
												
			}
			
			
			
			
		}
		
		Gson gson = new Gson();
		strreport = gson.toJson(breakdownList);
		
		return strreport;
	}

}
