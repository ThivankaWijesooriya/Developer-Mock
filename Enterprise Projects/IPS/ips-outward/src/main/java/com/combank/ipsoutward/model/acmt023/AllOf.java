package com.combank.ipsoutward.model.acmt023;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllOf{
    public String type;
    public String description;
    @JsonProperty("$ref") 
    public String ref;
    public String title;
}