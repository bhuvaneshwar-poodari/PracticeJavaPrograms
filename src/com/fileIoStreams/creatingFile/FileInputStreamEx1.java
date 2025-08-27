package com.fileIoStreams.creatingFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileInputStreamEx1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File fi = new File("./ravi.txt");
		
		if (!fi.exists()) {
		fi.createNewFile();
		}
		/*FileInputStream fis = new FileInputStream(fi); 
		/*int ascicode;
		while((ascicode = fis.read())!=-1){
			
			System.out.print((char)ascicode);
			
		}*/
		//fi.close();
		

		/*FileReader fr = new FileReader(fi);
		fr.read();
		int a;
		String s1=new String();
		while((a=fr.read())!=-1) {
		s1+=String.valueOf((char)a);
		
	}
		System.out.print(s1);
		fr.close();*/
		Scanner sc = new Scanner(fi);
		
		while(sc.hasNext()){
			System.out.print(sc.nextLine()+"\n");
		}
		sc.close();

}
}