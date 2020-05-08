package gson;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Json_to_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		String json = "{\"name\":\"mkyong\", \"age\":33}";
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>(){}.getType());
		map.forEach((x,y)-> System.out.println("key : " + x + " , value : " + y));

	}

}
