package polymorphism;

public class additiondemo {

	public void addition()
	{
		System.out.println("addition");
	}
	public int addition(int z, int y,int a, int b)
	{
		System.out.println("addition");
		return b;
	}
	
	public int addition(int z,int a, int b)
	{
		System.out.println("addition");
		return b;
	}
	
	
	
//	public int addition()
//	{
//		System.out.println("with int return type");
//		int sumq = 10;
//		return sumq;
//	}
	
//	public float addition(int a, float b,int c)
//	{
//		int sum = 0;
//		return sum;
//	}
//	public float addition(int a, float b,int c)
//	{
//		int sumb = 0;
//		return sumb;
//	}
	
	public void addition(int a, int b,float c)
	{
		int sumb = 0;
		//return sumb;
	}
	
	public static void main(String[] args) {		
		additiondemo a = new additiondemo();
		a.addition();
		int summ = a.addition(10, 20);
		System.out.println(summ);

	}

}
