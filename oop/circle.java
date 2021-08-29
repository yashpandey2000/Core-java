package co.in.oop;

public class circle extends shape{

	
	private int radius =2;   
	public static final double pi = 3.14d; 
	
	public circle() {}
	
	public circle(int r) {
		
		radius=r;
	}
	
	public double  area() {
		
	double	area=pi*radius*radius;
	System.out.println("area of circle is :"+area);
	return area;
	}
	
	public static void main(String[] args) {
		
		shape s = new circle();
		 
		s.area();
		
		s.setBorderwidth(1);
		s.setColor("red");
		
		System.out.println(s.getBorderwidth());
		System.out.println(s.getColor());
	}
}
