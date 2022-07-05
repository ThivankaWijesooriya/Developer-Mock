package com.combank.ipsoutward.model.pacs002;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Content{
    @JsonProperty("application/xml") 
    public ApplicationXml applicationXml;
}
