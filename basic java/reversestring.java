package co.in.reverseString;

public class ReverseString {

	public static void main(String[] args) {
	
		
		String s = "Vijay Dinanath Chouhan";
		char ch[] = s.toCharArray();
		
		String reverse = "";
		
		for(int i  = ch.length-1;i>=0;i--){
			reverse = reverse + ch[i];
			
			
		}
		System.out.println(reverse);

	}

}
