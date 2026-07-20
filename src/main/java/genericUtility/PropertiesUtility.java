package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Helper Class
 * @author Jashwanth
 */
public class PropertiesUtility {

	/**
	 * This method used to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}
	
	/**
	 * This method used to Write data to Properties File
	 * @param key
	 * @param value
	 * @param commands
	 * @throws IOException
	 */
	public void writeDataToPropertiesFile(String key,String value, String commands) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		
		FileOutputStream fos = new FileOutputStream(IPathUtility.propertiesPath);
		prop.store(fos, commands);
	}
}
