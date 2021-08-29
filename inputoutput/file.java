package co.in.inputoutput;

import java.io.File;

public class file {
	
	public static void main(String[] args) {
		
		
	File f = new File("C:/Users/Yash Pandey/Desktop/html");
		
	File[] list = f.listFiles();
		
			
	
		for (int i = 0; i < list.length; i++){
			
		if(list[i].isFile())
			
			{
			System.out.println(list[i].getName());
			
			System.out.println(list[i].canRead());
		//	System.out.println(list[i].delete()); //it deletes the files permanently //do not use			
				
				System.out.println(list[i].canWrite());
				System.out.println(list[i].exists());
				System.out.println(list);
			}}
	}}



//============================================
	
//	System.out.println(f.isDirectory());
//	System.out.println(f.canRead());
//System.out.println(f.length());
//System.out.println(f.delete());
//System.out.println(f.getName());
//System.out.println(f.getAbsolutePath());
//
//
//	}
//
//}