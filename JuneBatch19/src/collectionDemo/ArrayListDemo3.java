package collectionDemo;

import java.util.ArrayList;
public class ArrayListDemo3 {
	public static void main(String[] args) {	
		
		ArrayList al = new ArrayList();
		
		al.add(new stud(101, "abhishek"));  //al.1 al[1] |  al.2
		al.add(new stud(102, "vishal"));
		al.add(new emp(201, "abhijeet"));
		al.add(new emp(202, "shweta"));		
		for(Object a :al)
		{
			
			
				stud s = (stud) a;				
				System.out.println(s.roll);
				System.out.println(s.name);
			
			
		}

	}

}
