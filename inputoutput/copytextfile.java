package co.in.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class copytextfile {

	public static void main(String[] args) throws IOException {
		
		
		String source = "C:/Users/Yash Pandey/myfile.txt";
		String target = "C:/Users/Yash Pandey/yourfile.txt";
		
		FileReader reader = new FileReader(source);
		
		FileWriter writer = new FileWriter(target);

		int ch = reader.read();
		
		while(ch!=-1) {
			
			writer.write(ch);
			ch=reader.read();
		}
		writer.close();
		reader.close();
		System.out.println(" data copied");
		
	}

}