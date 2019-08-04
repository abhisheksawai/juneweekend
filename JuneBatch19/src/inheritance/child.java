package inheritance;

public class child extends parent {

	public void c1()
	{
		System.out.println("this is child c1");
	}
	
	public static void main(String[] args) {
		
//		parent p = new parent();
//		p.p1();
//		p.p2();
		//parent c = new child();
		//child cc = new child();
		parent c = new child();
		//child c = new parent();
		c.c1();
		c.p1();
		c.p2();		

	}
}
