//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pacs_002_001;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberOfTransactionsPerStatus5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberOfTransactionsPerStatus5">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DtldNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.11}Max15NumericText"/>
 *         &lt;element name="DtldSts" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.11}ExternalPaymentTransactionStatus1Code"/>
 *         &lt;element name="DtldCtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pacs.002.001.11}DecimalNumber" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfTransactionsPerStatus5", propOrder = {
    "dtldNbOfTxs",
    "dtldSts",
    "dtldCtrlSum"
})
public class NumberOfTransactionsPerStatus5 {

    @XmlElement(name = "DtldNbOfTxs", required = true)
    protected String dtldNbOfTxs;
    @XmlElement(name = "DtldSts", required = true)
    protected String dtldSts;
    @XmlElement(name = "DtldCtrlSum")
    protected BigDecimal dtldCtrlSum;

    /**
     * Gets the value of the dtldNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldNbOfTxs() {
        return dtldNbOfTxs;
    }

    /**
     * Sets the value of the dtldNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtldNbOfTxs(String value) {
        this.dtldNbOfTxs = value;
    }

    /**
     * Gets the value of the dtldSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtldSts() {
        return dtldSts;
    }

    /**
     * Sets the value of the dtldSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtldSts(String value) {
        this.dtldSts = value;
    }

    /**
     * Gets the value of the dtldCtrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDtldCtrlSum() {
        return dtldCtrlSum;
    }

    /**
     * Sets the value of the dtldCtrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDtldCtrlSum(BigDecimal value) {
        this.dtldCtrlSum = value;
    }

}
