//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_054_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardholderVerificationCapability1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MNSG"/>
 *     &lt;enumeration value="NPIN"/>
 *     &lt;enumeration value="FCPN"/>
 *     &lt;enumeration value="FEPN"/>
 *     &lt;enumeration value="FDSG"/>
 *     &lt;enumeration value="FBIO"/>
 *     &lt;enumeration value="MNVR"/>
 *     &lt;enumeration value="FBIG"/>
 *     &lt;enumeration value="APKI"/>
 *     &lt;enumeration value="PKIS"/>
 *     &lt;enumeration value="CHDT"/>
 *     &lt;enumeration value="SCEC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability1Code")
@XmlEnum
public enum CardholderVerificationCapability1Code {

    MNSG,
    NPIN,
    FCPN,
    FEPN,
    FDSG,
    FBIO,
    MNVR,
    FBIG,
    APKI,
    PKIS,
    CHDT,
    SCEC;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability1Code fromValue(String v) {
        return valueOf(v);
    }

}
