package ConstructorDemo;
public class addition {	
	public void msg()
	{
		System.out.println("mssg");
	}	
	public int add(int a, int b)
	{
		int sum;
		sum = a+b;
		return sum;
	}
	public static void main(String[] args) {		
		addition a = new addition();
		int myadd;
		myadd=a.add(10, 20);
		System.out.println(myadd);
		a.msg();
	}

}
