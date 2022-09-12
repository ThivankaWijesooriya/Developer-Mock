package com.combank.ips.outward.producer.dao;

import com.combank.ips.outward.producer.model.pacs_008_001.Document;

public interface CreditTransferDao {

	public boolean createCreditTransfer(Document document);
	
	public boolean updateCreditTransfer(Document document);

}
