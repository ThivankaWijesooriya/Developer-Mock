package org.vihayasdemo.service;





import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;

public class AcademicPartners {
	public String getAcademicPartners(String ID) {
		String AcademicPartners=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("RegisteredPartners/" + ID);
			System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			AcademicPartners = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return AcademicPartners;

	}
	
	public void setAcademicPartner(String newAcademicPartner) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String RegisteredPartnerID=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			/*JSONObject inputobject = new JSONObject(newAcademicPartner);
			String AcademicPartnerJson = inputobject.toString();*/
			
			rest.setValue("RegisteredPartners/"+ID+"/"+RegisteredPartnerID, newAcademicPartner);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void UpdateAcademicPartners(String updatedpartners,String key) {
		
		
		
		
		try {
			
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			rest.InitializeDB();
			String ID = "002";
			int HTTPstatus;
			JSONObject inputobject = new JSONObject(updatedpartners);
			System.out.println(inputobject);
			String updatedpart = inputobject.toString();
			HTTPstatus = rest.putData("/RegisteredPartners/"+ID+"/"+key, updatedpart);
			System.out.println(HTTPstatus);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
