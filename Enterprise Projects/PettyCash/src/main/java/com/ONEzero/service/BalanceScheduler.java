package com.ONEzero.service;

import org.springframework.scheduling.annotation.Scheduled;

import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;

public class BalanceScheduler {
	
	
	/*@Scheduled(cron="0 0 17 * * MON-FRI ") */
	@Scheduled(cron="0 43 9 * * MON-FRI ")  
	public void ScheduleMail(){
	   
		IouDAO ioudao = new IouDAOImpl();
		ioudao.MailSchedule();
		
	}	

}
