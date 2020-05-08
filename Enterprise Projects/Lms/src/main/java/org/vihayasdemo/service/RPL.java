package org.vihayasdemo.service;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;

public class RPL {
	
	
	public String getRPL(String ID) {
		String Rpl=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("RPL/" + ID);
			System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			Rpl = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Rpl;

	}
	
	
	
	
	
	
	
	
	public void setRPL(String RPLobj) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String RPLID=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			JSONObject inputobject = new JSONObject(RPLobj);
			String RpL = inputobject.toString();
			
			rest.setValue("RPL/"+ID+"/"+RPLID, RpL);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void UpdateRPL(String updatedrpl,String key) {
		
		
		
		
		try {
			
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			rest.InitializeDB();
			String ID = "002";
			int HTTPstatus;
			JSONObject inputobject = new JSONObject(updatedrpl);
			System.out.println(inputobject);
			String updatedRPL = inputobject.toString();
			HTTPstatus = rest.putData("/RPL/"+ID+"/"+key, updatedRPL);
			System.out.println(HTTPstatus);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
