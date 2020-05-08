package com.ONEzero.DAO;

import java.util.List;

import com.ONEzero.model.Employee;
import com.ONEzero.model.Pages;

public interface AuthoritiesDAO {
	
	
	public abstract Boolean AuthorizedReportingOfficer(String userid);
	public abstract List<Pages> AuthorizedPageViewer(String userid);
	public abstract void SubmitPageAuthorities(String userid,Pages page);
	public void ClearCachedAuth(String userid);
	public Pages getPages (String userid);
	public abstract Boolean isAdmin(String userid);
	public abstract Boolean isAuthorizer(String userid);
	public abstract Boolean ValidateReject(String Trnno);
	public abstract Boolean ValidateApproved(String Trnno);
	

}
