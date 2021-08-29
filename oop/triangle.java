package co.in.oop;

public class triangle extends shape{

		
		private int base=0;   
		private int  height=0;
		
		public triangle() {}
		
		public triangle(int b,int h) {
			
			base=b;
			height=h;
		
		}
		
		public double area() {
			
		double	area=(0.5*base*height);
		System.out.println("area of triangle is :"+area);
	return area;
		

		}
		
		public static void main(String[] args) {
			
			shape s1 = new triangle();
			 
			s1.area();
			s1.setBorderwidth(2);
		
			s1.setColor("blue");
			
			System.out.println(s1.getBorderwidth());
			System.out.println(s1.getColor());
		}
	}



