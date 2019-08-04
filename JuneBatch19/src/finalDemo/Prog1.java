package finalDemo;

public class Prog1 {
	
	int i = 10;
	
	public void foo()
	{
		i = 20;
		
		System.out.println(i);
		System.out.println("foo");
	}
	
	
	
	public static void main(String[] args) {
		Prog1 p = new Prog1();
		//System.out.println(p.i);
		p.foo();
	}

}
