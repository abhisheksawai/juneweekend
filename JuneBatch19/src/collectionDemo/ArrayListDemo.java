package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		ArrayList all = new ArrayList();
		al.add("abhishek");
		al.add(10);
		al.add(200);
		al.add("fir se");
		//System.out.println(al.toString());
		
		//al.remove("abhishek");
		System.out.println(al);
		//al.remove(1);
		System.out.println("--------");
		System.out.println(al);
		al.set(1, "abhishekreplace");
		System.out.println(al);
		System.out.println(all.isEmpty());
		al.clear();
		System.out.println(al);

	}

}
