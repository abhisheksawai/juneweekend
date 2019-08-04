package stringDemo;

public class String4 {

	public static void main(String[] args) {
		String s1 = new String("chess");  
		String s2 = "chess";
		String s3 = "chess";
		String s4 = new String("chess");
		
		System.out.println(s1==s1);
		System.out.println(s2==s2);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
//		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1==s4);
		
		
//		System.out.println(s2.equals(s3));
//		System.out.println(s2.equals(s4));
//		System.out.println(s3.equals(s4));
				



	}

}
