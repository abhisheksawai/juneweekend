package abstractionDemo;

public class testCalc extends calculator {
	
	void mul() {		
		System.out.println("mul");		
	}
	void div() {
		System.out.println("div");		
	}
	void sin()
	{
		System.out.println("sin");
	}

	public static void main(String[] args) {
		//testCalc tc = new testCalc();
		//calculator tc = new testCalc();
		//testCalc tc = new calculator();
		calculator tc = new calculator();
		tc.add();
		tc.sub();
		tc.mul();
		tc.div();
		tc.sin();
	}
}
