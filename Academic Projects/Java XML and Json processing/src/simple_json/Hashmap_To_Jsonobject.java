package simple_json;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class Hashmap_To_Jsonobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map obj = new HashMap();
		obj.put("name", "sonoo");
		obj.put("age", new Integer(27));
		obj.put("salary", new Double(600000));
		
		JSONObject jsonobj = new JSONObject(obj); // can convert hashmap to jsonobject
		System.out.println(jsonobj);
		
		String jsonText = JSONValue.toJSONString(obj);
		System.out.print(jsonText); // JSON to String
		
		// No default way to convert a JSONObject to a Hashmap in simple-json use gson
		// or jackson instead
		

	}

}
