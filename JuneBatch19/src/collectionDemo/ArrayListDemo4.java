package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
	
		al.add(null);
		al.add("abhishek");
		al.add(10);
		al.add(200);
		al.add("fir se");
		al.add(null);
		al.add(2002);
		//System.out.println(al);
		
		for(int i =0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}


	}

}
