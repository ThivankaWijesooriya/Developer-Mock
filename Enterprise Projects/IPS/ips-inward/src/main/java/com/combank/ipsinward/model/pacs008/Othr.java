package com.combank.ipsinward.model.pacs008;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Othr{
    public List<AllOf> allOf;
    @JsonProperty("$ref") 
    public String ref;
}
