package com.combank.ipsinward.model.pacs008;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.09", name = "Document")
public class FIToFICstmrCdtTrf { 
	public GrpHdr GrpHdr;
	public CdtTrfTxInf CdtTrfTxInf;
}
