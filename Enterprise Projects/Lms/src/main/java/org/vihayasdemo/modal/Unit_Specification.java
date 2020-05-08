package org.vihayasdemo.modal;



import org.json.JSONObject;
import org.vihayasdemo.service.Firebase_REST;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;


public class Unit_Specification {
	
	
public String getservay(){
		
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			// Initiate GSon
			Gson gs = new Gson();
			String DataSet;

			// Recieving JSON object at Database location 
			DataSet = rest.getValue("Survey");
			
			JSONObject jObject = new JSONObject(DataSet.trim());
			
			String Surveys = jObject.toString();

			
			return Surveys;
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
		
	}


}
