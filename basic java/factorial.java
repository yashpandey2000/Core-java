package co.in.basic;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i = 1, fact = 1;
		System.out.print("Enetr Any Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		while(i<=num){
			fact = fact*i;
			i++;
		} 
		System.out.println(fact);
		 

	}

}

