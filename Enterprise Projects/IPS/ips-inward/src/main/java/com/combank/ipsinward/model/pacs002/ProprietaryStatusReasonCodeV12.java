package com.combank.ipsinward.model.pacs002;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProprietaryStatusReasonCodeV12{
    public String type;
    public String description;
    public String example;
    @JsonProperty("enum") 
    public ArrayList<String> myenum;
}
