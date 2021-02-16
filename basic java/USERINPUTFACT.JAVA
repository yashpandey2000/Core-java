package co.in.basic;
import java.util.Scanner;
public class manupulation {
public static void main(String[] args){
	
	int i=1,fact=1;
	System.out.println("enter any no.:");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	while (i<=num){
		fact = fact*i;
	i++;
	
	}
	System.out.println(fact);
  }

}

