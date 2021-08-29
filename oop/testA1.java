package co.in.oop;

public class testA1 {
	

			private String number=null;
			private String accounttype=null;
			private double balance=0.00;
			public String getNumber() {
				return number;
			}
			public void setNumber(String number) {
				this.number = number;
			}
			public String getAccounttype() {
				return accounttype;
			}
			public void setAccounttype(String accounttype) {
				this.accounttype = accounttype;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			
			public void deposit(double amount) {
				
					balance+=amount;
//					return balance;
				System.out.println("after deposit" +amount+ " 0nly balance is:"+balance);
				
				}
					
			
			public double withdrawl(double amount) throws Insufficientfundexception {
				if(balance>amount && balance-amount>=500)
				{
					balance-=amount;
				
				System.out.println("After withdral " +amount+ "RS  Remaning  Balance is: " +balance);
				
				}
				else
				{
					System.out.println("Min balance is Required upto 500Rs");
					System.out.println("You have to required Rs: "+(500-(balance-amount)));
			throw new Insufficientfundexception("please recharge your account");
				}
				return balance;
			}
			
			
				public void fundtransfer(double amount) {
					if(amount>0)
					{
						balance-=amount;
//						return balance;
					System.out.print("after fundtransfer  Balance is: ");
					
					}
				}
				
					public void paybill(double amount) {
						if(amount>0)
						{
							balance-=amount;
//							return balance;
						System.out.print("after paying bill  Balance is: ");
						
						}
				
				
				
				
		}
					
					
				
}
	

















