package co.in.inputoutput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class copycncommand {

	public static void main(String[] args) throws IOException {
		
		String target ="C:/Users/Yash Pandey/hi.txt";
		
		FileWriter writer = new FileWriter(target);
		PrintWriter pw = new PrintWriter(writer);
		
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(reader);
	
	String line = br.readLine();
	while(!line.equals("quit")) {
		
		pw.print(line);
		line = br.readLine();
	}
	
	pw.close();
	reader.close();
	System.out.println("done");

	}

}
