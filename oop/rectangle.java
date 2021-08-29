package co.in.oop;

public class rectangle extends shape {

	private int length=0;   
	private int  breadth=0;
	
	public rectangle() {}
	
	public rectangle(int l,int b) {
		
		length=l;
		breadth=b;
	}
	
	public double area() {
		
	double	area=length*breadth;
	System.out.println("area of rectangle is :"+area);
	return area;
	}
	
	public static void main(String[] args) {
		
		shape s2 = new rectangle();
		 
		s2.area();
		
		s2.setBorderwidth(3);
		s2.setColor("purple");
		
		
		
		System.out.println(s2.getBorderwidth());
		System.out.println(s2.getColor());
		
	}

}
