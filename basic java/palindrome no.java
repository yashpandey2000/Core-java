package co.in.methods;
import java.util.Scanner;
public class Method2 {
	
	public  void  Palindrome(){
		
		int r , sum=0 ,temp;
		
		Scanner sc = new Scanner (System.in);	
		System.out.println("enter any no. :");
		int n = sc.nextInt();
				
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		
		if (temp==sum){
			System.out.println("palidrome no.");}
		else
		{
			System.out.println("not an palindrome no. :");
		}
	
		
	}
		
		
		public static void main(String[] args){
			
			Method2 m = new Method2(); // making of class as object (metod 2)
			m.Palindrome(); // 	caliing of metod		
			
			
			
			
			
		}
		
		
		
		
		
}

