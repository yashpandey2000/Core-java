package co.in.oop;

public abstract class testfund {

	public static void main(String[] args) {
		testA1 t = new testA1();
		
		t.setAccounttype("Saving Account");
		System.out.println("Accont type :"+t.getAccounttype());
		t.setNumber("103767483");
		System.out.println("Account no. :"+t.getNumber());
		
		t.setBalance(1500);
		
	//	t.deposit(100);
	  // double balance = t.getBalance();
		
		
		try	{
			transfer(t.withdrawl(1500));
		
		}
	 catch (Insufficientfundexception i) {
		 
		System.out.println(i.getMessage());
		}
		finally {
			System.out.println("                             Thankyou (HDFC bank...)");
		}
		
	}

	private static void transfer(double fund) throws Insufficientfundexception{
	
		//if (fund<500) {
			
 		//Insufficientfundexception v = new Insufficientfundexception();

			//throw v;		}
		
		

			
		}

	}


