//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.admi_011_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Event1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EvtCd" type="{urn:iso:std:iso:20022:tech:xsd:admi.011.001.01}Max4AlphaNumericText"/>
 *         &lt;element name="EvtParam" type="{urn:iso:std:iso:20022:tech:xsd:admi.011.001.01}Max35Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="EvtDesc" type="{urn:iso:std:iso:20022:tech:xsd:admi.011.001.01}Max350Text" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="EvtTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.011.001.01}ISODateTime" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event1", propOrder = {
    "evtCd"
})
public class Event1 {

    @XmlElement(name = "EvtCd", required = true)
    protected String evtCd;

    /**
     * Gets the value of the evtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCd() {
        return evtCd;
    }

    /**
     * Sets the value of the evtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCd(String value) {
        this.evtCd = value;
    }

}
