package com.ita.training.java.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileRead {
	
	public static void main(String[] args) {
		File file=null;
		FileInputStream fis=null;
		try
		{
			file=new File("data\\globaldata.properties");
			fis=new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fis);
			for(Object key:prop.keySet()) {
				System.out.println("Key="+key+" , Value="+prop.get(key));
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(Exception e) {
			System.out.println("Exception Occurred.");
			
		}
		finally {
			try{
				fis.close();
				System.out.println("Resource Closed.");
			}
			catch (IOException e) {
				System.out.println("File Not Closed.");
			}
		}
	}
	
}
