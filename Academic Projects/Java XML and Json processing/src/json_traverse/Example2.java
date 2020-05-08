package json_traverse;

import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Example2 {

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
			Map address = (Map)object.get("address");
			
			
			 Iterator<Map.Entry> itr1 = address.entrySet().iterator();
		        while (itr1.hasNext()) {
		            Map.Entry pair = itr1.next();
		            System.out.println(pair.getKey() + " : " + pair.getValue());
		        }
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(object);

	}

}
