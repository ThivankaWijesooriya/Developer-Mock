package com.combank.ipsoutward.model.acmt023;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Schemas{
    @JsonProperty("acmt.023.001.02") 
    public Acmt02300102 acmt02300102;
    @JsonProperty("IdentificationVerificationRequestV02") 
    public IdentificationVerificationRequestV02 identificationVerificationRequestV02;
    @JsonProperty("IdentificationVerification2") 
    public IdentificationVerification2 identificationVerification2;
    @JsonProperty("IdentificationInformation2") 
    public IdentificationInformation2 identificationInformation2;
    @JsonProperty("BranchAndFinancialInstitutionIdentification5") 
    public BranchAndFinancialInstitutionIdentification5 branchAndFinancialInstitutionIdentification5;
    @JsonProperty("FinancialInstitutionIdentification8") 
    public FinancialInstitutionIdentification8 financialInstitutionIdentification8;
    @JsonProperty("BICFIIdentifier") 
    public BICFIIdentifier bICFIIdentifier;
    @JsonProperty("AccountIdentification4Choice") 
    public AccountIdentification4Choice accountIdentification4Choice;
    @JsonProperty("GenericAccountIdentification1") 
    public GenericAccountIdentification1 genericAccountIdentification1;
    @JsonProperty("AcctOthrId") 
    public AcctOthrId acctOthrId;
    @JsonProperty("GenericId") 
    public GenericId genericId;
    @JsonProperty("IdentificationAssignment2") 
    public IdentificationAssignment2 identificationAssignment2;
    @JsonProperty("Party12Choice") 
    public Party12Choice party12Choice;
    @JsonProperty("ISODateTime") 
    public ISODateTime iSODateTime;
}
