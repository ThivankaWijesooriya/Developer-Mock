package com.combank.ipsinward.model.pacs008;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChargeBearerType1Code{
    public String type;
    public String description;
    public String example;
    @JsonProperty("enum") 
    public List<String> myenum;
}
