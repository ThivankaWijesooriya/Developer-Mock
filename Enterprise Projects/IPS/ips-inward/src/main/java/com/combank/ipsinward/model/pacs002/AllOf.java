package com.combank.ipsinward.model.pacs002;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllOf{
    public String type;
    public String description;
    @JsonProperty("$ref") 
    public String ref;
    public String title;
}
