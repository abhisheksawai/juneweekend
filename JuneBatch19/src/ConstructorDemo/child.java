package ConstructorDemo;

public class child extends parent {

	public child()
	{
		//super();
		System.out.println("cc12");
		//super();
	}
	
	public void c1()
	{
		System.out.println("c1");
	}
	public static void main(String[] args) {		
		child c = new child();
		//parent c = new child();
		//child c = new child();
		//c.p1();
		//c.c1();
	}

}
