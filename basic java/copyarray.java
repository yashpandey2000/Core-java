package in.co.basic;
public class array {
	public static void main (String[] args){

	char[] copyFrom = {'a','b', 'c', 'd', 'e','f','g','h','i','j'};
	
	char[] copyTo = new char[10];
	System.arraycopy(copyFrom,3,copyTo,0,7);
	System.out.println(copyTo);
	}
	

}
