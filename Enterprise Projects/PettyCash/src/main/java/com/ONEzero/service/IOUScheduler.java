package com.ONEzero.service;

import org.springframework.scheduling.annotation.Scheduled;

import com.ONEzero.DAO.IouDAO;
import com.ONEzero.DAO.IouDAOImpl;

public class IOUScheduler {
	
	@Scheduled(cron="0 0 9 * * MON-FRI ")  
	public void IouReminder(){
	   
		IouDAO ioudao = new IouDAOImpl();
		ioudao.IouReminder();
		
	}

}
