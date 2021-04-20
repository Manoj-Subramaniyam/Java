package Pavithra;

import java.io.File;

public class ReadFileNamesinDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("E:\\");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
			System.out.println(listOfFiles[i]);
//		  if (listOfFiles[i].isFile()) {
//		    System.out.println(listOfFiles[i].getName());
//		  } else if (listOfFiles[i].isDirectory()) {
//		    System.out.println(listOfFiles[i].getName());
//		  }
		}
	}

}
