package com.onezero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onezero.dao.SurveyDao;
import com.onezero.model.Survey;

@Service
@Transactional(transactionManager="globalTransactionManager")
public class SurveyServiceImpl implements SurveyService{

	@Autowired
	private SurveyDao surveyDao;
	
	@Override
	public void createSurvey(Survey survey) {
		
		surveyDao.createSurvey(survey);
		
	}

}
