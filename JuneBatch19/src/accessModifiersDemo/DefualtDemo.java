package accessModifiersDemo;

public class DefualtDemo {
	
	
	int j = 100;
	
	void check()
	{
		System.out.println("check method");
	}

	public static void main(String[] args) {
		DefualtDemo dm = new DefualtDemo();
		dm.check();
	}
	
}
