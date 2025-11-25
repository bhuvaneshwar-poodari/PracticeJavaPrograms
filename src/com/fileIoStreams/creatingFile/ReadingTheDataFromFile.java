package com.fileIoStreams.creatingFile;
import java.io.*;

public class ReadingTheDataFromFile {
	
	public static void main(String args[]) throws IOException,FileNotFoundException {
		 String filePath = "C:\\Users\\HP\\OneDrive\\Desktop\\JDBC.txt";
		
		FileReader fi = new FileReader(filePath);
		
		int ch;
		while((ch=fi.read())!=-1) {
			
			System.out.print((char)ch);
			
			
		}
	}

}
