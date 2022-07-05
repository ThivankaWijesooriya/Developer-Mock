package com.combank.ipsoutward.model.pacs002;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Othr{
    public ArrayList<AllOf> allOf;
    @JsonProperty("$ref") 
    public String ref;
}
