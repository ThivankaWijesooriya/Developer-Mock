package com.combank.ips.outward.producer.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.combank.ips.outward.producer.dao.CreditTransferDao;
import com.combank.ips.outward.producer.model.pacs_008_001.Document;
import com.combank.ips.outward.producer.service.CreditTransferService;

@Service
public class CreditTransferServiceImpl implements CreditTransferService {

	@Autowired
	private CreditTransferDao creditTransferDao;

	@Override
	public boolean createCreditTransfer(Document document) {
		return creditTransferDao.createCreditTransfer(document);
	}

	@Override
	public boolean updateCreditTransfer(Document document) {
		return creditTransferDao.updateCreditTransfer(document);
	}

}
