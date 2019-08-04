package interfaceDemo;

public class bank implements NationalBank {

	public static void main(String[] args) {
		//bank b = new bank();
		//bank b = new NationalBank();
	//	bank b = new RBI();
		//NationalBank b = new NationalBank();
		//NationalBank b = new bank();
		//NationalBank b = new RBI();
		RBI b = new bank();
		b.add();
		b.sub();
		b.ROI();	
		b.bankswata();
	}
	public void bankswata()
	{
		System.out.println("bankk chi  bankswata");
	}
	public void ROI() {
		System.out.println("bankk chi  ROI");		
	}
	
	public void add() {
		System.out.println("bankk chi add");
		
	}
	public void sub() {
		System.out.println("bankk chi  sub");
		
	}
	

		
	

}
