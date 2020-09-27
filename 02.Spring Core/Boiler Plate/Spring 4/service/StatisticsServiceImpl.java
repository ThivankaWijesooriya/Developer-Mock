package com.onezero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onezero.dao.StatisticsDao;
import com.onezero.model.Statistics;

@Service
@Transactional(transactionManager="globalTransactionManager")
public class StatisticsServiceImpl implements StatisticsService{

	@Autowired
	private StatisticsDao statisticsDao;
	
	@Override
	public Statistics getStatistics() {
		
		return statisticsDao.getStatistics();
		
	}

}
