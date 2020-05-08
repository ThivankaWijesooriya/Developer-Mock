package simple_json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DecodeJSON2_JSONPARSER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("C:/Users/Thivanka/Desktop/JavaTest/staff.json"));

            JSONObject jsonObject = (JSONObject) obj;
            /*System.out.println(jsonObject);*/

           String name = (String) jsonObject.get("name");
            System.out.println(name);

            long age = (Long) jsonObject.get("age");
            System.out.println(age);

            // loop array
            JSONArray msg = (JSONArray) jsonObject.get("skills");
            Iterator<String> iterator = msg.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}
