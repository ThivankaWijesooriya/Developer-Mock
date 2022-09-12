//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pacs_028_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import iso.std.iso._20022.tech.xsd.pacs_028_001.BranchAndFinancialInstitutionIdentification6;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CashAccount38;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Frequency36Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateSetupReason1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PartyIdentification135;


/**
 * <p>Java class for AmendmentInformationDetails13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmendmentInformationDetails13">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrgnlMndtId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}Max35Text" minOccurs="0"/>
 *         &lt;element name="OrgnlCdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="OrgnlCdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="OrgnlCdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}CashAccount38" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}PartyIdentification135" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}CashAccount38" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         &lt;element name="OrgnlDbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}CashAccount38" minOccurs="0"/>
 *         &lt;element name="OrgnlFnlColltnDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}ISODate" minOccurs="0"/>
 *         &lt;element name="OrgnlFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}Frequency36Choice" minOccurs="0"/>
 *         &lt;element name="OrgnlRsn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}MandateSetupReason1Choice" minOccurs="0"/>
 *         &lt;element name="OrgnlTrckgDays" type="{urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04}Exact2NumericText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmendmentInformationDetails13", propOrder = {
    "orgnlMndtId",
    "orgnlCdtrSchmeId",
    "orgnlCdtrAgt",
    "orgnlCdtrAgtAcct",
    "orgnlDbtr",
    "orgnlDbtrAcct",
    "orgnlDbtrAgt",
    "orgnlDbtrAgtAcct",
    "orgnlFnlColltnDt",
    "orgnlFrqcy",
    "orgnlRsn",
    "orgnlTrckgDays"
})
public class AmendmentInformationDetails13 {

    @XmlElement(name = "OrgnlMndtId")
    protected String orgnlMndtId;
    @XmlElement(name = "OrgnlCdtrSchmeId")
    protected PartyIdentification135 orgnlCdtrSchmeId;
    @XmlElement(name = "OrgnlCdtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlCdtrAgt;
    @XmlElement(name = "OrgnlCdtrAgtAcct")
    protected CashAccount38 orgnlCdtrAgtAcct;
    @XmlElement(name = "OrgnlDbtr")
    protected PartyIdentification135 orgnlDbtr;
    @XmlElement(name = "OrgnlDbtrAcct")
    protected CashAccount38 orgnlDbtrAcct;
    @XmlElement(name = "OrgnlDbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 orgnlDbtrAgt;
    @XmlElement(name = "OrgnlDbtrAgtAcct")
    protected CashAccount38 orgnlDbtrAgtAcct;
    @XmlElement(name = "OrgnlFnlColltnDt")
    protected XMLGregorianCalendar orgnlFnlColltnDt;
    @XmlElement(name = "OrgnlFrqcy")
    protected Frequency36Choice orgnlFrqcy;
    @XmlElement(name = "OrgnlRsn")
    protected MandateSetupReason1Choice orgnlRsn;
    @XmlElement(name = "OrgnlTrckgDays")
    protected String orgnlTrckgDays;

    /**
     * Gets the value of the orgnlMndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMndtId() {
        return orgnlMndtId;
    }

    /**
     * Sets the value of the orgnlMndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMndtId(String value) {
        this.orgnlMndtId = value;
    }

    /**
     * Gets the value of the orgnlCdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getOrgnlCdtrSchmeId() {
        return orgnlCdtrSchmeId;
    }

    /**
     * Sets the value of the orgnlCdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setOrgnlCdtrSchmeId(PartyIdentification135 value) {
        this.orgnlCdtrSchmeId = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlCdtrAgt() {
        return orgnlCdtrAgt;
    }

    /**
     * Sets the value of the orgnlCdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setOrgnlCdtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlCdtrAgt = value;
    }

    /**
     * Gets the value of the orgnlCdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getOrgnlCdtrAgtAcct() {
        return orgnlCdtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlCdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setOrgnlCdtrAgtAcct(CashAccount38 value) {
        this.orgnlCdtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getOrgnlDbtr() {
        return orgnlDbtr;
    }

    /**
     * Sets the value of the orgnlDbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setOrgnlDbtr(PartyIdentification135 value) {
        this.orgnlDbtr = value;
    }

    /**
     * Gets the value of the orgnlDbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getOrgnlDbtrAcct() {
        return orgnlDbtrAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setOrgnlDbtrAcct(CashAccount38 value) {
        this.orgnlDbtrAcct = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getOrgnlDbtrAgt() {
        return orgnlDbtrAgt;
    }

    /**
     * Sets the value of the orgnlDbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setOrgnlDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.orgnlDbtrAgt = value;
    }

    /**
     * Gets the value of the orgnlDbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getOrgnlDbtrAgtAcct() {
        return orgnlDbtrAgtAcct;
    }

    /**
     * Sets the value of the orgnlDbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setOrgnlDbtrAgtAcct(CashAccount38 value) {
        this.orgnlDbtrAgtAcct = value;
    }

    /**
     * Gets the value of the orgnlFnlColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlFnlColltnDt() {
        return orgnlFnlColltnDt;
    }

    /**
     * Sets the value of the orgnlFnlColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlFnlColltnDt(XMLGregorianCalendar value) {
        this.orgnlFnlColltnDt = value;
    }

    /**
     * Gets the value of the orgnlFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency36Choice }
     *     
     */
    public Frequency36Choice getOrgnlFrqcy() {
        return orgnlFrqcy;
    }

    /**
     * Sets the value of the orgnlFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency36Choice }
     *     
     */
    public void setOrgnlFrqcy(Frequency36Choice value) {
        this.orgnlFrqcy = value;
    }

    /**
     * Gets the value of the orgnlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getOrgnlRsn() {
        return orgnlRsn;
    }

    /**
     * Sets the value of the orgnlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public void setOrgnlRsn(MandateSetupReason1Choice value) {
        this.orgnlRsn = value;
    }

    /**
     * Gets the value of the orgnlTrckgDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlTrckgDays() {
        return orgnlTrckgDays;
    }

    /**
     * Sets the value of the orgnlTrckgDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlTrckgDays(String value) {
        this.orgnlTrckgDays = value;
    }

}
