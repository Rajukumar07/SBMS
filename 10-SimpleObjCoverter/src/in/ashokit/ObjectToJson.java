package in.ashokit;

import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) throws JsonProcessingException {

		Student s = new Student();
		s.setfName("Raju");
		s.setlName("Kumar");

		ObjectMapper m = new ObjectMapper();

		String json = m.writerWithDefaultPrettyPrinter().writeValueAsString(s);
		System.out.println(json);

		try {
			FileWriter fw = new FileWriter("Student_Detail.json");
			fw.write(json);
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
