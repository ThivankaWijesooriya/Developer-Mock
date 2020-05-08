package com.ONEzero.DAO;

import java.math.BigDecimal;
import java.util.Map;

import com.ONEzero.model.Cheque;
import com.ONEzero.model.Iou;


public interface IouDAO {
	
	
	public abstract void createIOU(Iou iou);
	public abstract String getAlliou();
	public abstract Iou getiouById(String iou);
	public abstract void updateIouById(Iou iou);
    public abstract void deleteIouById(Iou iou);
    public abstract void ApproveIouById(Iou iou);
    public abstract void RejectIouById(Iou iou,String action);
    public abstract void AuthorizeIouById(Iou iou);
    public abstract Map<String, String> fillColumnCategoryType();
    public abstract void CreatePettyCashFloat(Cheque cheque);
    public abstract String getAllpettycashfloat();
    public abstract Cheque getchequeById(String cheqid);
    public abstract Map<String,String> fillColumnIOU(String userid);
    public abstract String getPettyCashBalance();
    public abstract void createReturnIou(Iou iou);
    public abstract BigDecimal getAmount(String iou);
    public abstract void IOUreturn(Iou iou);
    public abstract String getAlliouReturns();
    public abstract Map<String,String> fillColumnIouWithReturns();
    public abstract void AuthorizeIouReturn(Iou iou);
    public abstract void RejectIouReturn(Iou iou);
    public abstract void MailSchedule();
    public abstract String getAllAuthorizedIOU(String userid);
    public abstract void IouReminder();
    public abstract String getIouByUserId(String userid);
    public abstract String getAlliouReturnsById(String userid);
    public abstract String getallTransactionIOUandReturns();
    public abstract String getAllAuthorizediouReturnsById(String userid);
    public abstract BigDecimal getPettyCashBalanceReorder();
    public abstract void ApproveIouReturn(Iou iou);
    public abstract void UpdatePettyCashFloat(Cheque cheque);
    
    
            
}
