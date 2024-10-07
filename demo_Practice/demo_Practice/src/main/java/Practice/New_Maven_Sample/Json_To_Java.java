package Practice.New_Maven_Sample;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Json_To_Java {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			Employee_Bean empBean = objectMapper.readValue(new File("‪C:\\Users\\Divya\\Desktop\\Json\\emp.txt"), Employee_Bean.class);
			System.out.println(empBean);
		} 
		catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
