package co.in.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
	public static void main(String[] args) throws Exception  {
		
		
		FileReader list = new FileReader("C:/Users/Yash Pandey/Desktop/html/hello.txt");
	//FileReader list=new FileReader("C:\Users\Yash Pandey\Desktop\html\hello.txt");
		
		int ch = list.read();
		char chr;
		
		while(ch!=-1) {
			
			chr = (char)ch;
			System.out.println(chr);
			ch = list.read();
		}
		
		
	}

}
