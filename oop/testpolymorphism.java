package co.in.oop;

public class testpolymorphism extends polymorphism {
	

	public testpolymorphism() {}
	
	public testpolymorphism(int r ) {
		
		this.radius=r;
	}
		
	
		public  void area(){
			double area= pi*radius*radius;
			System.out.println(+area);

		}
		
		public static void main(String[] args) {
			
			
			polymorphism s =  new testpolymorphism (4);
			
			
			
			s.area();
			s.setborderwidth(3);
			
			s.setColor("red");
			
	System.out.println(s.getColor());
	System.out.println(s.getborderwidth());
			
		}
		

	}


