//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_053_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_053_001.CashAccount39;
import iso.std.iso._20022.tech.xsd.camt_053_001.CashBalance8;
import iso.std.iso._20022.tech.xsd.camt_053_001.DateTimePeriod1;
import iso.std.iso._20022.tech.xsd.camt_053_001.TotalTransactions6;


/**
 * <p>Java class for AccountStatement9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountStatement9">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max35Text"/>
 *         &lt;element name="StmtPgntn" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Pagination1" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ElctrncSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Number" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RptgSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}SequenceRange1Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="LglSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Number" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}ISODateTime" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}DateTimePeriod1"/>
 *         &lt;element name="CpyDplctInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}CopyDuplicate1Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RptgSrc" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}ReportingSource1Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}CashAccount39"/>
 *         &lt;element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}CashAccount38" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}AccountInterest4" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}CashBalance8" maxOccurs="unbounded"/>
 *         &lt;element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}TotalTransactions6"/>
 *         &lt;element name="Ntry" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}ReportEntry10" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="AddtlStmtInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max500Text" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatement9", propOrder = {
    "id",
    "frToDt",
    "acct",
    "bal",
    "txsSummry"
})
public class AccountStatement9 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "FrToDt", required = true)
    protected DateTimePeriod1 frToDt;
    @XmlElement(name = "Acct", required = true)
    protected CashAccount39 acct;
    @XmlElement(name = "Bal", required = true)
    protected List<CashBalance8> bal;
    @XmlElement(name = "TxsSummry", required = true)
    protected TotalTransactions6 txsSummry;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDt(DateTimePeriod1 value) {
        this.frToDt = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount39 }
     *     
     */
    public CashAccount39 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount39 }
     *     
     */
    public void setAcct(CashAccount39 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance8 }
     * 
     * 
     */
    public List<CashBalance8> getBal() {
        if (bal == null) {
            bal = new ArrayList<CashBalance8>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link TotalTransactions6 }
     *     
     */
    public TotalTransactions6 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalTransactions6 }
     *     
     */
    public void setTxsSummry(TotalTransactions6 value) {
        this.txsSummry = value;
    }

}
