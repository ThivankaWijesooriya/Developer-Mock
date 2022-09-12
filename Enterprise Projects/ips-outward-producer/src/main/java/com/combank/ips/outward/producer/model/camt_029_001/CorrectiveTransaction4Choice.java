//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_029_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_029_001.CorrectiveInterbankTransaction2;
import iso.std.iso._20022.tech.xsd.camt_029_001.CorrectivePaymentInitiation4;


/**
 * <p>Java class for CorrectiveTransaction4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrectiveTransaction4Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}CorrectivePaymentInitiation4"/>
 *         &lt;element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}CorrectiveInterbankTransaction2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrectiveTransaction4Choice", propOrder = {
    "initn",
    "intrBk"
})
public class CorrectiveTransaction4Choice {

    @XmlElement(name = "Initn")
    protected CorrectivePaymentInitiation4 initn;
    @XmlElement(name = "IntrBk")
    protected CorrectiveInterbankTransaction2 intrBk;

    /**
     * Gets the value of the initn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectivePaymentInitiation4 }
     *     
     */
    public CorrectivePaymentInitiation4 getInitn() {
        return initn;
    }

    /**
     * Sets the value of the initn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectivePaymentInitiation4 }
     *     
     */
    public void setInitn(CorrectivePaymentInitiation4 value) {
        this.initn = value;
    }

    /**
     * Gets the value of the intrBk property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectiveInterbankTransaction2 }
     *     
     */
    public CorrectiveInterbankTransaction2 getIntrBk() {
        return intrBk;
    }

    /**
     * Sets the value of the intrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectiveInterbankTransaction2 }
     *     
     */
    public void setIntrBk(CorrectiveInterbankTransaction2 value) {
        this.intrBk = value;
    }

}
