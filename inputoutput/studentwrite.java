package co.in.inputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class studentwrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("C:/Users/Yash Pandey/yashta.txt");
		
	DataInputStream bi = new DataInputStream(fi);
	
	System.out.println(bi.readInt());

	bi.close();

		

	}

}
