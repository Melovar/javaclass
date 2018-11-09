package com.java.file.io;

import java.io.File;

public class FileCopy {
	
	public static void main(String[]args) {
		File file = File("Data.txt");
		
		try {
			boolean fvar= file.createNewFile();
			
		if(fvar) {
			System.out.println("file has Been cretated");
		}else {
			System.out.println("file not found");
		}catch (IOException e) {
			System.out.println("IO exceptions");
			
		}
			
	
	

}
