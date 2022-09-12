//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pain_002_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.pain_002_001.ActiveCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.pain_002_001.DateAndDateTime2Choice;
import iso.std.iso._20022.tech.xsd.pain_002_001.TrackerRecord1;


/**
 * <p>Java class for TrackerData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackerData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfdDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}DateAndDateTime2Choice"/>
 *         &lt;element name="ConfdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}ActiveCurrencyAndAmount"/>
 *         &lt;element name="TrckrRcrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.11}TrackerRecord1" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerData1", propOrder = {
    "confdDt",
    "confdAmt",
    "trckrRcrd"
})
public class TrackerData1 {

    @XmlElement(name = "ConfdDt", required = true)
    protected DateAndDateTime2Choice confdDt;
    @XmlElement(name = "ConfdAmt", required = true)
    protected ActiveCurrencyAndAmount confdAmt;
    @XmlElement(name = "TrckrRcrd", required = true)
    protected List<TrackerRecord1> trckrRcrd;

    /**
     * Gets the value of the confdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getConfdDt() {
        return confdDt;
    }

    /**
     * Sets the value of the confdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setConfdDt(DateAndDateTime2Choice value) {
        this.confdDt = value;
    }

    /**
     * Gets the value of the confdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getConfdAmt() {
        return confdAmt;
    }

    /**
     * Sets the value of the confdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setConfdAmt(ActiveCurrencyAndAmount value) {
        this.confdAmt = value;
    }

    /**
     * Gets the value of the trckrRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trckrRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckrRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerRecord1 }
     * 
     * 
     */
    public List<TrackerRecord1> getTrckrRcrd() {
        if (trckrRcrd == null) {
            trckrRcrd = new ArrayList<TrackerRecord1>();
        }
        return this.trckrRcrd;
    }

}
