//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_053_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentServiceType2Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType2Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AGGR"/>
 *     &lt;enumeration value="DCCV"/>
 *     &lt;enumeration value="GRTT"/>
 *     &lt;enumeration value="INSP"/>
 *     &lt;enumeration value="LOYT"/>
 *     &lt;enumeration value="NRES"/>
 *     &lt;enumeration value="PUCO"/>
 *     &lt;enumeration value="RECP"/>
 *     &lt;enumeration value="SOAF"/>
 *     &lt;enumeration value="UNAF"/>
 *     &lt;enumeration value="VCAU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType2Code")
@XmlEnum
public enum CardPaymentServiceType2Code {

    AGGR,
    DCCV,
    GRTT,
    INSP,
    LOYT,
    NRES,
    PUCO,
    RECP,
    SOAF,
    UNAF,
    VCAU;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
