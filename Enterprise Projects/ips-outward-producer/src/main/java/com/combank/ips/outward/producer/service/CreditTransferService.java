package com.combank.ips.outward.producer.service;

import com.combank.ips.outward.producer.model.pacs_008_001.Document;

public interface CreditTransferService {

	public boolean createCreditTransfer(Document document);

	public boolean updateCreditTransfer(Document document);

}
