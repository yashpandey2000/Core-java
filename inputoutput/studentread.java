package co.in.inputoutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class studentread {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fo = new FileOutputStream("C:/Users/Yash Pandey/yashta.txt");
		DataOutputStream D = new DataOutputStream(fo) ;
		
		D.writeInt(21);
		
		fo.close();
		D.close();
		
		System.out.println("success");

	}

}
