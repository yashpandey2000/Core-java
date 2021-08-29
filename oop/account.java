package co.in.oop;

public class account {

	
	public class Account {

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
			if(amount>0)
			{
				balance+=amount;
//				return balance;
			System.out.print("after deposit 15000RS 0nly balance is:  ");
			
			}
				
			
		}
		
		public void withdrawl(double amount) {
			if(balance>0 && balance-amount>0 )
			{
				balance-=amount;
//				return balance;
			System.out.print("afetr withdral 2000RSonly Balance is: ");
			
			}
		
		}
			public void fundtransfer(double amount) {
				if(amount>0)
				{
					balance-=amount;
//					return balance;
				System.out.print("afetr fundtransfer of 500RSonly Balance is: ");
				
				}
			}
			
				public void paybill(double amount) {
					if(amount>0)
					{
						balance-=amount;
//						return balance;
					System.out.print("afetr paying bill  1500RSonly Balance is: ");
					
					}
			
			
			
			
	}
		}
	
}
