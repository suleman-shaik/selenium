package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//Step:1 Convert the physical property file into java object 
		FileInputStream fis=new FileInputStream("./src/test/resources/CommomData.properties");
		
		//Step:2 Create an Object of Properties
		
		Properties p=new Properties();
		
		//Step:3 Load the property object from java object
		p.load(fis);
		
		//Step:4 Fetch the data from properties object
		String data = p.getProperty("browser");
		String ul=p.getProperty("url");
		String un=p.getProperty("username");
		String pwd=p.getProperty("password");
		String time=p.getProperty("timeouts");
		
		System.out.println(data);
		System.out.println(ul);
		System.out.println(un);
		System.out.println(pwd);
		System.out.println(time);
		
	}

}
