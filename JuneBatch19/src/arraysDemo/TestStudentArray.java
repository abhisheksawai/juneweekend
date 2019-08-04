package arraysDemo;

public class TestStudentArray {

	public static void main(String[] args) {
		
		student s1 = new student(101,"abhishek");
		student s2 = new student(102,"vaibhavi");
		student s3 = new student(103,"shweta");
		
	student []s = new student[3];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;				
		for(student ss : s)
		{
			System.out.println(ss.roll);
			System.out.println(ss.name);
			
		}
		

	}

}
