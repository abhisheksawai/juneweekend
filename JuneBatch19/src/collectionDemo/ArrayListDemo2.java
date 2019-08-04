package collectionDemo;

import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {		
		ArrayList al = new ArrayList();
		al.add("simple");
		al.add(new stud(101, "abhishek"));  //al.1 al[1] |  al.2
		al.add(new stud(102, "vishal"));
		al.add(new emp(201, "abhijeet"));
		al.add(new emp(202, "shweta"));		
	//	System.out.println(al);
		for(Object a :al)
		{
			if(a instanceof stud)
			{
				stud s = (stud) a;				
				System.out.println(s.roll);
				System.out.println(s.name);
			}
			if(a instanceof emp) {			
				emp e = (emp) a;
				System.out.println(e.empno);
				System.out.println(e.empname);
			}
			//System.out.println(a);
		}

	}

}
