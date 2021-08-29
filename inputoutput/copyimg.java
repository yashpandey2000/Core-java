package co.in.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;

public class copyimg {

	public static void main(String[] args) throws IOException {
		
		String source = "C:\\Users\\Yash Pandey\\Downloads\\nature-5025558_1920.jpg";
		String target="C:\\Users\\Yash Pandey\\Pictures\\Saved Pictures\\raysteclogo400x400-copy-500x500.jpg";
		
		FileInputStream reader = new FileInputStream(source);
		
		
FileOutputStream writer = new FileOutputStream(target);

int ch =reader.read(); 
while(ch!=-1) {
	
	writer.write(ch);
	ch =reader.read();
}
writer.close();
reader.close();
System.out.println("image copied");

	}

}
