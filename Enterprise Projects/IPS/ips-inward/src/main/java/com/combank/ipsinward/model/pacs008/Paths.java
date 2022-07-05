package com.combank.ipsinward.model.pacs008;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paths{
    @JsonProperty("/iso20022/async/v1/credit-transfer") 
    public Iso20022AsyncV1CreditTransfer iso20022AsyncV1CreditTransfer;
}
