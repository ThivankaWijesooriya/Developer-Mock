package simple_json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DecodeJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";
		Object obj = JSONValue.parse(s);
		JSONObject jsonObject = (JSONObject) obj;

		String name = (String) jsonObject.get("name");
		double salary = (Double) jsonObject.get("salary");
		long age = (Long) jsonObject.get("age");
		System.out.println(name + " " + salary + " " + age);
		
		System.out.println("********************");

		JSONObject obj2 = new JSONObject();

		obj2.put("Name", "Thivanka");
		obj2.put("Age", new Integer(24));
		obj2.put("Salary", new Double(40000.00));
		
		String name2 = (String)obj2.get("Name");
		int age2 = (int) obj2.get("Age");
		
		System.out.println("name is "+name2+" age is "+age2);

	}

}
