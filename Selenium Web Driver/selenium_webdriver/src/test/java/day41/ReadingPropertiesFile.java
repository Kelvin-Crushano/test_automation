package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		       
       // 1. specifying the location of properties file in reading mode (FileInputStream)
       FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\config.properties");
    
       // 2. creating an object of properties class & loading properties file
       Properties properties_obj = new Properties();
       properties_obj.load(file);
       
       // Retrieving the properties inside the file (Values of keys)
       String url = properties_obj.getProperty("appurl");
       String email = properties_obj.getProperty("email");
       String password = properties_obj.getProperty("password");
       String orderid = properties_obj.getProperty("orderid");
       String customerid = properties_obj.getProperty("customerid");
       
//       System.out.println(url);
       		
       // Retrieve only keys
//       Set <String> keys = properties_obj.stringPropertyNames();
//             System.out.println(keys);       
       
       Set<Object> keys = properties_obj.keySet();
       System.out.println(keys);
       
       // Retrieve only values
       Collection <Object> values = properties_obj.values();
       System.out.println(values);
       
       
       file.close();
       
	}

}
