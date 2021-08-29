package co.in.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class testserilizable {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:/Users/Yash Pandey/yashuu.ser");
		
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		employee emp = new  employee("12","yash","yash@2000","12345");
		
		out.writeObject(emp);
		out.close();
		
		System.out.println("done");

	}

}
