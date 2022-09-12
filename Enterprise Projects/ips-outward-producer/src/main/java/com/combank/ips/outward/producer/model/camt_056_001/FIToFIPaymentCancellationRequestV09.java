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

import iso.std.iso._20022.tech.xsd.camt_056_001.CaseAssignment5;
import iso.std.iso._20022.tech.xsd.camt_056_001.ControlData1;
import iso.std.iso._20022.tech.xsd.camt_056_001.UnderlyingTransaction26;


/**
 * <p>Java class for FIToFIPaymentCancellationRequestV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FIToFIPaymentCancellationRequestV09">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}CaseAssignment5"/>
 *         &lt;element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Case5" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CtrlData" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}ControlData1"/>
 *         &lt;element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}UnderlyingTransaction26"/>
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
@XmlType(name = "FIToFIPaymentCancellationRequestV09", propOrder = {
    "assgnmt",
    "ctrlData",
    "undrlyg"
})
public class FIToFIPaymentCancellationRequestV09 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "CtrlData", required = true)
    protected ControlData1 ctrlData;
    @XmlElement(name = "Undrlyg", required = true)
    protected UnderlyingTransaction26 undrlyg;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the ctrlData property.
     * 
     * @return
     *     possible object is
     *     {@link ControlData1 }
     *     
     */
    public ControlData1 getCtrlData() {
        return ctrlData;
    }

    /**
     * Sets the value of the ctrlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlData1 }
     *     
     */
    public void setCtrlData(ControlData1 value) {
        this.ctrlData = value;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction26 }
     *     
     */
    public UnderlyingTransaction26 getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction26 }
     *     
     */
    public void setUndrlyg(UnderlyingTransaction26 value) {
        this.undrlyg = value;
    }

}