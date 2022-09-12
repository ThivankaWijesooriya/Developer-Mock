//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pacs_004_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.pacs_004_001.ActiveCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.pacs_004_001.OriginalGroupInformation29;
import iso.std.iso._20022.tech.xsd.pacs_004_001.OriginalTransactionReference32;
import iso.std.iso._20022.tech.xsd.pacs_004_001.PaymentReturnReason6;


/**
 * <p>Java class for PaymentTransaction118 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction118">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RtrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}OriginalGroupInformation29"/>
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text"/>
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}UUIDv4Identifier" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ActiveOrHistoricCurrencyAndAmount" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ISODate" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RtrdIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ActiveCurrencyAndAmount"/>
 *         &lt;element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ISODate" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Priority3Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="SttlmTmIndctn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}SettlementDateTimeIndication1" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RtrdInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ActiveOrHistoricCurrencyAndAmount" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}BaseOneRate" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CompstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ActiveOrHistoricCurrencyAndAmount" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}ChargeBearerType1Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ChrgsInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Charges7" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}BranchAndFinancialInstitutionIdentification6" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}BranchAndFinancialInstitutionIdentification6" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RtrChain" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}TransactionParties8" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RtrRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}PaymentReturnReason6"/>
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}OriginalTransactionReference32"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}SupplementaryData1" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction118", propOrder = {
    "orgnlGrpInf",
    "orgnlEndToEndId",
    "rtrdIntrBkSttlmAmt",
    "rtrRsnInf",
    "orgnlTxRef"
})
public class PaymentTransaction118 {

    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlEndToEndId", required = true)
    protected String orgnlEndToEndId;
    @XmlElement(name = "RtrdIntrBkSttlmAmt", required = true)
    protected ActiveCurrencyAndAmount rtrdIntrBkSttlmAmt;
    @XmlElement(name = "RtrRsnInf", required = true)
    protected PaymentReturnReason6 rtrRsnInf;
    @XmlElement(name = "OrgnlTxRef", required = true)
    protected OriginalTransactionReference32 orgnlTxRef;

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the rtrdIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRtrdIntrBkSttlmAmt() {
        return rtrdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the rtrdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRtrdIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.rtrdIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the rtrRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnReason6 }
     *     
     */
    public PaymentReturnReason6 getRtrRsnInf() {
        return rtrRsnInf;
    }

    /**
     * Sets the value of the rtrRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnReason6 }
     *     
     */
    public void setRtrRsnInf(PaymentReturnReason6 value) {
        this.rtrRsnInf = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference32 }
     *     
     */
    public OriginalTransactionReference32 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference32 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference32 value) {
        this.orgnlTxRef = value;
    }

}