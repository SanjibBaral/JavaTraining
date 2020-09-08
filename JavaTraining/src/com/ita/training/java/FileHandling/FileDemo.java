package com.ita.training.java.FileHandling;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file=new File("data");
		System.out.println(file.getAbsolutePath());
		String[] dirs=file.list();
		for(String folder:dirs) {
			System.out.println(folder);
		}
		
		
	}
	
	

}
