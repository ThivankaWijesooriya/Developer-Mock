package gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class gson_to_arraylist {

	public static void main(String[] args) 
	
	{
		Gson gson = new Gson() ;
		String json = "[{\"id\":1,\"name\":\"thivanka\",\"age\":24},{\"id\":2,\"name\":\"Lahiru\",\"age\":24},{\"id\":3,\"name\":\"Shanaka\",\"age\":24}]";
		List<Employee> list = gson.fromJson(json, new TypeToken<List<Employee>>(){}.getType());
		list.forEach(x -> System.out.println(x));

	}

}
