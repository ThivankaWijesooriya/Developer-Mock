package com.combank.ipsinward.model.pacs002;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.002.001.11", name = "Document")
public class FIToFIPmtStsRpt { 
	public GrpHdr GrpHdr;
	public OrgnlGrpInfAndSts OrgnlGrpInfAndSts;
	public TxInfAndSts TxInfAndSts;
}
