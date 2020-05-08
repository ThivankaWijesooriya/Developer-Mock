package simple_json;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class Create_JSONObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Let's see a simple example to encode JSON object in java.
		
		JSONObject obj = new JSONObject();
		
		obj.put("Name", "Thivanka");
		obj.put("Age", new Integer(24));
		obj.put("Salary", new Double(40000.00));
		
		//You cannot and should not rely on the ordering of elements within a JSON object.
		// based for simple json
		
		System.out.println("*****JSON OBJECT***** ");
		System.out.println(obj);
		
		JSONArray arr = new JSONArray();  
		arr.add("java");
		arr.add("c#");
		arr.add(new Integer(27));    
		arr.add(new Double(600000));   
		
		System.out.println("*******JSON ARRAY******* ");
		System.out.println(arr);
		
		System.out.println("*******JSON OBJECT & JSON ARRAY******* ");
		obj.put("Leaders", arr);
		System.out.println(obj);

	}

}
