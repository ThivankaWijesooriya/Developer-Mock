package gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Json_to_javaobject {

	static Gson gson = new Gson();
	
	public static void main(String[] args) {
		
        Staff staff = createDummyObject();
        convertjson();
        

        //1. Convert object to JSON string
        
        String json = gson.toJson(staff);
        System.out.println(json);

        //2. Convert object to JSON string and save into a file directly
        try (FileWriter writer = new FileWriter("C:/Users/Thivanka/Desktop/JavaTest/staff.json")) {

            gson.toJson(staff, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Staff createDummyObject() {

        Staff staff = new Staff();

        staff.setName("mkyong");
        staff.setAge(35);
        staff.setPosition("Founder");
        staff.setSalary(new BigDecimal("10000"));

        List<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("python");
        skills.add("shell");

        staff.setSkills(skills);

        return staff;

    }
    
    private static void convertjson() {

        try (Reader reader = new FileReader("C:/Users/Thivanka/Desktop/JavaTest/staff.json")) {

    		// Convert JSON to Java Object
            Staff staff = gson.fromJson(reader, Staff.class);
            System.out.println(staff); // prints tostring method

    		

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    





    }
		

	

class Staff{
	
	private String name;
	private int age;
	private String position;
	private BigDecimal salary;
	private List<String> skills;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPosition() {
		return position;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + ", skills="
				+ skills + "]";
	}
	
	
	
}


