package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class check2Iterator {	
	public static void main(String[] args) {		
	
	ArrayList al = new ArrayList();
	al.add("a");
	al.add("b");
	al.add("c");
	//System.out.println(al.get(2));
	
	Iterator it = al.iterator();
	while(it.hasNext())
	{
		//String s = (String) it.next();
		//System.out.println(s);
		System.out.println(it.next());
	}

	
	}
}
