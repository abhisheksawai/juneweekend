package accessModifiersDemo;

public class ProtectedDemo {
	
	protected int k = 103;
	
	public void foo()
	{
		System.out.println("protected method");
	}
	
	protected void koo()
	{
		System.out.println("koo");
	}

	public static void main(String[] args) {
		
		ProtectedDemo pd = new ProtectedDemo();
		pd.foo();
	}
}
