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

import iso.std.iso._20022.tech.xsd.pacs_004_001.Frequency6Code;


/**
 * <p>Java class for FrequencyAndMoment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyAndMoment1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Frequency6Code"/>
 *         &lt;element name="PtInTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.004.001.10}Exact2NumericText"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyAndMoment1", propOrder = {
    "tp",
    "ptInTm"
})
public class FrequencyAndMoment1 {

    @XmlElement(name = "Tp", required = true)
    protected Frequency6Code tp;
    @XmlElement(name = "PtInTm", required = true)
    protected String ptInTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public void setTp(Frequency6Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ptInTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtInTm() {
        return ptInTm;
    }

    /**
     * Sets the value of the ptInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtInTm(String value) {
        this.ptInTm = value;
    }

}
