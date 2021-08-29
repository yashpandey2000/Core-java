package co.in.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writetofile {

	public static void main(String[] args) throws IOException {
	
		FileWriter writer = new FileWriter("C:/Users/Yash Pandey/desktop/html/hi.txt",true);
		
		PrintWriter pw = new PrintWriter(writer);
		

		for (int i=1;i<5;i++) {
		pw.println("hello");	
			
		}
		
		pw.close();
		
System.out.println("done");
}
	
}