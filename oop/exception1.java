package co.in.oop;

public class exception1 {
	
	public static void main(String[] args) {
		
	
			
			try {
				
				try{
					
				double div = 15/0;
				System.out.println("div is:"+div);}
				
				catch(ArithmeticException e){
			
					System.out.println("try-block 1");
				}
			}
			
			
			catch(Exception e) {
				
				try{
					
					double div = 15/0;
					System.out.println("div is:"+div);}
					
					catch(Exception w){
						
						System.out.println("exception h");
					
					}
				
			}

			
			
			
			finally {
				
				
				try{
					System.out.println("finally try block");
					}
					
					catch(Exception e){
						
					System.out.println("finally catch block");
					}	
			}

			
			
			
	}
	
}
