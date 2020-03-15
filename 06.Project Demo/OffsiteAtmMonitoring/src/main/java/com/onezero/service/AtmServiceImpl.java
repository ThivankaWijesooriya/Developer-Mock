package com.onezero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onezero.dao.AtmDao;
import com.onezero.model.Atm;

@Service
@Transactional(transactionManager="globalTransactionManager")
public class AtmServiceImpl implements AtmService {

	@Autowired
	private AtmDao atmDao;

	@Override
	public List<Atm> getAllAtm() {

		return atmDao.getAllAtm();
	}

	@Override
	public List<Atm> getAtmByCity(String city) {

		return atmDao.getAtmByCity(city);
	}
}
