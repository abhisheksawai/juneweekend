package collectionDemo;

public class stud {
	int roll;
	String name;
	public stud(int roll, String name) {	
		this.roll = roll;
		this.name = name;
//		roll=this.roll;
//		name=this.name;		
}
	public void display()
	{
		System.out.println(roll+" "+name);
	}
}
