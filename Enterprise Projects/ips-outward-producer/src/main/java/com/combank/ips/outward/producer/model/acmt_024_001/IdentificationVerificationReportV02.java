//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.acmt_024_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.acmt_024_001.IdentificationAssignment2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.MessageIdentification5;
import iso.std.iso._20022.tech.xsd.acmt_024_001.VerificationReport2;


/**
 * <p>Java class for IdentificationVerificationReportV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationVerificationReportV02">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02}IdentificationAssignment2"/>
 *         &lt;element name="OrgnlAssgnmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02}MessageIdentification5"/>
 *         &lt;element name="Rpt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02}VerificationReport2"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02}SupplementaryData1" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationVerificationReportV02", propOrder = {
    "assgnmt",
    "orgnlAssgnmt",
    "rpt"
})
public class IdentificationVerificationReportV02 {

    @XmlElement(name = "Assgnmt", required = true)
    protected IdentificationAssignment2 assgnmt;
    @XmlElement(name = "OrgnlAssgnmt", required = true)
    protected MessageIdentification5 orgnlAssgnmt;
    @XmlElement(name = "Rpt", required = true)
    protected VerificationReport2 rpt;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationAssignment2 }
     *     
     */
    public IdentificationAssignment2 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationAssignment2 }
     *     
     */
    public void setAssgnmt(IdentificationAssignment2 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the orgnlAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification5 }
     *     
     */
    public MessageIdentification5 getOrgnlAssgnmt() {
        return orgnlAssgnmt;
    }

    /**
     * Sets the value of the orgnlAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification5 }
     *     
     */
    public void setOrgnlAssgnmt(MessageIdentification5 value) {
        this.orgnlAssgnmt = value;
    }

    /**
     * Gets the value of the rpt property.
     * 
     * @return
     *     possible object is
     *     {@link VerificationReport2 }
     *     
     */
    public VerificationReport2 getRpt() {
        return rpt;
    }

    /**
     * Sets the value of the rpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerificationReport2 }
     *     
     */
    public void setRpt(VerificationReport2 value) {
        this.rpt = value;
    }

}