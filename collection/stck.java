package co.in.collection;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class stck {
	
	public static void main(String[] args) {
		char temp=0;
	  char i1='a';
		char j=i1;
Stack s = new Stack();
Stack s1 = new Stack();
Stack st = new Stack();




for ( i1='a';i1<='z';i1++ ) {
	
	s.push(i1);
	temp=i1;
}

System.out.println(s);


	for ( i1=temp;i1>='a';i1-- )
	{
	
      s1.push (s.pop());	
         
      
     }
         
	
  System.out.println(s1);
//  System.out.println(i1);
  		temp='a';
 
  while(temp!='z' ) {
		
	  temp=(char)s1.peek();
	  st.push(s1.pop());
//	  System.out.println(temp);

  }
  System.out.println(st);
  
  
  
  
  
 
}}
