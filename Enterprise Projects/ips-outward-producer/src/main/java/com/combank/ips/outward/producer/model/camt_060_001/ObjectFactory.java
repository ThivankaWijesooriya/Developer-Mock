//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.camt_060_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import iso.std.iso._20022.tech.xsd.camt_060_001.AccountIdentification4Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.AccountReportingRequestV05;
import iso.std.iso._20022.tech.xsd.camt_060_001.AccountSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.ActiveOrHistoricCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.camt_060_001.AddressType3Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.BalanceSubType1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.BalanceType10Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.BalanceType13;
import iso.std.iso._20022.tech.xsd.camt_060_001.BranchAndFinancialInstitutionIdentification6;
import iso.std.iso._20022.tech.xsd.camt_060_001.BranchData3;
import iso.std.iso._20022.tech.xsd.camt_060_001.CashAccount38;
import iso.std.iso._20022.tech.xsd.camt_060_001.CashAccountType2Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.ClearingSystemIdentification2Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.ClearingSystemMemberIdentification2;
import iso.std.iso._20022.tech.xsd.camt_060_001.Contact4;
import iso.std.iso._20022.tech.xsd.camt_060_001.DateAndPlaceOfBirth1;
import iso.std.iso._20022.tech.xsd.camt_060_001.DatePeriodDetails1;
import iso.std.iso._20022.tech.xsd.camt_060_001.Document;
import iso.std.iso._20022.tech.xsd.camt_060_001.EntryStatus1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.FinancialIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.FinancialInstitutionIdentification18;
import iso.std.iso._20022.tech.xsd.camt_060_001.GenericAccountIdentification1;
import iso.std.iso._20022.tech.xsd.camt_060_001.GenericFinancialIdentification1;
import iso.std.iso._20022.tech.xsd.camt_060_001.GenericIdentification30;
import iso.std.iso._20022.tech.xsd.camt_060_001.GenericOrganisationIdentification1;
import iso.std.iso._20022.tech.xsd.camt_060_001.GenericPersonIdentification1;
import iso.std.iso._20022.tech.xsd.camt_060_001.GroupHeader77;
import iso.std.iso._20022.tech.xsd.camt_060_001.Limit2;
import iso.std.iso._20022.tech.xsd.camt_060_001.OrganisationIdentification29;
import iso.std.iso._20022.tech.xsd.camt_060_001.OrganisationIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.OtherContact1;
import iso.std.iso._20022.tech.xsd.camt_060_001.Party38Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.Party40Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.PartyIdentification135;
import iso.std.iso._20022.tech.xsd.camt_060_001.PersonIdentification13;
import iso.std.iso._20022.tech.xsd.camt_060_001.PersonIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.PostalAddress24;
import iso.std.iso._20022.tech.xsd.camt_060_001.ProxyAccountIdentification1;
import iso.std.iso._20022.tech.xsd.camt_060_001.ProxyAccountType1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.ReportingPeriod2;
import iso.std.iso._20022.tech.xsd.camt_060_001.ReportingRequest5;
import iso.std.iso._20022.tech.xsd.camt_060_001.SequenceRange1;
import iso.std.iso._20022.tech.xsd.camt_060_001.SequenceRange1Choice;
import iso.std.iso._20022.tech.xsd.camt_060_001.SupplementaryData1;
import iso.std.iso._20022.tech.xsd.camt_060_001.SupplementaryDataEnvelope1;
import iso.std.iso._20022.tech.xsd.camt_060_001.TimePeriodDetails1;
import iso.std.iso._20022.tech.xsd.camt_060_001.TransactionType2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iso.std.iso._20022.tech.xsd.camt_060_001 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:camt.060.001.05", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iso.std.iso._20022.tech.xsd.camt_060_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericAccountIdentification1 }
     * 
     */
    public GenericAccountIdentification1 createGenericAccountIdentification1() {
        return new GenericAccountIdentification1();
    }

    /**
     * Create an instance of {@link TransactionType2 }
     * 
     */
    public TransactionType2 createTransactionType2() {
        return new TransactionType2();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link PartyIdentification135 }
     * 
     */
    public PartyIdentification135 createPartyIdentification135() {
        return new PartyIdentification135();
    }

    /**
     * Create an instance of {@link Party40Choice }
     * 
     */
    public Party40Choice createParty40Choice() {
        return new Party40Choice();
    }

    /**
     * Create an instance of {@link OrganisationIdentification29 }
     * 
     */
    public OrganisationIdentification29 createOrganisationIdentification29() {
        return new OrganisationIdentification29();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification18 }
     * 
     */
    public FinancialInstitutionIdentification18 createFinancialInstitutionIdentification18() {
        return new FinancialInstitutionIdentification18();
    }

    /**
     * Create an instance of {@link CashAccountType2Choice }
     * 
     */
    public CashAccountType2Choice createCashAccountType2Choice() {
        return new CashAccountType2Choice();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link SupplementaryDataEnvelope1 }
     * 
     */
    public SupplementaryDataEnvelope1 createSupplementaryDataEnvelope1() {
        return new SupplementaryDataEnvelope1();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link AddressType3Choice }
     * 
     */
    public AddressType3Choice createAddressType3Choice() {
        return new AddressType3Choice();
    }

    /**
     * Create an instance of {@link PostalAddress24 }
     * 
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link ReportingPeriod2 }
     * 
     */
    public ReportingPeriod2 createReportingPeriod2() {
        return new ReportingPeriod2();
    }

    /**
     * Create an instance of {@link SequenceRange1 }
     * 
     */
    public SequenceRange1 createSequenceRange1() {
        return new SequenceRange1();
    }

    /**
     * Create an instance of {@link Party38Choice }
     * 
     */
    public Party38Choice createParty38Choice() {
        return new Party38Choice();
    }

    /**
     * Create an instance of {@link AccountSchemeName1Choice }
     * 
     */
    public AccountSchemeName1Choice createAccountSchemeName1Choice() {
        return new AccountSchemeName1Choice();
    }

    /**
     * Create an instance of {@link Limit2 }
     * 
     */
    public Limit2 createLimit2() {
        return new Limit2();
    }

    /**
     * Create an instance of {@link ReportingRequest5 }
     * 
     */
    public ReportingRequest5 createReportingRequest5() {
        return new ReportingRequest5();
    }

    /**
     * Create an instance of {@link OtherContact1 }
     * 
     */
    public OtherContact1 createOtherContact1() {
        return new OtherContact1();
    }

    /**
     * Create an instance of {@link GroupHeader77 }
     * 
     */
    public GroupHeader77 createGroupHeader77() {
        return new GroupHeader77();
    }

    /**
     * Create an instance of {@link PersonIdentification13 }
     * 
     */
    public PersonIdentification13 createPersonIdentification13() {
        return new PersonIdentification13();
    }

    /**
     * Create an instance of {@link BalanceType13 }
     * 
     */
    public BalanceType13 createBalanceType13() {
        return new BalanceType13();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth1 }
     * 
     */
    public DateAndPlaceOfBirth1 createDateAndPlaceOfBirth1() {
        return new DateAndPlaceOfBirth1();
    }

    /**
     * Create an instance of {@link CashAccount38 }
     * 
     */
    public CashAccount38 createCashAccount38() {
        return new CashAccount38();
    }

    /**
     * Create an instance of {@link BranchData3 }
     * 
     */
    public BranchData3 createBranchData3() {
        return new BranchData3();
    }

    /**
     * Create an instance of {@link BalanceType10Choice }
     * 
     */
    public BalanceType10Choice createBalanceType10Choice() {
        return new BalanceType10Choice();
    }

    /**
     * Create an instance of {@link ProxyAccountType1Choice }
     * 
     */
    public ProxyAccountType1Choice createProxyAccountType1Choice() {
        return new ProxyAccountType1Choice();
    }

    /**
     * Create an instance of {@link Contact4 }
     * 
     */
    public Contact4 createContact4() {
        return new Contact4();
    }

    /**
     * Create an instance of {@link BalanceSubType1Choice }
     * 
     */
    public BalanceSubType1Choice createBalanceSubType1Choice() {
        return new BalanceSubType1Choice();
    }

    /**
     * Create an instance of {@link ProxyAccountIdentification1 }
     * 
     */
    public ProxyAccountIdentification1 createProxyAccountIdentification1() {
        return new ProxyAccountIdentification1();
    }

    /**
     * Create an instance of {@link AccountReportingRequestV05 }
     * 
     */
    public AccountReportingRequestV05 createAccountReportingRequestV05() {
        return new AccountReportingRequestV05();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
    }

    /**
     * Create an instance of {@link EntryStatus1Choice }
     * 
     */
    public EntryStatus1Choice createEntryStatus1Choice() {
        return new EntryStatus1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link TimePeriodDetails1 }
     * 
     */
    public TimePeriodDetails1 createTimePeriodDetails1() {
        return new TimePeriodDetails1();
    }

    /**
     * Create an instance of {@link DatePeriodDetails1 }
     * 
     */
    public DatePeriodDetails1 createDatePeriodDetails1() {
        return new DatePeriodDetails1();
    }

    /**
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
    }

    /**
     * Create an instance of {@link SequenceRange1Choice }
     * 
     */
    public SequenceRange1Choice createSequenceRange1Choice() {
        return new SequenceRange1Choice();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     */
    public BranchAndFinancialInstitutionIdentification6 createBranchAndFinancialInstitutionIdentification6() {
        return new BranchAndFinancialInstitutionIdentification6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.060.001.05", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}