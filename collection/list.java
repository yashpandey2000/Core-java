package co.in.collection;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		
		List n = new ArrayList();
		
		
		
		n.add(45);
		n.add(56);
		n.add(89);
	
	//	n.clear();
		
		
//		
//for (Object t : n) {
//		System.out.println(t);
//		}
//		
//		
//		System.out.println(n.size());
//	
		
		
//		System.out.println(n.isEmpty());
		
	// System.out.println(n.remove(0));
	//System.out.println(n);
		
//	System.out.println(n.contains(4));
		
		
		List f = new ArrayList();
		
		f.add(4);
		f.add(45);
		f.add(89);
		f.add(34);
	
//		
//		for (Object t1 :f) {
//			
//		
//		System.out.println(t1);}
//		
		
		
		//System.out.println(f);
		
//		
//		f.addAll(n);
//		System.out.println("adding of n elements to f elements :" +f);


		
//  System.out.println(n.containsAll(f));
		
	
//		n.addAll(f);
//	System.out.println(n);
		
		
		
//	System.out.println(f.removeAll(n) +" f:"+f);
		
		
	
//		
	f.retainAll(n);		
		System.out.println("n :"+n);
	System.out.println("f :"+f);
//		

	}

}
