package co.in.oop;

public class Person {
	
	
	protected static String address=null;
	protected String fname=null;
	protected String lname=null;
	public Person (){
		
		System.out.println("person default");
	}
	
	public Person(String fn,String ln){
	fname=fn;
	lname=ln;
	
   System.out.println("2 parameter:" + fname+lname);
	

	}
	
	
	public Person(String fn, String ln, String add)
	{ this(ln,fn);
	address=add;
	
	System.out.println("3 parameter:" + fname + lname+address);
}

	public static void main(String[] args) {
		
		Person p = new Person("yash","pandey","indore");
	}
	
}