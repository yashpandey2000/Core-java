package co.in.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
	
	public static void main(String[] args) {
		
		
		Set s = new HashSet();
		
		s.add(56);
		s.add(36);
		s.add(89);
		s.add(45);
		s.add(56);
		s.add(67);
		s.add(79);
		s.add(88);
		s.add(91);
		s.add(11);
		
		System.out.println("hashset="+s);
		
		
Set g = new TreeSet<>();
		
s.add(56);
g.add(36);
g.add(89);
g.add(45);
g.add(56);
g.add(67);
g.add(79);
g.add(88);
g.add(91);
g.add(11);


		System.out.println("treehset="+g);
		
		
Set i = new LinkedHashSet();
		
i.add(56);
i.add(36);
i.add(89);
i.add(45);
i.add(56);
i.add(67);
i.add(79);
i.add(88);
i.add(91);
i.add(11);
		
		System.out.println("linkedhashset="+i);
		
		
		
		
	}

}
