package com.file_try;
import java.io.File;
import java.io.IOException;

public class FileCreationDemo {

	public static void main(String[] args)throws IOException {
		File f=new File("f:/hsbc_file/two.txt");
		
		if(f.createNewFile()) {
			System.out.println("file created");
		}
		else {
			System.out.println("could not create file");
		}


	}

}
