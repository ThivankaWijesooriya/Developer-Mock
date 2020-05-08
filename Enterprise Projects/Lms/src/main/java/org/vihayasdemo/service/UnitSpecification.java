package org.vihayasdemo.service;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;

public class UnitSpecification {
	
	
	public String getUnitspec(String ID) {
		String unitdetails=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Units/" + ID);
			System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			unitdetails = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return unitdetails;

	}
	
	
	public void setUnitSpecification(String unitspec) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String unitID=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			JSONObject inputobject = new JSONObject(unitspec);
			String UnitSpecification = inputobject.toString();
			
			rest.setValue("Units/"+ID+"/"+unitID, UnitSpecification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
