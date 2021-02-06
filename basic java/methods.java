package co.in.methods;

public class Method1 {
	
	public static int add(){
		int a = 45;
		int b = 12;
		int sum = a+b;
		return sum;
		}
	public static int sub(){
		int a = 45;
		int b = 12;
		int sub = a-b;
		return sub;
		}
	

	public static void main(String[] args) {
		int c = add();
		System.out.println(c);
		int d = sub();
		System.out.println(d);

	}

}
