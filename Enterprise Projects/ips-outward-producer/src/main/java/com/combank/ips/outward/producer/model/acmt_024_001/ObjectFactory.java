//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.acmt_024_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import iso.std.iso._20022.tech.xsd.acmt_024_001.AccountIdentification4Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.AccountSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.BranchAndFinancialInstitutionIdentification5;
import iso.std.iso._20022.tech.xsd.acmt_024_001.BranchData2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.ClearingSystemIdentification2Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.ClearingSystemMemberIdentification2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.ContactDetails2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.DateAndPlaceOfBirth;
import iso.std.iso._20022.tech.xsd.acmt_024_001.Document;
import iso.std.iso._20022.tech.xsd.acmt_024_001.FinancialIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.FinancialInstitutionIdentification8;
import iso.std.iso._20022.tech.xsd.acmt_024_001.GenericAccountIdentification1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.GenericFinancialIdentification1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.GenericOrganisationIdentification1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.GenericPersonIdentification1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.IdentificationAssignment2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.IdentificationInformation2;
import iso.std.iso._20022.tech.xsd.acmt_024_001.IdentificationVerificationReportV02;
import iso.std.iso._20022.tech.xsd.acmt_024_001.MessageIdentification5;
import iso.std.iso._20022.tech.xsd.acmt_024_001.OrganisationIdentification8;
import iso.std.iso._20022.tech.xsd.acmt_024_001.OrganisationIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.Party11Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.Party12Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.PartyIdentification43;
import iso.std.iso._20022.tech.xsd.acmt_024_001.PersonIdentification5;
import iso.std.iso._20022.tech.xsd.acmt_024_001.PersonIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.PostalAddress6;
import iso.std.iso._20022.tech.xsd.acmt_024_001.SupplementaryData1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.SupplementaryDataEnvelope1;
import iso.std.iso._20022.tech.xsd.acmt_024_001.VerificationReason1Choice;
import iso.std.iso._20022.tech.xsd.acmt_024_001.VerificationReport2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iso.std.iso._20022.tech.xsd.acmt_024_001 package. 
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

    private final static QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iso.std.iso._20022.tech.xsd.acmt_024_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
    }

    /**
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification5 }
     * 
     */
    public BranchAndFinancialInstitutionIdentification5 createBranchAndFinancialInstitutionIdentification5() {
        return new BranchAndFinancialInstitutionIdentification5();
    }

    /**
     * Create an instance of {@link VerificationReport2 }
     * 
     */
    public VerificationReport2 createVerificationReport2() {
        return new VerificationReport2();
    }

    /**
     * Create an instance of {@link BranchData2 }
     * 
     */
    public BranchData2 createBranchData2() {
        return new BranchData2();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link Party11Choice }
     * 
     */
    public Party11Choice createParty11Choice() {
        return new Party11Choice();
    }

    /**
     * Create an instance of {@link PersonIdentification5 }
     * 
     */
    public PersonIdentification5 createPersonIdentification5() {
        return new PersonIdentification5();
    }

    /**
     * Create an instance of {@link IdentificationVerificationReportV02 }
     * 
     */
    public IdentificationVerificationReportV02 createIdentificationVerificationReportV02() {
        return new IdentificationVerificationReportV02();
    }

    /**
     * Create an instance of {@link AccountSchemeName1Choice }
     * 
     */
    public AccountSchemeName1Choice createAccountSchemeName1Choice() {
        return new AccountSchemeName1Choice();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
    }

    /**
     * Create an instance of {@link PostalAddress6 }
     * 
     */
    public PostalAddress6 createPostalAddress6() {
        return new PostalAddress6();
    }

    /**
     * Create an instance of {@link SupplementaryDataEnvelope1 }
     * 
     */
    public SupplementaryDataEnvelope1 createSupplementaryDataEnvelope1() {
        return new SupplementaryDataEnvelope1();
    }

    /**
     * Create an instance of {@link IdentificationAssignment2 }
     * 
     */
    public IdentificationAssignment2 createIdentificationAssignment2() {
        return new IdentificationAssignment2();
    }

    /**
     * Create an instance of {@link PartyIdentification43 }
     * 
     */
    public PartyIdentification43 createPartyIdentification43() {
        return new PartyIdentification43();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link MessageIdentification5 }
     * 
     */
    public MessageIdentification5 createMessageIdentification5() {
        return new MessageIdentification5();
    }

    /**
     * Create an instance of {@link GenericAccountIdentification1 }
     * 
     */
    public GenericAccountIdentification1 createGenericAccountIdentification1() {
        return new GenericAccountIdentification1();
    }

    /**
     * Create an instance of {@link IdentificationInformation2 }
     * 
     */
    public IdentificationInformation2 createIdentificationInformation2() {
        return new IdentificationInformation2();
    }

    /**
     * Create an instance of {@link ContactDetails2 }
     * 
     */
    public ContactDetails2 createContactDetails2() {
        return new ContactDetails2();
    }

    /**
     * Create an instance of {@link OrganisationIdentificationSchemeName1Choice }
     * 
     */
    public OrganisationIdentificationSchemeName1Choice createOrganisationIdentificationSchemeName1Choice() {
        return new OrganisationIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link Party12Choice }
     * 
     */
    public Party12Choice createParty12Choice() {
        return new Party12Choice();
    }

    /**
     * Create an instance of {@link VerificationReason1Choice }
     * 
     */
    public VerificationReason1Choice createVerificationReason1Choice() {
        return new VerificationReason1Choice();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification8 }
     * 
     */
    public FinancialInstitutionIdentification8 createFinancialInstitutionIdentification8() {
        return new FinancialInstitutionIdentification8();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth }
     * 
     */
    public DateAndPlaceOfBirth createDateAndPlaceOfBirth() {
        return new DateAndPlaceOfBirth();
    }

    /**
     * Create an instance of {@link OrganisationIdentification8 }
     * 
     */
    public OrganisationIdentification8 createOrganisationIdentification8() {
        return new OrganisationIdentification8();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.024.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
