package co.in.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class deserlizable {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream file = new FileInputStream("C:/Users/Yash Pandey/yashuu.ser");
		
		ObjectInputStream in = new ObjectInputStream(file);
		employee emp = (employee) in.readObject();
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getUsername());
		System.out.println(emp.getPwd());
		

	}

}
