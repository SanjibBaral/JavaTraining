package com.ita.training.java.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
	File file=new File("data\\Test1.txt");
	FileInputStream fis=null;
	FileOutputStream fos=null;
	FileReader fr=null;
	
	public static void main(String[] args) throws IOException {
		
		TextFileRead f=new TextFileRead();
		if(!f.file.exists()) {
			f.file.createNewFile();
			System.out.println("File Created");
		}
		f.ReadFileWithFileInputStream();
		f.ReadFileWithFileReader();
				
	}
	
	void ReadFileWithFileInputStream()
	{
		try {
			fis=new FileInputStream(file);
			int i=0;
			while((i=fis.read())!=-1) {
					System.out.print((char)i);
			}
					
		}
		catch (FileNotFoundException fnf) {
			System.out.println("File Not Found");
		}
		catch (IOException ioe) {
			System.out.println("IO Exception Occurred");
		}
		finally
		{
			try{
				fis.close();
			}
			catch (IOException ioe) {
				System.out.println("IOE Exception in finally.");
			}
		}
	}
	
	void ReadFileWithFileReader()
	{
		try
		{
			fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}
		catch(FileNotFoundException fnf) {
			System.out.println("File Not Found");
		}
		catch(Exception e) {
			System.out.println("Exception Occurred during File Reading.");
		}
		finally
		{
			try{
				fis.close();
			}
			catch (IOException ioe) {
				System.out.println("IOE Exception in finally.");
			}
		}
		
	}
	
}
