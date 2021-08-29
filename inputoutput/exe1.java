package co.in.inputoutput;

import java.io.File;

import co.in.collection.imlement;

public class exe1 {
	
	public static void main(String[] args) {
		
	File f = new File("C:\\Users\\Yash Pandey\\Desktop\\html");
	
	String[] list = f.list();
	
	for (int i = 0; i < list.length; i++) {
	
		File F = new File("C:\\Users\\Yash Pandey\\Desktop\\html",list[i]);
		
	
	if(F.isFile())
	{		
System.out.println(list[i]);
		}
		
	}
	
	}}


