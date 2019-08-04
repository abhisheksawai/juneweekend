package polymorphism;

public class abhijeet extends parent {

	public void chess()
	{
		System.out.println("playing chess");
		super.shadi();
	}
	
	public void shadi()	
	{
		System.out.println("GF");
	}
	
	public static void main(String[] args) {
		
		abhijeet a = new abhijeet();
		a.chess();
		

	}


}
