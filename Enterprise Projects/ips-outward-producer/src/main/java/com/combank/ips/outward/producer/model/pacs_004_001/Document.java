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

import iso.std.iso._20022.tech.xsd.pacs_004_001.PaymentReturnV10;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PmtRtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}PaymentReturnV10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pmtRtr"
})
public class Document {

    @XmlElement(name = "PmtRtr", required = true)
    protected PaymentReturnV10 pmtRtr;

    /**
     * Gets the value of the pmtRtr property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReturnV10 }
     *     
     */
    public PaymentReturnV10 getPmtRtr() {
        return pmtRtr;
    }

    /**
     * Sets the value of the pmtRtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReturnV10 }
     *     
     */
    public void setPmtRtr(PaymentReturnV10 value) {
        this.pmtRtr = value;
    }

}