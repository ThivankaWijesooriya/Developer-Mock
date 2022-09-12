//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_054_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_054_001.CardDataReading1Code;
import iso.std.iso._20022.tech.xsd.camt_054_001.CardholderVerificationCapability1Code;
import iso.std.iso._20022.tech.xsd.camt_054_001.DisplayCapabilities1;
import iso.std.iso._20022.tech.xsd.camt_054_001.OnLineCapability1Code;


/**
 * <p>Java class for PointOfInteractionCapabilities1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionCapabilities1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardRdngCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardDataReading1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CrdhldrVrfctnCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}CardholderVerificationCapability1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OnLineCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}OnLineCapability1Code" minOccurs="0"/>
 *         &lt;element name="DispCpblties" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}DisplayCapabilities1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrtLineWidth" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.08}Max3NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities1", propOrder = {
    "cardRdngCpblties",
    "crdhldrVrfctnCpblties",
    "onLineCpblties",
    "dispCpblties",
    "prtLineWidth"
})
public class PointOfInteractionCapabilities1 {

    @XmlElement(name = "CardRdngCpblties")
    protected List<CardDataReading1Code> cardRdngCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblties")
    protected List<CardholderVerificationCapability1Code> crdhldrVrfctnCpblties;
    @XmlElement(name = "OnLineCpblties")
    protected OnLineCapability1Code onLineCpblties;
    @XmlElement(name = "DispCpblties")
    protected List<DisplayCapabilities1> dispCpblties;
    @XmlElement(name = "PrtLineWidth")
    protected String prtLineWidth;

    /**
     * Gets the value of the cardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading1Code }
     * 
     * 
     */
    public List<CardDataReading1Code> getCardRdngCpblties() {
        if (cardRdngCpblties == null) {
            cardRdngCpblties = new ArrayList<CardDataReading1Code>();
        }
        return this.cardRdngCpblties;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability1Code }
     * 
     * 
     */
    public List<CardholderVerificationCapability1Code> getCrdhldrVrfctnCpblties() {
        if (crdhldrVrfctnCpblties == null) {
            crdhldrVrfctnCpblties = new ArrayList<CardholderVerificationCapability1Code>();
        }
        return this.crdhldrVrfctnCpblties;
    }

    /**
     * Gets the value of the onLineCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public OnLineCapability1Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Sets the value of the onLineCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public void setOnLineCpblties(OnLineCapability1Code value) {
        this.onLineCpblties = value;
    }

    /**
     * Gets the value of the dispCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities1 }
     * 
     * 
     */
    public List<DisplayCapabilities1> getDispCpblties() {
        if (dispCpblties == null) {
            dispCpblties = new ArrayList<DisplayCapabilities1>();
        }
        return this.dispCpblties;
    }

    /**
     * Gets the value of the prtLineWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtLineWidth() {
        return prtLineWidth;
    }

    /**
     * Sets the value of the prtLineWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtLineWidth(String value) {
        this.prtLineWidth = value;
    }

}
