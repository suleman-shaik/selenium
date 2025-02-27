package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataBackToThePropFile {
	public static void main(String[] args) throws IOException {
		
		//Converting physical File into a Java object
		FileInputStream fis=new FileInputStream("./src/test/resources/CommomData.properties");
		
		//Create an empty properties object
		Properties p=new Properties();
		
		p.load(fis);
		
		//Writing Data Back to Properties object
		p.put("animal", "cat");
		
		//Save property file
		FileOutputStream fout=new FileOutputStream("./src/test/resources/CommomData.properties");
		p.store(fout, "Updated Successfully");
	}

}


