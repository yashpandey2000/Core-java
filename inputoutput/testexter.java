package co.in.inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class testexter {

	public static void main(String[] args) throws IOException {
		
FileOutputStream file = new FileOutputStream("C:/Users/Yash Pandey/yashta.bat");
		
		//DataOutputStream out = new DataOutputStream(file);

		ObjectOutputStream out = new ObjectOutputStream(file);
		
//		out.writeChar('n');
//		out.writeInt(81);
//		out.writeInt(78);
//		out.writeInt(89);
//		out.writeInt(900);
		out.writeObject("i am here to win");
		out.close();
		file.close();
		
		System.out.println("success");

	}

}
