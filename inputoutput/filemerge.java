package co.in.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class filemerge {

	public static void main(String[] args) throws IOException {
		
		FileWriter f = new FileWriter("C:\\Users\\Yash Pandey\\student3.txt");
		PrintWriter pw = new PrintWriter(f);
		
		FileReader fr = new FileReader("C:\\Users\\Yash Pandey\\student1.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		
		
		while(line!=null) {
			
			pw.println(line);
			line = br.readLine();
		}

		

		//FileReader fr = );
 br = new BufferedReader(new FileReader("C:\\Users\\Yash Pandey\\student2.txt"));
		
		 line = br.readLine();
		while(line!=null) {
			
			pw.println(line);
			line = br.readLine();
			
		}
		
		
		pw.flush();
		
		
		br.close();
		pw.close();
		
		System.out.println("merge file1 and file2 into file3 ");
			
		
	}

}
