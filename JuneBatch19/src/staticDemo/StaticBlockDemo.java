package staticDemo;

public class StaticBlockDemo {
	
//	static
//	{
//		System.out.println("static block");
//	}
	
	{
		System.out.println("instant initialiser block");
	}
	
	StaticBlockDemo()
	{
		System.out.println("con");
	}

	public static void main(String[] args) {			
		StaticBlockDemo sb  = new StaticBlockDemo();
	}

}
