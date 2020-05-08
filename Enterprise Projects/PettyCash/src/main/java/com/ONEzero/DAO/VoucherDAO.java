package com.ONEzero.DAO;


import com.ONEzero.model.Voucher;

public interface VoucherDAO {
	
	public abstract void createVoucher(Voucher voucher);
	public abstract String getAllTransaction();
	public abstract String getAllVoucher();
	public abstract Voucher getVoucherById(String voucher);
	public abstract void updateVoucherById(Voucher voucher);
    public abstract void deleteVoucherById(Voucher voucher);
    public abstract void ApproveVoucherById(Voucher voucher);
    public abstract void RejectVoucherById(Voucher voucher,String action);
    public abstract void AuthorizeVoucherById(Voucher voucher);
    public abstract String getAllAuthorizedVouchers(String userid);
    public abstract String getAllVoucherByUserId(String userid);
    public abstract String getAllTransactionByRptOfficer(String userid);
    public abstract String getAllTransactionVoucher();
    public abstract String getAllInquiryByStatus(String status);
    public abstract String getAllInquiryBySearch(String fromDate, String toDate, String status);
    
    

}
