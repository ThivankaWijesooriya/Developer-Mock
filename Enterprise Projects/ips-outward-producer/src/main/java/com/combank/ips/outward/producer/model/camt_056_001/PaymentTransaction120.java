//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_056_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_056_001.OriginalGroupInformation29;
import iso.std.iso._20022.tech.xsd.camt_056_001.OriginalTransactionReference31;
import iso.std.iso._20022.tech.xsd.camt_056_001.PaymentCancellationReason5;


/**
 * <p>Java class for PaymentTransaction120 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTransaction120">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CxlId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Case5" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}OriginalGroupInformation29"/>
 *         &lt;element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Max35Text"/>
 *         &lt;element name="OrgnlTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}UUIDv4Identifier" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlClrSysRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}ActiveOrHistoricCurrencyAndAmount" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="OrgnlIntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}ISODate" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}BranchAndFinancialInstitutionIdentification6" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Assgne" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}BranchAndFinancialInstitutionIdentification6" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}PaymentCancellationReason5"/>
 *         &lt;element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}OriginalTransactionReference31"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}SupplementaryData1" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction120", propOrder = {
    "orgnlGrpInf",
    "orgnlEndToEndId",
    "cxlRsnInf",
    "orgnlTxRef"
})
public class PaymentTransaction120 {

    @XmlElement(name = "OrgnlGrpInf", required = true)
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlEndToEndId", required = true)
    protected String orgnlEndToEndId;
    @XmlElement(name = "CxlRsnInf", required = true)
    protected PaymentCancellationReason5 cxlRsnInf;
    @XmlElement(name = "OrgnlTxRef", required = true)
    protected OriginalTransactionReference31 orgnlTxRef;

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
     * Gets the value of the cxlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCancellationReason5 }
     *     
     */
    public PaymentCancellationReason5 getCxlRsnInf() {
        return cxlRsnInf;
    }

    /**
     * Sets the value of the cxlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCancellationReason5 }
     *     
     */
    public void setCxlRsnInf(PaymentCancellationReason5 value) {
        this.cxlRsnInf = value;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference31 }
     *     
     */
    public OriginalTransactionReference31 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference31 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference31 value) {
        this.orgnlTxRef = value;
    }

}