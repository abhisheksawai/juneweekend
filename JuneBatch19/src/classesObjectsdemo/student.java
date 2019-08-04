package classesObjectsdemo;

public class student {

	int rollno;
	String name;
	
	public void s1()
	{
		System.out.println("this is s1 of stdu");
	}
	
	public static void main(String[] args) {

		student s = new student();
		s.rollno =10;
		s.name = "sneha";
		s.s1();
		
		System.out.println(s.rollno);
		System.out.println(s.name);
	}

}
