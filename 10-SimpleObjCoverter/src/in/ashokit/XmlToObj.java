package in.ashokit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObj {

	public static void main(String[] args) throws JAXBException {
		
		File f = new File("D:\\SBMS\\10-SimpleObjCoverter\\src\\student.xml");
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Student object =(Student) unmarshaller.unmarshal(f);
		System.out.println(object.getfName()+" "+ object.getlName());
		
		

	}

}
