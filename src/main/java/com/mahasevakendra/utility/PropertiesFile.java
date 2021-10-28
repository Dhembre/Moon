package com.mahasevakendra.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public String getProperties(String fileName, String key) {
		return key;

	}

	/**
	 * This method returns the value of locater mentioned in ObectRepository
	 * 
	 * @param key
	 * @throws FileNotFoundException
	 * 
	 * 
	 * 
	 */
	public  static String getObject(String key) {
		String dir = System.getProperty("user.dir");
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(dir + "/src/test/resources/ObjectRepository.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			 value=prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
