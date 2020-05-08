package json_traverse;

import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example1 {

	public static void main(String[] args) {
		String strobj ="{\r\n" + 
				"    \"name\": \"Alice\",\r\n" + 
				"    \"age\": 20,\r\n" + 
				"    \"address\": {\r\n" + 
				"        \"streetAddress\": \"100 Wall Street\",\r\n" + 
				"        \"city\": \"New York\"\r\n" + 
				"    },\r\n" + 
				"    \"phoneNumber\": [\r\n" + 
				"        {\r\n" + 
				"            \"type\": \"home\",\r\n" + 
				"            \"number\": \"212-333-1111\"\r\n" + 
				"        },{\r\n" + 
				"            \"type\": \"fax\",\r\n" + 
				"            \"number\": \"646-444-2222\"\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"}".trim();
		
		JSONObject object  = new JSONObject();
		JSONParser parser = new JSONParser();
		JSONArray array = new JSONArray();
		try {
			object =(JSONObject) parser.parse(strobj);
			System.out.println(object);
			
			String name = (String)object.get("name");
			long age = (long)object.get("age");
			System.out.println("name : "+name+" , age :"+age);
			
			
			 Map<String,String> address = (Map<String,String>) object.get("address");
			 String streetAddress =address.get("streetAddress");
			 String city = address.get("city");
			 System.out.println("Street address: "+streetAddress+", city: "+city);
			 
			 array = (JSONArray)object.get("phoneNumber");
			Iterator<?> itr = array.iterator();
			while(itr.hasNext()) {
				
				System.out.println(itr.next());
				
			}
		
		    for (Object arrayobject : array) {
		        JSONObject jsonLineItem = (JSONObject) arrayobject;
		        String number = (String) jsonLineItem.get("number");
		        String type = (String)jsonLineItem.get("type");
		        
		        System.out.println("number :"+number);
		        System.out.println("type :"+type);
		       
		    }
			 
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
