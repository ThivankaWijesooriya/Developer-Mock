package simple_json;

import java.util.ArrayList;
import java.util.List;


import org.json.simple.JSONValue;

public class ArrayList_To_JSONObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List arr = new ArrayList();
		arr.add("sonoo");
		arr.add(new Integer(27));
		arr.add(new Double(600000));

		String jsonText = JSONValue.toJSONString(arr);  // just for log purpose no actual conversion
		System.out.print(jsonText); // JSON to STRING
		
		
		// Cannot convert Arraylist to JSONobject using simple-json hence use gson or
		// jackson
		// JSONObject obj = new JSONObject(list); error shown once list argument placed
		
		// cannot convert json to arraylist in simple-json use other json processors
	}

}
