package co.in.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class readwrtitelist implements Serializable{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
FileOutputStream fo = new FileOutputStream("C:\\Users\\Yash Pandey\\ram.txt");
ObjectOutputStream o = new ObjectOutputStream(fo);
		

ArrayList l = new ArrayList ();

l.add("ram");
l.add("syam");
l.add("vishu");
l.add("nishu");
l.add("ragav");


o.writeObject(l);
o.close();


FileInputStream fs = new FileInputStream("C:\\Users\\Yash Pandey\\ram.txt");
ObjectInputStream os = new ObjectInputStream(fs);

	//	System.out.println(os.readObject());
		
		
		Iterator it = l.iterator();
		
		while(it.hasNext())
			{
			Object oo = it.next();
					System.out.println(oo);
			
			}
		
		
		
		
		
		
	
				
	}			

	}


