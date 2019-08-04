package interfaceDemo;

public class hdfcbank implements NationalBank {

	public static void main(String[] args) {
		
		RBI hd = new hdfcbank();
		NationalBank b = new bank();		
		
		hd.add();
		hd.sub();
		hd.ROI();	
		hd.hdfcswata();
		
		b.add();
		b.sub();
		b.ROI();
		//b.bankswata();
	

	}

	public void hdfcswata()	{
		System.out.println("hdfcswata");
	}
	
	public void add() {		
		System.out.println("hdfcswata add");
	}

	public void sub() {
		System.out.println("hdfcswata subb");
		
	}	
	public void ROI() {
		System.out.println("hdfcswata rio");
	}

}
