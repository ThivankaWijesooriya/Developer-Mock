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

import iso.std.iso._20022.tech.xsd.camt_054_001.EntryTransaction10;


/**
 * <p>Java class for EntryDetails9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryDetails9">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Btch" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}BatchInformation2" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}EntryTransaction10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryDetails9", propOrder = {
    "txDtls"
})
public class EntryDetails9 {

    @XmlElement(name = "TxDtls", required = true)
    protected EntryTransaction10 txDtls;

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link EntryTransaction10 }
     *     
     */
    public EntryTransaction10 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntryTransaction10 }
     *     
     */
    public void setTxDtls(EntryTransaction10 value) {
        this.txDtls = value;
    }

}
