package co.in.oop;

public class totalarea {
	
	public static void main(String[] args) {
		
	
	shape[] s = new shape[3];
  s[0]= new circle(5);
  s[1]=new triangle(4,8);
  s[2]=new rectangle(12,6);
  double totalarea = calcarea(s);
  System.out.println(totalarea);
	}
	
	public static double calcarea(shape[]s)
	
	{
		
		double totalarea=0;
		
		for(int i = 0;i<s.length;i++) {

			totalarea+=s[i].area();}
	
	
	return totalarea;
  
  
	}
  
}
