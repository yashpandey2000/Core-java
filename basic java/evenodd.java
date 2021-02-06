package in.co.basic;
import java.util.Scanner;
public class evenodd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("enter any no. :");
		int n=sc.nextInt();
		if (n%2==0)
		{
			System.out.print(n+" is an even no. ");
			
		}
		else
		{
			System.out.print(n+" is an odd no. ");
		}
		
	}
	
}
	