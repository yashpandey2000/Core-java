package co.in.collection;

import java.util.Comparator;

public class testmarksheet implements Comparator<Marksheet> {
	
	
	
//
//	public int compare(Marksheet o1, Marksheet o2) {
//		
//		return o1.getRollno().compareTo(o2.getRollno());
//	}
//}


//
//
//public int compare (Marksheet o1, Marksheet o2) {
//{
//	
//	return o1.getMath()-o2.getMath();
//	
//}}}
//	
	
	
	
	public int compare (Marksheet o1, Marksheet o2) {
	
	if(o1.getFname().equals (o2.getFname()))
	{
	
	
		return o1.getLname().compareTo(o2.getLname());
		
	}
	else 
{
	
	return o1.getFname().compareTo(o2.getFname());	
	
	}
}	
}	
//	
	



















	
	
//
//public int compare (Marksheet o1, Marksheet o2) {
//
//	
//	if(o1.getLname().equals (o2.getLname()))
//	{
//	
//	
//		return o1.getFname().compareTo(o2.getFname());
//		
//	}
//	else 
//	{
//	
//	return o1.getLname().compareTo(o2.getLname());	
//	
//	}
	
	
	
	
