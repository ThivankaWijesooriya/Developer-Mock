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

import iso.std.iso._20022.tech.xsd.camt_054_001.CardAggregated2;
import iso.std.iso._20022.tech.xsd.camt_054_001.CardIndividualTransaction2;


/**
 * <p>Java class for CardTransaction3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTransaction3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Aggtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardAggregated2"/>
 *         &lt;element name="Indv" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardIndividualTransaction2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction3Choice", propOrder = {
    "aggtd",
    "indv"
})
public class CardTransaction3Choice {

    @XmlElement(name = "Aggtd")
    protected CardAggregated2 aggtd;
    @XmlElement(name = "Indv")
    protected CardIndividualTransaction2 indv;

    /**
     * Gets the value of the aggtd property.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated2 }
     *     
     */
    public CardAggregated2 getAggtd() {
        return aggtd;
    }

    /**
     * Sets the value of the aggtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated2 }
     *     
     */
    public void setAggtd(CardAggregated2 value) {
        this.aggtd = value;
    }

    /**
     * Gets the value of the indv property.
     * 
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    public CardIndividualTransaction2 getIndv() {
        return indv;
    }

    /**
     * Sets the value of the indv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    public void setIndv(CardIndividualTransaction2 value) {
        this.indv = value;
    }

}