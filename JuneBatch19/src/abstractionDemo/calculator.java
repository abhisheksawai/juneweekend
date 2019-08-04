package abstractionDemo;

public abstract class calculator {
	
	abstract void mul();
	abstract void div();
	
	public void add()
	{
		System.out.println("addition");
	}
	
	public void sub()
	{
		System.out.println("sub");
	}
	
	public static void main(String[] args) {
		calculator c = new calculator();
	}

}
