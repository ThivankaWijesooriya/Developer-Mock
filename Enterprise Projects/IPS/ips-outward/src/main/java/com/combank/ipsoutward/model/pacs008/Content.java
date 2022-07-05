package com.combank.ipsoutward.model.pacs008;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Content{
    @JsonProperty("application/xml") 
    public ApplicationXml applicationXml;
}
