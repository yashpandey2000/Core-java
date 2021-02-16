package co.in.basic;
public class amstrongnumber {
	public static void main(String[] args){
		
		int a,c=0,temp;
		
		int i=131;
		
		temp=i;
				
			while (i>0)
			{
				a=i%10;
				i=i/10;
				
				c=c+(a*a*a);
			}
		
	if (temp==c)
	{
	
		System.out.println("no. is amstrong");
	
	}
	
	else
		
	{
		System.out.println(" not an amstrong no.:");
		
	}
	
	
  }

}

