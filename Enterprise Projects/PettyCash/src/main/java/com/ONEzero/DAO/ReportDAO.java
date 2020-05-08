package com.ONEzero.DAO;

import java.util.List;

import com.ONEzero.model.Category;
import com.ONEzero.model.SummaryReport;

public interface ReportDAO {
	
	 public abstract String getReimbursement(String fromDate, String toDate);
	 public abstract String getPettycashFloatTotal();
	 public abstract String getUnsettledIouTotal();
	 public abstract List<SummaryReport> getDeptSummary(); 
	 public abstract List<Category> getCategoryList();

}
