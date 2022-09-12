//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.08.22 at 12:41:17 AM IST 
//


package com.combank.ips.outward.producer.model.pacs_028_001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import iso.std.iso._20022.tech.xsd.pacs_028_001.AccountIdentification4Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.AccountSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ActiveOrHistoricCurrencyAndAmount;
import iso.std.iso._20022.tech.xsd.pacs_028_001.AddressType3Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.AmendmentInformationDetails13;
import iso.std.iso._20022.tech.xsd.pacs_028_001.AmountType4Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.BranchAndFinancialInstitutionIdentification6;
import iso.std.iso._20022.tech.xsd.pacs_028_001.BranchData3;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CashAccount38;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CashAccountType2Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CategoryPurpose1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ClearingSystemIdentification2Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ClearingSystemIdentification3Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ClearingSystemMemberIdentification2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Contact4;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CreditTransferMandateData1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CreditorReferenceInformation2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CreditorReferenceType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.CreditorReferenceType2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DateAndDateTime2Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DateAndPlaceOfBirth1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DatePeriod2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DiscountAmountAndType1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DiscountAmountType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Document;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DocumentAdjustment1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DocumentLineIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DocumentLineInformation1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DocumentLineType1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.DocumentLineType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.EquivalentAmount2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.FIToFIPaymentStatusRequestV04;
import iso.std.iso._20022.tech.xsd.pacs_028_001.FinancialIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.FinancialInstitutionIdentification18;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Frequency36Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.FrequencyAndMoment1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.FrequencyPeriod1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Garnishment3;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GarnishmentType1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GarnishmentType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GenericAccountIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GenericFinancialIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GenericIdentification30;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GenericOrganisationIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GenericPersonIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.GroupHeader91;
import iso.std.iso._20022.tech.xsd.pacs_028_001.LocalInstrument2Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateClassification1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateRelatedData1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateRelatedInformation14;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateSetupReason1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.MandateTypeInformation2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OrganisationIdentification29;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OrganisationIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OriginalGroupInformation27;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OriginalGroupInformation29;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OriginalTransactionReference31;
import iso.std.iso._20022.tech.xsd.pacs_028_001.OtherContact1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Party38Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Party40Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PartyIdentification135;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PaymentTransaction121;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PaymentTypeInformation27;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PersonIdentification13;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PersonIdentificationSchemeName1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.PostalAddress24;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ProxyAccountIdentification1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ProxyAccountType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.Purpose2Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ReferredDocumentInformation7;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ReferredDocumentType3Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ReferredDocumentType4;
import iso.std.iso._20022.tech.xsd.pacs_028_001.RemittanceAmount2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.RemittanceAmount3;
import iso.std.iso._20022.tech.xsd.pacs_028_001.RemittanceInformation16;
import iso.std.iso._20022.tech.xsd.pacs_028_001.ServiceLevel8Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.SettlementInstruction7;
import iso.std.iso._20022.tech.xsd.pacs_028_001.StructuredRemittanceInformation16;
import iso.std.iso._20022.tech.xsd.pacs_028_001.SupplementaryData1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.SupplementaryDataEnvelope1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxAmount2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxAmountAndType1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxAmountType1Choice;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxAuthorisation1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxInformation7;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxParty1;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxParty2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxPeriod2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxRecord2;
import iso.std.iso._20022.tech.xsd.pacs_028_001.TaxRecordDetails2;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the iso.std.iso._20022.tech.xsd.pacs_028_001 package. 
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

    private final static QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: iso.std.iso._20022.tech.xsd.pacs_028_001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressType3Choice }
     * 
     */
    public AddressType3Choice createAddressType3Choice() {
        return new AddressType3Choice();
    }

    /**
     * Create an instance of {@link Frequency36Choice }
     * 
     */
    public Frequency36Choice createFrequency36Choice() {
        return new Frequency36Choice();
    }

    /**
     * Create an instance of {@link AccountIdentification4Choice }
     * 
     */
    public AccountIdentification4Choice createAccountIdentification4Choice() {
        return new AccountIdentification4Choice();
    }

    /**
     * Create an instance of {@link Purpose2Choice }
     * 
     */
    public Purpose2Choice createPurpose2Choice() {
        return new Purpose2Choice();
    }

    /**
     * Create an instance of {@link StructuredRemittanceInformation16 }
     * 
     */
    public StructuredRemittanceInformation16 createStructuredRemittanceInformation16() {
        return new StructuredRemittanceInformation16();
    }

    /**
     * Create an instance of {@link DocumentAdjustment1 }
     * 
     */
    public DocumentAdjustment1 createDocumentAdjustment1() {
        return new DocumentAdjustment1();
    }

    /**
     * Create an instance of {@link DateAndDateTime2Choice }
     * 
     */
    public DateAndDateTime2Choice createDateAndDateTime2Choice() {
        return new DateAndDateTime2Choice();
    }

    /**
     * Create an instance of {@link ReferredDocumentInformation7 }
     * 
     */
    public ReferredDocumentInformation7 createReferredDocumentInformation7() {
        return new ReferredDocumentInformation7();
    }

    /**
     * Create an instance of {@link TaxAmountAndType1 }
     * 
     */
    public TaxAmountAndType1 createTaxAmountAndType1() {
        return new TaxAmountAndType1();
    }

    /**
     * Create an instance of {@link FIToFIPaymentStatusRequestV04 }
     * 
     */
    public FIToFIPaymentStatusRequestV04 createFIToFIPaymentStatusRequestV04() {
        return new FIToFIPaymentStatusRequestV04();
    }

    /**
     * Create an instance of {@link MandateRelatedInformation14 }
     * 
     */
    public MandateRelatedInformation14 createMandateRelatedInformation14() {
        return new MandateRelatedInformation14();
    }

    /**
     * Create an instance of {@link FinancialIdentificationSchemeName1Choice }
     * 
     */
    public FinancialIdentificationSchemeName1Choice createFinancialIdentificationSchemeName1Choice() {
        return new FinancialIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link ReferredDocumentType3Choice }
     * 
     */
    public ReferredDocumentType3Choice createReferredDocumentType3Choice() {
        return new ReferredDocumentType3Choice();
    }

    /**
     * Create an instance of {@link GarnishmentType1Choice }
     * 
     */
    public GarnishmentType1Choice createGarnishmentType1Choice() {
        return new GarnishmentType1Choice();
    }

    /**
     * Create an instance of {@link OriginalGroupInformation27 }
     * 
     */
    public OriginalGroupInformation27 createOriginalGroupInformation27() {
        return new OriginalGroupInformation27();
    }

    /**
     * Create an instance of {@link GarnishmentType1 }
     * 
     */
    public GarnishmentType1 createGarnishmentType1() {
        return new GarnishmentType1();
    }

    /**
     * Create an instance of {@link TaxAmountType1Choice }
     * 
     */
    public TaxAmountType1Choice createTaxAmountType1Choice() {
        return new TaxAmountType1Choice();
    }

    /**
     * Create an instance of {@link RemittanceAmount2 }
     * 
     */
    public RemittanceAmount2 createRemittanceAmount2() {
        return new RemittanceAmount2();
    }

    /**
     * Create an instance of {@link DateAndPlaceOfBirth1 }
     * 
     */
    public DateAndPlaceOfBirth1 createDateAndPlaceOfBirth1() {
        return new DateAndPlaceOfBirth1();
    }

    /**
     * Create an instance of {@link GenericAccountIdentification1 }
     * 
     */
    public GenericAccountIdentification1 createGenericAccountIdentification1() {
        return new GenericAccountIdentification1();
    }

    /**
     * Create an instance of {@link TaxAmount2 }
     * 
     */
    public TaxAmount2 createTaxAmount2() {
        return new TaxAmount2();
    }

    /**
     * Create an instance of {@link ProxyAccountType1Choice }
     * 
     */
    public ProxyAccountType1Choice createProxyAccountType1Choice() {
        return new ProxyAccountType1Choice();
    }

    /**
     * Create an instance of {@link CreditorReferenceInformation2 }
     * 
     */
    public CreditorReferenceInformation2 createCreditorReferenceInformation2() {
        return new CreditorReferenceInformation2();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link FinancialInstitutionIdentification18 }
     * 
     */
    public FinancialInstitutionIdentification18 createFinancialInstitutionIdentification18() {
        return new FinancialInstitutionIdentification18();
    }

    /**
     * Create an instance of {@link Party38Choice }
     * 
     */
    public Party38Choice createParty38Choice() {
        return new Party38Choice();
    }

    /**
     * Create an instance of {@link DocumentLineIdentification1 }
     * 
     */
    public DocumentLineIdentification1 createDocumentLineIdentification1() {
        return new DocumentLineIdentification1();
    }

    /**
     * Create an instance of {@link GenericFinancialIdentification1 }
     * 
     */
    public GenericFinancialIdentification1 createGenericFinancialIdentification1() {
        return new GenericFinancialIdentification1();
    }

    /**
     * Create an instance of {@link CreditTransferMandateData1 }
     * 
     */
    public CreditTransferMandateData1 createCreditTransferMandateData1() {
        return new CreditTransferMandateData1();
    }

    /**
     * Create an instance of {@link MandateTypeInformation2 }
     * 
     */
    public MandateTypeInformation2 createMandateTypeInformation2() {
        return new MandateTypeInformation2();
    }

    /**
     * Create an instance of {@link PaymentTypeInformation27 }
     * 
     */
    public PaymentTypeInformation27 createPaymentTypeInformation27() {
        return new PaymentTypeInformation27();
    }

    /**
     * Create an instance of {@link CreditorReferenceType2 }
     * 
     */
    public CreditorReferenceType2 createCreditorReferenceType2() {
        return new CreditorReferenceType2();
    }

    /**
     * Create an instance of {@link PersonIdentification13 }
     * 
     */
    public PersonIdentification13 createPersonIdentification13() {
        return new PersonIdentification13();
    }

    /**
     * Create an instance of {@link PostalAddress24 }
     * 
     */
    public PostalAddress24 createPostalAddress24() {
        return new PostalAddress24();
    }

    /**
     * Create an instance of {@link AccountSchemeName1Choice }
     * 
     */
    public AccountSchemeName1Choice createAccountSchemeName1Choice() {
        return new AccountSchemeName1Choice();
    }

    /**
     * Create an instance of {@link TaxRecordDetails2 }
     * 
     */
    public TaxRecordDetails2 createTaxRecordDetails2() {
        return new TaxRecordDetails2();
    }

    /**
     * Create an instance of {@link ServiceLevel8Choice }
     * 
     */
    public ServiceLevel8Choice createServiceLevel8Choice() {
        return new ServiceLevel8Choice();
    }

    /**
     * Create an instance of {@link RemittanceInformation16 }
     * 
     */
    public RemittanceInformation16 createRemittanceInformation16() {
        return new RemittanceInformation16();
    }

    /**
     * Create an instance of {@link Contact4 }
     * 
     */
    public Contact4 createContact4() {
        return new Contact4();
    }

    /**
     * Create an instance of {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     */
    public ActiveOrHistoricCurrencyAndAmount createActiveOrHistoricCurrencyAndAmount() {
        return new ActiveOrHistoricCurrencyAndAmount();
    }

    /**
     * Create an instance of {@link OrganisationIdentification29 }
     * 
     */
    public OrganisationIdentification29 createOrganisationIdentification29() {
        return new OrganisationIdentification29();
    }

    /**
     * Create an instance of {@link TaxParty1 }
     * 
     */
    public TaxParty1 createTaxParty1() {
        return new TaxParty1();
    }

    /**
     * Create an instance of {@link TaxInformation7 }
     * 
     */
    public TaxInformation7 createTaxInformation7() {
        return new TaxInformation7();
    }

    /**
     * Create an instance of {@link OriginalGroupInformation29 }
     * 
     */
    public OriginalGroupInformation29 createOriginalGroupInformation29() {
        return new OriginalGroupInformation29();
    }

    /**
     * Create an instance of {@link DocumentLineInformation1 }
     * 
     */
    public DocumentLineInformation1 createDocumentLineInformation1() {
        return new DocumentLineInformation1();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification3Choice }
     * 
     */
    public ClearingSystemIdentification3Choice createClearingSystemIdentification3Choice() {
        return new ClearingSystemIdentification3Choice();
    }

    /**
     * Create an instance of {@link DocumentLineType1Choice }
     * 
     */
    public DocumentLineType1Choice createDocumentLineType1Choice() {
        return new DocumentLineType1Choice();
    }

    /**
     * Create an instance of {@link FrequencyAndMoment1 }
     * 
     */
    public FrequencyAndMoment1 createFrequencyAndMoment1() {
        return new FrequencyAndMoment1();
    }

    /**
     * Create an instance of {@link TaxRecord2 }
     * 
     */
    public TaxRecord2 createTaxRecord2() {
        return new TaxRecord2();
    }

    /**
     * Create an instance of {@link DatePeriod2 }
     * 
     */
    public DatePeriod2 createDatePeriod2() {
        return new DatePeriod2();
    }

    /**
     * Create an instance of {@link SettlementInstruction7 }
     * 
     */
    public SettlementInstruction7 createSettlementInstruction7() {
        return new SettlementInstruction7();
    }

    /**
     * Create an instance of {@link PaymentTransaction121 }
     * 
     */
    public PaymentTransaction121 createPaymentTransaction121() {
        return new PaymentTransaction121();
    }

    /**
     * Create an instance of {@link Party40Choice }
     * 
     */
    public Party40Choice createParty40Choice() {
        return new Party40Choice();
    }

    /**
     * Create an instance of {@link GroupHeader91 }
     * 
     */
    public GroupHeader91 createGroupHeader91() {
        return new GroupHeader91();
    }

    /**
     * Create an instance of {@link ClearingSystemIdentification2Choice }
     * 
     */
    public ClearingSystemIdentification2Choice createClearingSystemIdentification2Choice() {
        return new ClearingSystemIdentification2Choice();
    }

    /**
     * Create an instance of {@link GenericPersonIdentification1 }
     * 
     */
    public GenericPersonIdentification1 createGenericPersonIdentification1() {
        return new GenericPersonIdentification1();
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
     * Create an instance of {@link TaxPeriod2 }
     * 
     */
    public TaxPeriod2 createTaxPeriod2() {
        return new TaxPeriod2();
    }

    /**
     * Create an instance of {@link DiscountAmountAndType1 }
     * 
     */
    public DiscountAmountAndType1 createDiscountAmountAndType1() {
        return new DiscountAmountAndType1();
    }

    /**
     * Create an instance of {@link Garnishment3 }
     * 
     */
    public Garnishment3 createGarnishment3() {
        return new Garnishment3();
    }

    /**
     * Create an instance of {@link TaxAuthorisation1 }
     * 
     */
    public TaxAuthorisation1 createTaxAuthorisation1() {
        return new TaxAuthorisation1();
    }

    /**
     * Create an instance of {@link ProxyAccountIdentification1 }
     * 
     */
    public ProxyAccountIdentification1 createProxyAccountIdentification1() {
        return new ProxyAccountIdentification1();
    }

    /**
     * Create an instance of {@link PersonIdentificationSchemeName1Choice }
     * 
     */
    public PersonIdentificationSchemeName1Choice createPersonIdentificationSchemeName1Choice() {
        return new PersonIdentificationSchemeName1Choice();
    }

    /**
     * Create an instance of {@link ReferredDocumentType4 }
     * 
     */
    public ReferredDocumentType4 createReferredDocumentType4() {
        return new ReferredDocumentType4();
    }

    /**
     * Create an instance of {@link LocalInstrument2Choice }
     * 
     */
    public LocalInstrument2Choice createLocalInstrument2Choice() {
        return new LocalInstrument2Choice();
    }

    /**
     * Create an instance of {@link BranchAndFinancialInstitutionIdentification6 }
     * 
     */
    public BranchAndFinancialInstitutionIdentification6 createBranchAndFinancialInstitutionIdentification6() {
        return new BranchAndFinancialInstitutionIdentification6();
    }

    /**
     * Create an instance of {@link BranchData3 }
     * 
     */
    public BranchData3 createBranchData3() {
        return new BranchData3();
    }

    /**
     * Create an instance of {@link CashAccountType2Choice }
     * 
     */
    public CashAccountType2Choice createCashAccountType2Choice() {
        return new CashAccountType2Choice();
    }

    /**
     * Create an instance of {@link AmountType4Choice }
     * 
     */
    public AmountType4Choice createAmountType4Choice() {
        return new AmountType4Choice();
    }

    /**
     * Create an instance of {@link DiscountAmountType1Choice }
     * 
     */
    public DiscountAmountType1Choice createDiscountAmountType1Choice() {
        return new DiscountAmountType1Choice();
    }

    /**
     * Create an instance of {@link GenericOrganisationIdentification1 }
     * 
     */
    public GenericOrganisationIdentification1 createGenericOrganisationIdentification1() {
        return new GenericOrganisationIdentification1();
    }

    /**
     * Create an instance of {@link OtherContact1 }
     * 
     */
    public OtherContact1 createOtherContact1() {
        return new OtherContact1();
    }

    /**
     * Create an instance of {@link CreditorReferenceType1Choice }
     * 
     */
    public CreditorReferenceType1Choice createCreditorReferenceType1Choice() {
        return new CreditorReferenceType1Choice();
    }

    /**
     * Create an instance of {@link AmendmentInformationDetails13 }
     * 
     */
    public AmendmentInformationDetails13 createAmendmentInformationDetails13() {
        return new AmendmentInformationDetails13();
    }

    /**
     * Create an instance of {@link MandateSetupReason1Choice }
     * 
     */
    public MandateSetupReason1Choice createMandateSetupReason1Choice() {
        return new MandateSetupReason1Choice();
    }

    /**
     * Create an instance of {@link FrequencyPeriod1 }
     * 
     */
    public FrequencyPeriod1 createFrequencyPeriod1() {
        return new FrequencyPeriod1();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link MandateClassification1Choice }
     * 
     */
    public MandateClassification1Choice createMandateClassification1Choice() {
        return new MandateClassification1Choice();
    }

    /**
     * Create an instance of {@link PartyIdentification135 }
     * 
     */
    public PartyIdentification135 createPartyIdentification135() {
        return new PartyIdentification135();
    }

    /**
     * Create an instance of {@link OriginalTransactionReference31 }
     * 
     */
    public OriginalTransactionReference31 createOriginalTransactionReference31() {
        return new OriginalTransactionReference31();
    }

    /**
     * Create an instance of {@link RemittanceAmount3 }
     * 
     */
    public RemittanceAmount3 createRemittanceAmount3() {
        return new RemittanceAmount3();
    }

    /**
     * Create an instance of {@link CategoryPurpose1Choice }
     * 
     */
    public CategoryPurpose1Choice createCategoryPurpose1Choice() {
        return new CategoryPurpose1Choice();
    }

    /**
     * Create an instance of {@link ClearingSystemMemberIdentification2 }
     * 
     */
    public ClearingSystemMemberIdentification2 createClearingSystemMemberIdentification2() {
        return new ClearingSystemMemberIdentification2();
    }

    /**
     * Create an instance of {@link EquivalentAmount2 }
     * 
     */
    public EquivalentAmount2 createEquivalentAmount2() {
        return new EquivalentAmount2();
    }

    /**
     * Create an instance of {@link MandateRelatedData1Choice }
     * 
     */
    public MandateRelatedData1Choice createMandateRelatedData1Choice() {
        return new MandateRelatedData1Choice();
    }

    /**
     * Create an instance of {@link DocumentLineType1 }
     * 
     */
    public DocumentLineType1 createDocumentLineType1() {
        return new DocumentLineType1();
    }

    /**
     * Create an instance of {@link TaxParty2 }
     * 
     */
    public TaxParty2 createTaxParty2() {
        return new TaxParty2();
    }

    /**
     * Create an instance of {@link CashAccount38 }
     * 
     */
    public CashAccount38 createCashAccount38() {
        return new CashAccount38();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.028.001.04", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
