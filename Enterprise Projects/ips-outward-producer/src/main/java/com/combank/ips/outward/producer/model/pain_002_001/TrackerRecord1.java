//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pain_002_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.pain_002_001.ActiveCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.pain_002_001.BranchAndFinancialInstitutionIdentification6;
import iso.std.iso._20022.tech.xsd.pain_002_001.ChargeBearerType1Code;
import iso.std.iso._20022.tech.xsd.pain_002_001.CurrencyExchange13;


/**
 * <p>Java class for TrackerRecord1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackerRecord1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}BranchAndFinancialInstitutionIdentification6"/>
 *         &lt;element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}ChargeBearerType1Code" minOccurs="0"/>
 *         &lt;element name="ChrgsAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="XchgRateData" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}CurrencyExchange13" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerRecord1", propOrder = {
    "agt",
    "chrgBr",
    "chrgsAmt",
    "xchgRateData"
})
public class TrackerRecord1 {

    @XmlElement(name = "Agt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 agt;
    @XmlElement(name = "ChrgBr")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "ChrgsAmt")
    protected ActiveCurrencyAndAmount chrgsAmt;
    @XmlElement(name = "XchgRateData")
    protected CurrencyExchange13 xchgRateData;

    /**
     * Gets the value of the agt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAgt() {
        return agt;
    }

    /**
     * Sets the value of the agt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.agt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setChrgsAmt(ActiveCurrencyAndAmount value) {
        this.chrgsAmt = value;
    }

    /**
     * Gets the value of the xchgRateData property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public CurrencyExchange13 getXchgRateData() {
        return xchgRateData;
    }

    /**
     * Sets the value of the xchgRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange13 }
     *     
     */
    public void setXchgRateData(CurrencyExchange13 value) {
        this.xchgRateData = value;
    }

}
