package co.in.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class externizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fs = new FileInputStream("C:/Users/Yash Pandey/yashta.bat");
   //  DataInputStream in = new DataInputStream(fs);
		
     ObjectInputStream oo = new ObjectInputStream(fs);


//System.out.println(in.readChar());
//System.out.println(in.readInt());
//System.out.println(in.readInt());
//System.out.println(in.readInt());
//System.out.println(in.readInt());
System.out.println(oo.readObject());
oo.close();

	}

}
