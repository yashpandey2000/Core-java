package co.in.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Marksheet implements Comparable<Marksheet> {

private String rollno;
private String fname;
private String lname;
private int phy;
private int chem;
private int math;
	
public Marksheet(){
	
}
public String getRollno() {
	return rollno;
}

public void setRollno(String rollno) {
	this.rollno = rollno;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}



public void setLname(String lname) {
	this.lname = lname;
}


public int getPhy() {
	return phy;
}

public void setPhy(int phy) {
	this.phy = phy;
}


public int getChem() {
	return chem;
}



public void setChem(int chem) {
	this.chem = chem;
}




public int getMath() {
	return math;
}


public void setMath(int math) {
	this.math = math;
}



	public int compareTo(Marksheet m) {
		
		return this.rollno.compareTo(rollno);
	}

	
	public static void main(String[] args) {
		
		
		Marksheet m1 = new Marksheet();
		
		m1.setRollno("1");
		m1.setFname("praveen");
		m1.setLname("pal");
		m1.setPhy(45);
		m1.setChem(90);
		m1.setMath(86);
		
		
		
Marksheet m2 = new Marksheet();
		
m2.setRollno("2");
m2.setFname("praveen");
m2.setLname("kumar");
m2.setPhy(67);
m2.setChem(89);
m2.setMath(80);


Marksheet m3 = new Marksheet();
		
m3.setRollno("3");
m3.setFname("praveen");
m3.setLname("modi");
m3.setPhy(54);
m3.setChem(56);
m3.setMath(78);

		
				
Marksheet m4 = new Marksheet();
		
m4.setRollno("4");
m4.setFname("zamzam");
m4.setLname("siddque");
m4.setPhy(90);
m4.setChem(57);
m4.setMath(68);

		
		
		
		ArrayList<Marksheet> a = new ArrayList<Marksheet>();
		a.add(m1);
		a.add(m2);
		a.add(m3);
		a.add(m4);
		
		Collections.sort(a,new testmarksheet());
		
		Iterator it =a.iterator();
		
		while(it.hasNext()){
			
			Marksheet m = (Marksheet)it.next();
			
			System.out.println(m.getRollno()+" "+ m.getFname()+"   "+m.getLname()+" "+m.getPhy()+" "
				
					+ " "+m.getChem()+" "+m.getMath());
			
			
			
			
		}	
	
	
	}}
