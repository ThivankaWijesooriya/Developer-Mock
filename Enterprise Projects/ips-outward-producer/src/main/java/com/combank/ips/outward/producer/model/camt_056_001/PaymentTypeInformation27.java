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

import iso.std.iso._20022.tech.xsd.camt_056_001.LocalInstrument2Choice;


/**
 * <p>Java class for PaymentTypeInformation27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation27">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}Priority2Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ClrChanl" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}ClearingChannel2Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}ServiceLevel8Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}LocalInstrument2Choice"/>
 *         &lt;element name="SeqTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}SequenceType3Code" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CtgyPurp" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.09}CategoryPurpose1Choice" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation27", propOrder = {
    "lclInstrm"
})
public class PaymentTypeInformation27 {

    @XmlElement(name = "LclInstrm", required = true)
    protected LocalInstrument2Choice lclInstrm;

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public LocalInstrument2Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument2Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument2Choice value) {
        this.lclInstrm = value;
    }

}
