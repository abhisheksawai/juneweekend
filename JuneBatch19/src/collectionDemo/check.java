package collectionDemo;

import java.util.ArrayList;

public class check {	
	public static void main(String[] args) {		
	
	ArrayList al = new ArrayList();
	al.add("abhishek");
	al.add("sawai");
	
	System.out.println(al);
	
	ArrayList al2 = new ArrayList(al);
	al2.add("al2add");
	System.out.println(al2);
	
	ArrayList al3 = new ArrayList();
	al3.addAll(al);
	System.out.println(al3);
	
	}
}
