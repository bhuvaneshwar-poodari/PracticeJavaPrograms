package com.SeralizationAndDeseralization.test;
import java.io.*;
import java.io.IOException;

public class DataWriteIntoFile {
	public static void main(String args[]) {
	String s = "hello bhuvi";
	try{
		FileWriter fos = new FileWriter("userdetails.txt");
	
	fos.write(s);
	fos.close();
	System.out.println("succesfully write the data into file");
	}catch(Exception e) {
		e.printStackTrace();
	}
		

}
}