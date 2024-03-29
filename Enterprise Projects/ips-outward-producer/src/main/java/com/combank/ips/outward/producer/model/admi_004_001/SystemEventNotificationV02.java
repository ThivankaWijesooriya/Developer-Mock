//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.admi_004_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.admi_004_001.Event2;


/**
 * <p>Java class for SystemEventNotificationV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemEventNotificationV02">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EvtInf" type="{urn:iso:std:iso:20022:tech:xsd:admi.004.001.02}Event2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemEventNotificationV02", propOrder = {
    "evtInf"
})
public class SystemEventNotificationV02 {

    @XmlElement(name = "EvtInf", required = true)
    protected Event2 evtInf;

    /**
     * Gets the value of the evtInf property.
     * 
     * @return
     *     possible object is
     *     {@link Event2 }
     *     
     */
    public Event2 getEvtInf() {
        return evtInf;
    }

    /**
     * Sets the value of the evtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event2 }
     *     
     */
    public void setEvtInf(Event2 value) {
        this.evtInf = value;
    }

}
