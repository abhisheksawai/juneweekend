package inheritance;

public class newchild extends newparent {

	public void hobby()
	{
		//super.shadi();
		System.out.println("chess");
		//super.shadi();

	}	
	public void shadi()
	{
		super.shadi();
		System.out.println("gf from child");
		super.shadi();
	}	
	
	public static void main(String[] args) {		
		//child c = new child();
		newchild nc = new newchild();
		nc.hobby();
		nc.shadi();		
		//super.shadi();	
	}

}
