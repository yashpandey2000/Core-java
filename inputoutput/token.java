package co.in.inputoutput;

import java.util.StringTokenizer;

public class token {

	public static void main(String[] args) {
		
		String str = "yashpandey204@gmail.com" ;
		
		StringTokenizer stn = new StringTokenizer(str,".");
		String token = null;
		
		
		
		while (stn.hasMoreElements()) {
			
			token=stn.nextToken();
			System.out.println("Token is: "+token);
		}

	}

}

