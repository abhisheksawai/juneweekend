package staticDemo;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.rollno = 100;
		s.name = "Abhishek";
		s.CollegeName = "MIT";
		
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.CollegeName);
		
		Student s1 = new Student();
		s1.rollno = 101;
		s1.name = "Abhi";
		s1.CollegeName = "MIT";

		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.CollegeName);
	}

}
