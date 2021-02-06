package in.co.basic;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testdate2 {
	public static void main (String[] args) throws ParseException{
	Date s = new Date();	
	SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		String newdate = sf.format(s);
		
		System.out.println(newdate);
	}
}
