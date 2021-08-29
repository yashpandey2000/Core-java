package co.in.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferreader {
	
	public static void main(String[] args) throws Exception {
		
		
		FileReader fr = new FileReader("C:\\Users\\Yash Pandey\\Desktop\\html");
		
		BufferedReader br= new BufferedReader(fr);
		
		String line = br.readLine();
		
		
		while(line!=null) {
			
			System.out.println(line);
			line = br.readLine();
		}
		
		
	}

}
