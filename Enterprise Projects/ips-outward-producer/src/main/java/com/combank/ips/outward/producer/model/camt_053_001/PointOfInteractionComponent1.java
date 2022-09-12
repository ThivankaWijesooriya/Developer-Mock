//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_053_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_053_001.POIComponentType1Code;


/**
 * <p>Java class for PointOfInteractionComponent1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponent1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="POICmpntTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}POIComponentType1Code"/>
 *         &lt;element name="ManfctrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max35Text" minOccurs="0"/>
 *         &lt;element name="Mdl" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max35Text" minOccurs="0"/>
 *         &lt;element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max16Text" minOccurs="0"/>
 *         &lt;element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max35Text" minOccurs="0"/>
 *         &lt;element name="ApprvlNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.053.001.08}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent1", propOrder = {
    "poiCmpntTp",
    "manfctrId",
    "mdl",
    "vrsnNb",
    "srlNb",
    "apprvlNb"
})
public class PointOfInteractionComponent1 {

    @XmlElement(name = "POICmpntTp", required = true)
    protected POIComponentType1Code poiCmpntTp;
    @XmlElement(name = "ManfctrId")
    protected String manfctrId;
    @XmlElement(name = "Mdl")
    protected String mdl;
    @XmlElement(name = "VrsnNb")
    protected String vrsnNb;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ApprvlNb")
    protected List<String> apprvlNb;

    /**
     * Gets the value of the poiCmpntTp property.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType1Code }
     *     
     */
    public POIComponentType1Code getPOICmpntTp() {
        return poiCmpntTp;
    }

    /**
     * Sets the value of the poiCmpntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType1Code }
     *     
     */
    public void setPOICmpntTp(POIComponentType1Code value) {
        this.poiCmpntTp = value;
    }

    /**
     * Gets the value of the manfctrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrId() {
        return manfctrId;
    }

    /**
     * Sets the value of the manfctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctrId(String value) {
        this.manfctrId = value;
    }

    /**
     * Gets the value of the mdl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdl() {
        return mdl;
    }

    /**
     * Sets the value of the mdl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdl(String value) {
        this.mdl = value;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsnNb(String value) {
        this.vrsnNb = value;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the apprvlNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apprvlNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprvlNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApprvlNb() {
        if (apprvlNb == null) {
            apprvlNb = new ArrayList<String>();
        }
        return this.apprvlNb;
    }

}
