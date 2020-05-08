package simple_json;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONObject object = new JSONObject();
		object.put("Name", "Thivanka");
		object.put("Age", new Integer(24));
		object.put("Role", "SE");
		
		JSONArray array = new JSONArray();
		array.add("Java");
		array.add("C#");
		
		object.put("Skills", array);
		
		System.out.println(object);
		
		System.out.println("Skills");
		
	     JSONArray skills = (JSONArray) object.get("Skills");
         Iterator<String> iterator = skills.iterator();
         while (iterator.hasNext()) {
             System.out.println(iterator.next());
         }
		
         String Stringobject = object.toJSONString();
         System.out.println(Stringobject);
         


	}

}
