//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_052_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_052_001.GenericIdentification1;
import iso.std.iso._20022.tech.xsd.camt_052_001.PlainCardData1;


/**
 * <p>Java class for PaymentCard4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}PlainCardData1" minOccurs="0"/>
 *         &lt;element name="CardCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Exact3NumericText" minOccurs="0"/>
 *         &lt;element name="CardBrnd" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}GenericIdentification1" minOccurs="0"/>
 *         &lt;element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Max70Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard4", propOrder = {
    "plainCardData",
    "cardCtryCd",
    "cardBrnd",
    "addtlCardData"
})
public class PaymentCard4 {

    @XmlElement(name = "PlainCardData")
    protected PlainCardData1 plainCardData;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardBrnd")
    protected GenericIdentification1 cardBrnd;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Gets the value of the plainCardData property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData1 }
     *     
     */
    public PlainCardData1 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Sets the value of the plainCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData1 }
     *     
     */
    public void setPlainCardData(PlainCardData1 value) {
        this.plainCardData = value;
    }

    /**
     * Gets the value of the cardCtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Sets the value of the cardCtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCtryCd(String value) {
        this.cardCtryCd = value;
    }

    /**
     * Gets the value of the cardBrnd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Sets the value of the cardBrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setCardBrnd(GenericIdentification1 value) {
        this.cardBrnd = value;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCardData() {
        return addtlCardData;
    }

    /**
     * Sets the value of the addtlCardData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCardData(String value) {
        this.addtlCardData = value;
    }

}
