package co.in.oop;

public class Businessman implements Richman,Socialworker {

	@Override
	public void helpstoother() {
		// TODO Auto-generated method stub
		System.out.println("helps to other");
	}

	@Override
	public void money() {
		// TODO Auto-generated method stub
		System.out.println("money");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		System.out.println("party");
	}

	@Override
	public void earnmoney() {
		// TODO Auto-generated method stub
		System.out.println("earnmoney");
	}

	public static void main(String[] args) {
		
		Richman rm = new Businessman();
		Socialworker sw = new Businessman();
		
		
		rm.earnmoney();
		rm.money();
		rm.party();
		
		sw.helpstoother();
	}
	
	
	
}
