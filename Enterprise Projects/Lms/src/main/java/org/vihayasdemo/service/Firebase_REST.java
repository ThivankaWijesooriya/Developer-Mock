package org.vihayasdemo.service;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import javax.servlet.jsp.tagext.TryCatchFinally;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseCredentials;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.sun.jersey.api.client.Client;




public class Firebase_REST {
	//JERCEY CLIENT CONFIGURATION
	private static final String DEFAULT_AUTH_PARAM_NAME = "auth";
    private static final String DEFAULT_PATH_FORMAT = "%s.json";
    

    private final String credentials = "zq1H6HKbbdeqNZLH3iwJU3X1gQU5Hhv9M0GhV0F9";
    private final String url = "https://projectdemo-e0e10.firebaseio.com";

  
    private final Client client;
    

    private String authParamName = DEFAULT_AUTH_PARAM_NAME;
    private String pathFormat = DEFAULT_PATH_FORMAT;
    
    
    public Firebase_REST(Client client) {
        this.client = client;
    }
    
    //Insert data. This will REPLACE the content 
    public void setValue(String path, String value) throws Exception {
        client.resource(url).path(String.format(pathFormat, path))
                    .queryParam(authParamName, credentials)
                    .type(MediaType.APPLICATION_JSON).entity(value)
                    .put(String.class);
    }
    
    
    //Get data
    public String getValue(String path) throws Exception {
        return client.resource(url).path(String.format(pathFormat, path))
                .queryParam(authParamName, credentials).get(String.class);
    }
    
    //Delete data
    public void deleteValue(String path) throws Exception {
        client.resource(url).path(String.format(pathFormat, path))
                .queryParam(authParamName, credentials).delete(String.class);
    }
    

    
    
    //Multiple account configurations
    private static final String AUTH_PARAM = "?auth=";
    private static final String PATH_SUFFIX = ".json";
    
    private String DB_URL="https://projectdemo-e0e10.firebaseio.com";  //Default DB URL for development environment
    private String DB_SECRET="zq1H6HKbbdeqNZLH3iwJU3X1gQU5Hhv9M0GhV0F9"; //Default DB secret for development environment
    
    
    public void InitializeDB() {
    	/*Please update DB_ID before exporting the project
    	 * 0 = Development DB
    	 * 1 = Royal Institute of Colombo
    	 * 2 = Imperial College
    	 * */
    	
    	int DB_ID = 0; 
    	switch(DB_ID) {
    		case 1:
    			this.DB_URL="https://projectdemo-e0e10.firebaseio.com";  
    			this.DB_SECRET="zq1H6HKbbdeqNZLH3iwJU3X1gQU5Hhv9M0GhV0F9";
    			break;
    		default:
    			this.DB_URL="https://projectdemo-e0e10.firebaseio.com"; 
    			this.DB_SECRET="zq1H6HKbbdeqNZLH3iwJU3X1gQU5Hhv9M0GhV0F9";
    			
    	}
    }
    
    
    
    public String getData(String PATH) {
    	String data=null;
    	try {
    		HttpResponse<JsonNode> response = Unirest.get(DB_URL+PATH+PATH_SUFFIX+AUTH_PARAM+DB_SECRET)
    				.asJson();
    		data = response.getBody().toString().trim();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return data;
    }
    
    public int putData(String PATH,String DATA) {
    	int status=0;
    	try {
    		HttpResponse<?> response = Unirest.put(DB_URL+PATH+PATH_SUFFIX+AUTH_PARAM+DB_SECRET)
    				.header("accept", "application/json")
    				.body(DATA)
    				.asJson();
    		status = response.getStatus();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return status;
    }
    
    public int postData(String PATH,String DATA) {
    	int status=0;
    	try {
    		HttpResponse<?> response = Unirest.post(DB_URL+PATH+PATH_SUFFIX+AUTH_PARAM+DB_SECRET)
    				.header("accept", "application/json")
    				.body(DATA)
    				.asJson();
    		status = response.getStatus();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return status;
    }
    
    public int patchData(String PATH,String DATA) {
    	int status=0;
    	try {
    		HttpResponse<?> response = Unirest.patch(DB_URL+PATH+PATH_SUFFIX+AUTH_PARAM+DB_SECRET)
    				.header("accept", "application/json")
    				.body(DATA)
    				.asJson();
    		status = response.getStatus();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return status;
    }
    
    public int deleteData(String PATH,String DATA) {
    	int status=0;
    	try {
    		HttpResponse<?> response = Unirest.delete(DB_URL+PATH+PATH_SUFFIX+AUTH_PARAM+DB_SECRET)
    				.asJson();
    		status = response.getStatus();
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return status;
    }
}