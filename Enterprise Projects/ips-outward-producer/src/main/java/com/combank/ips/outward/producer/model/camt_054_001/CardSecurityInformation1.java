//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_054_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_054_001.CSCManagement1Code;


/**
 * <p>Java class for CardSecurityInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardSecurityInformation1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSCMgmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CSCManagement1Code"/>
 *         &lt;element name="CSCVal" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Min3Max4NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardSecurityInformation1", propOrder = {
    "cscMgmt",
    "cscVal"
})
public class CardSecurityInformation1 {

    @XmlElement(name = "CSCMgmt", required = true)
    protected CSCManagement1Code cscMgmt;
    @XmlElement(name = "CSCVal")
    protected String cscVal;

    /**
     * Gets the value of the cscMgmt property.
     * 
     * @return
     *     possible object is
     *     {@link CSCManagement1Code }
     *     
     */
    public CSCManagement1Code getCSCMgmt() {
        return cscMgmt;
    }

    /**
     * Sets the value of the cscMgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSCManagement1Code }
     *     
     */
    public void setCSCMgmt(CSCManagement1Code value) {
        this.cscMgmt = value;
    }

    /**
     * Gets the value of the cscVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSCVal() {
        return cscVal;
    }

    /**
     * Sets the value of the cscVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSCVal(String value) {
        this.cscVal = value;
    }

}
