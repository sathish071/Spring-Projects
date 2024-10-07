package json_To_Java;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_Java {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		try{
			Emp emp = mapper.readValue(new File("C:\\Users\\Divya\\Desktop\\Json\\json_sathish.JSON"), Emp.class);
			
			System.out.println(emp);
			
		}
		catch(Exception e) {
			
			
		}
	}

}
