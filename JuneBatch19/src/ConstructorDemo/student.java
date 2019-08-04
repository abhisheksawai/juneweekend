package ConstructorDemo;

public class student {	
	int roll;
	String name;	
	public void college()
	{
		System.out.println("college");
	}	
	
	public int student() {			
			System.out.println("add wala int wala");
		//System.out.println(roll+" "+name);
			int add=10;
			return add;
		}

	public student(int i, String string) {
		
		roll = i;
		name = string;
		System.out.println(i+" "+name);
	}

	public student() {
		System.out.println("defulat con");
	}
	
}
