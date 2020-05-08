package org.vihayasdemo.service;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.json.JSONObject;

import com.sun.jersey.api.client.Client;

public class Awards {
	
	public String getAward(String ID) {
		String awarddetails=null;
		String DataSet=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			

			DataSet = rest.getValue("Awards/" + ID);
			//System.out.println("helloaward"+DataSet);
			//JSONObject jObject = new JSONObject(DataSet.trim());
			//awarddetails = jObject.toString();

			/*awarddetails = rest.getValue("Awards/" + ID);*/
			//System.out.println(DataSet);
			//JSONObject jObject = new JSONObject(DataSet.trim());
			//awarddetails = jObject.toString();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return DataSet;

	}
	
	public String getQualificationframework() {
		String qualificationdetails=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("QualificationFramework");
			//System.out.println("hello"+DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			qualificationdetails = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return qualificationdetails;

	}
	
	
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
	

	public String getModulespec(String ID) {
		String moduledetails=null;
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String DataSet;
			DataSet = rest.getValue("Module/" + ID);
			System.out.println(DataSet);
			JSONObject jObject = new JSONObject(DataSet.trim());
			moduledetails = jObject.toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return moduledetails;

	}
	

	
	public void setAwards(String award) {
		try {
			// Creating Jersey client
			Client client = Client.create();
			// Initiate Jersey as a end point for Firebase
			Firebase_REST rest = new Firebase_REST(client);
			String ID = "002"; //Get this from Session
			String awardid=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()).toString();
			
			JSONObject inputobject = new JSONObject(award);
			String AwardSpecification = inputobject.toString();
			
			rest.setValue("Awards/"+ID+"/"+awardid, AwardSpecification);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
