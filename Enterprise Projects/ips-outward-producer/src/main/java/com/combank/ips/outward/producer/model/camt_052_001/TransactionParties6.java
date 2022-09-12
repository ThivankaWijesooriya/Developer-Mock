//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_052_001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_052_001.CashAccount38;
import iso.std.iso._20022.tech.xsd.camt_052_001.Party40Choice;
import iso.std.iso._20022.tech.xsd.camt_052_001.ProprietaryParty5;


/**
 * <p>Java class for TransactionParties6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionParties6">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}CashAccount38" minOccurs="0"/>
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}CashAccount38" minOccurs="0"/>
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="TradgPty" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}Party40Choice" minOccurs="0"/>
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.08}ProprietaryParty5" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionParties6", propOrder = {
    "initgPty",
    "dbtr",
    "dbtrAcct",
    "ultmtDbtr",
    "cdtr",
    "cdtrAcct",
    "ultmtCdtr",
    "tradgPty",
    "prtry"
})
public class TransactionParties6 {

    @XmlElement(name = "InitgPty")
    protected Party40Choice initgPty;
    @XmlElement(name = "Dbtr")
    protected Party40Choice dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "UltmtDbtr")
    protected Party40Choice ultmtDbtr;
    @XmlElement(name = "Cdtr")
    protected Party40Choice cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "UltmtCdtr")
    protected Party40Choice ultmtCdtr;
    @XmlElement(name = "TradgPty")
    protected Party40Choice tradgPty;
    @XmlElement(name = "Prtry")
    protected List<ProprietaryParty5> prtry;

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setInitgPty(Party40Choice value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setDbtr(Party40Choice value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the ultmtDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Sets the value of the ultmtDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setUltmtDbtr(Party40Choice value) {
        this.ultmtDbtr = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setCdtr(Party40Choice value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the ultmtCdtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Sets the value of the ultmtCdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setUltmtCdtr(Party40Choice value) {
        this.ultmtCdtr = value;
    }

    /**
     * Gets the value of the tradgPty property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getTradgPty() {
        return tradgPty;
    }

    /**
     * Sets the value of the tradgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setTradgPty(Party40Choice value) {
        this.tradgPty = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryParty5 }
     * 
     * 
     */
    public List<ProprietaryParty5> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<ProprietaryParty5>();
        }
        return this.prtry;
    }

}
