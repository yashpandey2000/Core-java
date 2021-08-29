package co.in.oop;

public class employee extends Person {
	
	private String designation=null;
	
	
	public employee() {

		System.out.println("default employee");
	}
	
public employee(String fn,String ln,String desig) 
{	
super(fn,ln);
designation=desig;
System.out.println("3 parameter:"+fname+lname+designation);
}



public static void main(String[] args) {
	
	
	
	employee s1 = new employee("yash","pandey","qr");
	
		
	}	
		
	


}