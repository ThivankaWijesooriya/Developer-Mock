package com.combank.ipsinward.model.acmt023;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Agt{
    public List<AllOf> allOf;
    @JsonProperty("$ref") 
    public String ref;
}
