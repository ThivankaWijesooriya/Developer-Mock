package org.vihayasdemo.service;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;

public class ModuleSpecification {
	
	
	public String getModulespec(String ID) {
		String moduledetails=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Module/" + ID);
			//System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			moduledetails = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moduledetails;

	}
	
	
	public String getUnitspec(String ID) {
		
		String unit="";
		
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Units/" + ID);
			//System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			Iterator<?> jObjectkey = jObject.keys();
			
			JSONObject allunits = new JSONObject();
			while(jObjectkey.hasNext()){
				
				String UnitID = (String)jObjectkey.next();
				String Unitname= jObject.getJSONObject(UnitID).getString("UnitName");
				String version= jObject.getJSONObject(UnitID).getString("Version");
				String weighting= jObject.getJSONObject(UnitID).getString("Weighting"); 
				
				JSONObject unitdata = new JSONObject();
				unitdata.put("Unitname", Unitname);
				unitdata.put("version", version);
				unitdata.put("weighting", weighting);
				//System.out.println(unitdata);
				allunits.put(UnitID, unitdata);
				
				
			}
			
			
			 unit = allunits.toString();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return unit;

	}
	
	
	public void setModuleSpecification(String modulepec) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String moduleid=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			JSONObject inputobject = new JSONObject(modulepec);
			String ModuleSpecification = inputobject.toString();
			
			rest.setValue("Module/"+ID+"/"+moduleid, ModuleSpecification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getModules(String ID) {
		String program=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Module/" + ID);
			//System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			program = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return program;

	}

}
