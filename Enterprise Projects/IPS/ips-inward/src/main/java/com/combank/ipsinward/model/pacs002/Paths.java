package com.combank.ipsinward.model.pacs002;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Paths{
    @JsonProperty("/iso20022/async/v1/payment-status-report") 
    public Iso20022AsyncV1PaymentStatusReport iso20022AsyncV1PaymentStatusReport;
}
