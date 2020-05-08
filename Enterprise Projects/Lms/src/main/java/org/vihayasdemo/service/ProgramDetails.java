package org.vihayasdemo.service;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;

public class ProgramDetails {
	
	public String getProgramDetails(String ID) {
		String program=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Programs/" + ID);
			//System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			program = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return program;

	}
	
	public void setProgramDetails(String programDetail) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String programID=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			JSONObject inputobject = new JSONObject(programDetail);
			String ProgramDetails = inputobject.toString();
			
			rest.setValue("Programs/"+ID+"/"+programID, ProgramDetails);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void UpdateProgram(String updatedprogram,String key) {
		
		
		
		
		try {
			
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			rest.InitializeDB();
			String ID = "002";
			int HTTPstatus;
			JSONObject inputobject = new JSONObject(updatedprogram);
			System.out.println(inputobject);
			String Updatedprograms = inputobject.toString();
			HTTPstatus = rest.putData("/Programs/"+ID+"/"+key, Updatedprograms);
			System.out.println(HTTPstatus);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

}
