//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_060_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_060_001.CashAccount38;
import iso.std.iso._20022.tech.xsd.camt_060_001.Party40Choice;


/**
 * <p>Java class for ReportingRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportingRequest5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ReqdMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}Max35Text"/>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}CashAccount38"/>
 *         &lt;element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}Party40Choice"/>
 *         &lt;element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}BranchAndFinancialInstitutionIdentification6" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}ReportingPeriod2" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RptgSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}SequenceRange1Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ReqdTxTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}TransactionType2" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ReqdBalTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}BalanceType13" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportingRequest5", propOrder = {
    "reqdMsgNmId",
    "acct",
    "acctOwnr"
})
public class ReportingRequest5 {

    @XmlElement(name = "ReqdMsgNmId", required = true)
    protected String reqdMsgNmId;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount38 acct;
    @XmlElement(name = "AcctOwnr", required = true)
    protected Party40Choice acctOwnr;

    /**
     * Gets the value of the reqdMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdMsgNmId() {
        return reqdMsgNmId;
    }

    /**
     * Sets the value of the reqdMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdMsgNmId(String value) {
        this.reqdMsgNmId = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setAcct(CashAccount38 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setAcctOwnr(Party40Choice value) {
        this.acctOwnr = value;
    }

}
