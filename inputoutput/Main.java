package co.in.inputoutput;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
	public class Main {
		
		public static void main(String[] args) throws Exception {
			
		
		  
		// FileWriter fw = new FileWriter("C:/Users/Yash Pandey/email.txt");
		//	PrintWriter pw = new PrintWriter(fw);
			
			FileReader fr = new FileReader("C:/Users/Yash Pandey/email.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
		  

			while(line!=null) {
				
				//pw.println(line);
				br.readLine();
			
			
//		  System.out.println("enter your mail id here :");
//	    Scanner sc = new Scanner(System.in);
	   // String ip = sc.nextLine();
	 //  boolean b = emailIdValidation(ip);
	  // if (ip == true)
	     // System.out.println("TRUE");
	  // else
	    //  System.out.println("FALSE");
			// br = new BufferedReader(fr);
			
	    StringTokenizer t = new StringTokenizer(line,"@");
	    String s1 = t.nextToken();
	    String s2 = t.nextToken();
	    StringTokenizer t1 = new StringTokenizer(s2, ".");
	    String s3 = t1.nextToken();
	    String s4 = t1.nextToken();
			
			
	    if (s4.contains("@") && s4.contains(".com ") || s4.equals("!#$%^&*")) {
	    	System.out.println("valid email"+line);
	    }
	      
	    else {
	    	System.out.println("not a valid email"+line);
	    }
	    
	  
	
	  }}}
	
//	  public static void emailIdValidation(String ip) {
//	    int i = 0;
//	   // boolean b = false;
//	    StringTokenizer t = new StringTokenizer(ip, "@");
//	    String s1 = t.nextToken();
//	    String s2 = t.nextToken();
//	    StringTokenizer t1 = new StringTokenizer(s2, ".");
//	    String s3 = t1.nextToken();
//	    String s4 = t1.nextToken();
//	    if (ip.contains("@") && ip.contains(".")&&s4.equals("com")) {
//	    	System.out.println("valid email");
//	    }
//	      
//	    else {
//	    	System.out.println("not a valid email");
//	    }
//	    
//	  }
//	}


