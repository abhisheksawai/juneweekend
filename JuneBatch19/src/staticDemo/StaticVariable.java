package staticDemo;

public class StaticVariable {
	static final int c = 0;
	int d = 10;
	StaticVariable()
	{
		c++;
		System.out.println(c);
		//System.out.println(d);
	}	
	public static void main(String[] args) {		
		StaticVariable sv1 = new StaticVariable();		
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();			
		int e = 10;
		//System.out.println(c);
		System.out.println(e);
	}

}
