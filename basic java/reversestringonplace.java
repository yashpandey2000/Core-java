package co.in.reverseString;

public class ReverseOnPlace {

	public static void main(String[] args) {
		String s = "Vijay Dinanath Chouhan";
		String c = "";
		String[] ch = s.split(" ");

		for (int i = 0; i < ch.length; i++) {

			for (int j = ch[i].length() - 1; j >= 0; j--) {
				c=c+ch[i].charAt(j);
			}
			c+=" ";
		}
System.out.println(c);
	}

}
