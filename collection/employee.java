package co.in.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class employee implements Comparable <employee>{
	
	private String id;
	private  String lname ;
	private  String fname ;
	private   String salary;
	
	
	
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String  getSalary() {
		return salary;
		}
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public int compareTo(employee o) {

		return this.salary.compareTo(salary);
	}
	
	
	
	
		public static void main(String[] args) {
		
			employee e1 = new employee();
			
			e1.setFname("harsh");
			e1.setLname("yadav");
			e1.setSalary("19000");
			e1.setId("1");
			
			employee e2 = new employee();
			
			e2.setFname("usha");
			e2.setLname("thakur");
			e2.setSalary("100000");
			e2.setId("2");
			
			ArrayList<employee> a = new ArrayList<employee>();
			
			a.add(e1);
			a.add(e2);
			
		Collections.sort(a, new testemployee());
			
			Iterator it = a.iterator() ;
				
				while(it.hasNext()){
					
					employee x =(employee) it.next();
					
					System.out.println(x.getId()+" "+x.getFname()+" "+x.getLname()+" "+x.getSalary());
				}
			
			
			
	}
}
		
	

	


