//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pain_002_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceType3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SequenceType3Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FRST"/>
 *     &lt;enumeration value="RCUR"/>
 *     &lt;enumeration value="FNAL"/>
 *     &lt;enumeration value="OOFF"/>
 *     &lt;enumeration value="RPRE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SequenceType3Code")
@XmlEnum
public enum SequenceType3Code {

    FRST,
    RCUR,
    FNAL,
    OOFF,
    RPRE;

    public String value() {
        return name();
    }

    public static SequenceType3Code fromValue(String v) {
        return valueOf(v);
    }

}
