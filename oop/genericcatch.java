package co.in.oop;

public class genericcatch {
		
	public static void main(String[] args) {
	
		String name= null;
		
		try {
			System.out.println("length of name :"+name.length());
		//	System.out.println("char at 7th position :"+name.charAt(7));
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
