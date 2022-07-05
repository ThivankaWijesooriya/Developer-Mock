package com.combank.ipsoutward.model.pacs002;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClearingSystemCode{
    public String type;
    public String description;
    public String example;
    @JsonProperty("enum") 
    public List<String> myenum;
}
