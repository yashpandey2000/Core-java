package in.co.basic;
import java.util.Scanner;
public class prime {
	public static int method(){
		boolean flag=false;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any no:");
		int num = sc.nextInt();
		for (int i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
			  flag=true;
			    break;
			}
		}
			
			if (!flag)
			{
				System.out.println(num+" "+"is a prime no.");
			}
			
			else
			{
				System.out.println(num+" "+"is not a prime no.");
			}
	
	return (int) num;
	}
	




public static void main (String[] args){
	
	prime s = new prime();
	s.method();
	
}
	
}

