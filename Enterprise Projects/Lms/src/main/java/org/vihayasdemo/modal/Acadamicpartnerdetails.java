package org.vihayasdemo.modal;



import org.json.JSONObject;
import org.vihayasdemo.service.Firebase_REST;

import com.sun.jersey.api.client.Client;



public class Acadamicpartnerdetails {
	
	
	public String getAcadamicpartner(){
		
		try {
						// Creating Jersey client
						Client client = Client.create();
						// Initiate Jersey as a end point for Firebase
						Firebase_REST rest = new Firebase_REST(client);
						// Initiate DataSet
						String DataSet;
						
						// Recieving JSON object at Database location 
						DataSet = rest.getValue("AcadamicPartners");
						
						JSONObject jObject = new JSONObject(DataSet.trim());
						
						String Acadamicpartner = jObject.toString();
						//System.out.println(Acadamicpartner);
						
						return Acadamicpartner;
						
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return null;
		
		
		
		
	}

}
