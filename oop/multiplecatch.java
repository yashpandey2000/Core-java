package co.in.oop;

public class multiplecatch {
public static void main(String[] args) {
	

	
	String s1 = "yash";
	
	try {
		
		System.out.println("length of name is"+s1.charAt(5));}
	
	catch(StringIndexOutOfBoundsException e){
		System.out.println("string abhi choti h");
	}
catch (RuntimeException e) {
	System.out.println("error h,"+e.getMessage());

//e.printStackTrace();
}
finally {
	System.out.println("pandit hu");
}

}
}
