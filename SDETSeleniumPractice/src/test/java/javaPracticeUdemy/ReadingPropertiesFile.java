package javaPracticeUdemy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//location of Property file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\config.properties");
		//Loading Property file
		Properties prop = new Properties();
		prop.load(file);
		//Reading Property file
		String url = prop.getProperty("appUrl");
		String uname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		
		System.out.println(url   + "  " +   uname + " " + pwd);
		Set<Object> keys = prop.keySet();
		System.out.println(keys);
		
		Collection<Object> values = prop.values();
		System.out.println(values);
		
	

	}

}
