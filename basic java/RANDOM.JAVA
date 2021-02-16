package co.in.basic;

public class Random {
	
	public static void main(String[] args){

   int n=100;
   int sum=0;
   
   for(int i=0;i<100;i++)
   {
	   n=n+1;
	   if (n%7==0)
		   
   {

	
		   System.out.print(" "+n);
		   sum=sum+n;
   }
   
  
   }
    System.out.println();   
   System.out.println(sum);
		   
    }

}

