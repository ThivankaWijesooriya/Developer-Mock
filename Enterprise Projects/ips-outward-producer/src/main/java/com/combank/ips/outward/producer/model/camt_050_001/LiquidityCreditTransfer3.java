//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_050_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_050_001.Amount2Choice;
import iso.std.iso._20022.tech.xsd.camt_050_001.BranchAndFinancialInstitutionIdentification6;
import iso.std.iso._20022.tech.xsd.camt_050_001.CashAccount40;
import iso.std.iso._20022.tech.xsd.camt_050_001.PaymentIdentification8;


/**
 * <p>Java class for LiquidityCreditTransfer3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LiquidityCreditTransfer3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LqdtyTrfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}PaymentIdentification8"/>
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}BranchAndFinancialInstitutionIdentification6"/>
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}CashAccount40"/>
 *         &lt;element name="TrfdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}Amount2Choice"/>
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}BranchAndFinancialInstitutionIdentification6"/>
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}CashAccount40"/>
 *         &lt;element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.050.001.06}ISODate" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityCreditTransfer3", propOrder = {
    "lqdtyTrfId",
    "cdtr",
    "cdtrAcct",
    "trfdAmt",
    "dbtr",
    "dbtrAcct"
})
public class LiquidityCreditTransfer3 {

    @XmlElement(name = "LqdtyTrfId", required = true)
    protected PaymentIdentification8 lqdtyTrfId;
    @XmlElement(name = "Cdtr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "TrfdAmt", required = true)
    protected Amount2Choice trfdAmt;
    @XmlElement(name = "Dbtr", required = true)
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct", required = true)
    protected CashAccount40 dbtrAcct;

    /**
     * Gets the value of the lqdtyTrfId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public PaymentIdentification8 getLqdtyTrfId() {
        return lqdtyTrfId;
    }

    /**
     * Sets the value of the lqdtyTrfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public void setLqdtyTrfId(PaymentIdentification8 value) {
        this.lqdtyTrfId = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the trfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getTrfdAmt() {
        return trfdAmt;
    }

    /**
     * Sets the value of the trfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setTrfdAmt(Amount2Choice value) {
        this.trfdAmt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

}
