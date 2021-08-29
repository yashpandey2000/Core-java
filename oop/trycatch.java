package co.in.oop;

public class trycatch {

public static void main(String[] args) {
	
try {
	try{										
	double div = 15/0;
	System.out.println("div is:"+div);}
	catch(ArithmeticException e){
		
		System.out.println("exception h");
	
	}
}
		
	//it work in both case if there is exception or not
	
		finally {
			
			System.out.println("2nd error :");
		}
		
	}
	

}
	

