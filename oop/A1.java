package co.in.oop;

public class A1 {
	
public static void main(String[] args) throws Insufficientfundexception {
		
		
	testA1 t = new testA1();
		
		t.setAccounttype("Saving account");
		t.setBalance(45000);
		t.setNumber("103767483");
		
		
		System.out.println("Accont type :"+t.getAccounttype());
		
		System.out.println("total balance :"+t.getBalance());
		
		System.out.println("account no. :"+t.getNumber());
		
		t.deposit(15000);
		System.out.println(t.getBalance( ));
		 t.withdrawl(2000);
		System.out.println(t.getBalance( ));
		t.fundtransfer(500);
		System.out.println(t.getBalance( ));
		t.paybill(1500);
		System.out.println(t.getBalance( ));
		
		
	}

}

