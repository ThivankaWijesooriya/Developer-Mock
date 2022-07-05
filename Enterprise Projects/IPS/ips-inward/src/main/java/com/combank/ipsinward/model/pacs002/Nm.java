package com.combank.ipsinward.model.pacs002;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nm{
    public List<AllOf> allOf;
    public String type;
    public String title;
    public String description;
    public String example;
    public int minLength;
    public int maxLength;
    @JsonProperty("$ref") 
    public String ref;
}
