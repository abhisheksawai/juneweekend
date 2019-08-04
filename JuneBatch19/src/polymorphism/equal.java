package polymorphism;

public class equal {

	public static void main(String[] args) {
		
		
		String s1 = "Abhishek";  //SCP
		String s2 = "Abhishek";  // SCP
		String s3 = new String("Abhishek"); //Heap
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));  // value baghnar fakt
		System.out.println(s1==s3);  // memory kashi ahe check scp and heap mem
		System.out.println(s1==s2);
		
		String s5 = "ABHISHEK"; 
		System.out.println(s5.toLowerCase());
		
		

	}

}
