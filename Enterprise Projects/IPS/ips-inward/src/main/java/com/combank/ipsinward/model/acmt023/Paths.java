package com.combank.ipsinward.model.acmt023;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paths{
    @JsonProperty("/iso20022/async/v1/verification-request") 
    public Iso20022AsyncV1VerificationRequest iso20022AsyncV1VerificationRequest;
}
