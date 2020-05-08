package simple_json;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONParserExample {

	public static void main(String[] args) {
		
        String jsontext= "{\"Role\":\"SE\",\"Skills\":[\"Java\",\"C#\"],\"Age\":24,\"Name\":\"Thivanka\"}";
        JSONParser parser = new JSONParser();
       
      try {
		JSONObject object =(JSONObject) parser.parse(jsontext);
		System.out.println(object.get("Name"));
		
		System.out.println("Skills are ");
		JSONArray array = (JSONArray)object.get("Skills");
		Iterator itr = array.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		

	}

}
