package co.in.collection;

import java.util.Comparator;

public class testemployee implements Comparator<employee> {

	
	public int compare(employee o1, employee o2) {
		
		return o1.getSalary().compareTo(o2.getSalary());
	}

}
