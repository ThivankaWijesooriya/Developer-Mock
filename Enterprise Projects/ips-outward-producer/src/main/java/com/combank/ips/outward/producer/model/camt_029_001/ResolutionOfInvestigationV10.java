//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_029_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_029_001.CaseAssignment5;
import iso.std.iso._20022.tech.xsd.camt_029_001.InvestigationStatus5Choice;
import iso.std.iso._20022.tech.xsd.camt_029_001.UnderlyingTransaction25;


/**
 * <p>Java class for ResolutionOfInvestigationV10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResolutionOfInvestigationV10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assgnmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}CaseAssignment5"/>
 *         &lt;element name="RslvdCase" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}Case5" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}InvestigationStatus5Choice"/>
 *         &lt;element name="CxlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}UnderlyingTransaction25"/>
 *         &lt;element name="ModDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}PaymentTransaction116" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="ClmNonRctDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}ClaimNonReceipt2Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="StmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}StatementResolutionEntry4" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="CrrctnTx" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}CorrectiveTransaction4Choice" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="RsltnRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}ResolutionData2" maxOccurs="0" minOccurs="0"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.029.001.10}SupplementaryData1" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResolutionOfInvestigationV10", propOrder = {
    "assgnmt",
    "sts",
    "cxlDtls"
})
public class ResolutionOfInvestigationV10 {

    @XmlElement(name = "Assgnmt", required = true)
    protected CaseAssignment5 assgnmt;
    @XmlElement(name = "Sts", required = true)
    protected InvestigationStatus5Choice sts;
    @XmlElement(name = "CxlDtls", required = true)
    protected UnderlyingTransaction25 cxlDtls;

    /**
     * Gets the value of the assgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAssignment5 }
     *     
     */
    public CaseAssignment5 getAssgnmt() {
        return assgnmt;
    }

    /**
     * Sets the value of the assgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAssignment5 }
     *     
     */
    public void setAssgnmt(CaseAssignment5 value) {
        this.assgnmt = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public InvestigationStatus5Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus5Choice }
     *     
     */
    public void setSts(InvestigationStatus5Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the cxlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingTransaction25 }
     *     
     */
    public UnderlyingTransaction25 getCxlDtls() {
        return cxlDtls;
    }

    /**
     * Sets the value of the cxlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingTransaction25 }
     *     
     */
    public void setCxlDtls(UnderlyingTransaction25 value) {
        this.cxlDtls = value;
    }

}
