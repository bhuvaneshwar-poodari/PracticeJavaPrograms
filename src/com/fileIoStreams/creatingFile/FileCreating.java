package com.fileIoStreams.creatingFile;

import java.io.File;
import java.io.IOException;

public abstract class FileCreating {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1 = new File("./Folder1/Foder2/");//.represents absolute path it means current location.
		//System.out.println(f1.createNewFile());using this method we able to create file.
		//System.out.println(f1.mkdir());//using this method  we create only one directorie.mkdir stands for (make directorie)
		System.out.println(f1.mkdirs());//using this method we can create multiple directories.
		  if(f1.exists());//weather it is directorie or text file if it is exists it will return true.
		    System.out.println(f1.isDirectory());//using this method we check its directorie or not.suppose it is directorie it returns true,other wise it fals.
			 // File f2 = new File("./resume.txt");
			  
	}

}
