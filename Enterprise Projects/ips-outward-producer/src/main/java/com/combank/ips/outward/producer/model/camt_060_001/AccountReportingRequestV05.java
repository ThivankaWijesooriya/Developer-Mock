//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_060_001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import iso.std.iso._20022.tech.xsd.camt_060_001.GroupHeader77;
import iso.std.iso._20022.tech.xsd.camt_060_001.ReportingRequest5;


/**
 * <p>Java class for AccountReportingRequestV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountReportingRequestV05">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}GroupHeader77"/>
 *         &lt;element name="RptgReq" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}ReportingRequest5"/>
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.060.001.05}SupplementaryData1" maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReportingRequestV05", propOrder = {
    "grpHdr",
    "rptgReq"
})
public class AccountReportingRequestV05 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader77 grpHdr;
    @XmlElement(name = "RptgReq", required = true)
    protected ReportingRequest5 rptgReq;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader77 }
     *     
     */
    public GroupHeader77 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader77 }
     *     
     */
    public void setGrpHdr(GroupHeader77 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the rptgReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingRequest5 }
     *     
     */
    public ReportingRequest5 getRptgReq() {
        return rptgReq;
    }

    /**
     * Sets the value of the rptgReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingRequest5 }
     *     
     */
    public void setRptgReq(ReportingRequest5 value) {
        this.rptgReq = value;
    }

}
