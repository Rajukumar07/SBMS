package in.ashokit;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObj {

	public static void main(String[] args) throws Exception {
		
		
		File f = new File("D:\\SBMS\\10-SimpleObjCoverter\\src\\Student.json");
		
		
		ObjectMapper m = new ObjectMapper();
		Student value = m.readValue(f, Student.class);
		
		System.out.println(value.getfName()+" "+ value.getlName());

	}

}
