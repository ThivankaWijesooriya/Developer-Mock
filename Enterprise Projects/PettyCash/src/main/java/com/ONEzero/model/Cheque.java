package com.ONEzero.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class Cheque {
	
	@NotNull(message="Field Cannot be Empty")
	private String chequeno;
	

	@NotNull(message="Field Cannot be Empty")
	private BigDecimal amount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")   //yyyy-MM-dd
	@NotNull(message="Field Cannot be Empty")
	@Past(message="Date Should Not Be a Future Date")
	private Date chequedt;
	
	
	private String date;
	
	private String temp;
	
	private BigDecimal reorderamount;
	
	private MultipartFile multipartimage;
	private byte [] byteimage;
	private String base64image;
	
    private String enteredby;
	

	private Date entereddate;
	

	private String updatedby;
	

	private Date updateddate;
	
	
	private String deletedby;
	
	
	private Date deleteddate;



	public Cheque() {};
	
	public Cheque(String chequeno, BigDecimal amount, String date, String base64image) {
		super();
		this.chequeno = chequeno;
		this.amount = amount;
		this.date = date;
		this.base64image = base64image;
	}
	

	public Cheque(String chequeno, String date, String temp, String base64image) {
		super();
		this.chequeno = chequeno;
		this.date = date;
		this.temp = temp;
		this.base64image = base64image;
	}

	public String getChequeno() {
		return chequeno;
	}
	public void setChequeno(String chequeno) {
		this.chequeno = chequeno;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}




	public MultipartFile getMultipartimage() {
		return multipartimage;
	}




	public void setMultipartimage(MultipartFile multipartimage) {
		this.multipartimage = multipartimage;
	}




	public byte[] getByteimage() {
		return byteimage;
	}




	public void setByteimage(byte[] byteimage) {
		this.byteimage = byteimage;
	}




	public String getBase64image() {
		return base64image;
	}




	public void setBase64image(String base64image) {
		this.base64image = base64image;
	}

	public String getEnteredby() {
		return enteredby;
	}

	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}

	public Date getChequedt() {
		return chequedt;
	}

	public void setChequedt(Date chequedt) {
		this.chequedt = chequedt;
	}

	public Date getEntereddate() {
		return entereddate;
	}

	public void setEntereddate(Date entereddate) {
		this.entereddate = entereddate;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public BigDecimal getReorderamount() {
		return reorderamount;
	}

	public void setReorderamount(BigDecimal reorderamount) {
		this.reorderamount = reorderamount;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	public String getDeletedby() {
		return deletedby;
	}

	public void setDeletedby(String deletedby) {
		this.deletedby = deletedby;
	}

	public Date getDeleteddate() {
		return deleteddate;
	}

	public void setDeleteddate(Date deleteddate) {
		this.deleteddate = deleteddate;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}
	
	
	

}
