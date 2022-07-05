package com.combank.ipsoutward.model.acmt023;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties{
    @JsonProperty("IdVrfctnReq") 
    public IdVrfctnReq idVrfctnReq;
    @JsonProperty("Agt") 
    public Agt agt;
    @JsonProperty("Assgnmt") 
    public Assgnmt assgnmt;
    @JsonProperty("Vrfctn") 
    public Vrfctn vrfctn;
    @JsonProperty("Id") 
    public Id id;
    @JsonProperty("PtyAndAcctId") 
    public PtyAndAcctId ptyAndAcctId;
    @JsonProperty("Acct") 
    public Acct acct;
    @JsonProperty("FinInstnId") 
    public FinInstnId finInstnId;
    @JsonProperty("BICFI") 
    public BICFI bICFI;
    @JsonProperty("Othr") 
    public Othr othr;
    @JsonProperty("MsgId") 
    public MsgId msgId;
    @JsonProperty("CreDtTm") 
    public CreDtTm creDtTm;
    @JsonProperty("FrstAgt") 
    public FrstAgt frstAgt;
    @JsonProperty("Assgnr") 
    public Assgnr assgnr;
    @JsonProperty("Assgne") 
    public Assgne assgne;
}
