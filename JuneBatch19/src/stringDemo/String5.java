package stringDemo;

public class String5 {

	public static void main(String[] args) {
		
		String s1 = new String("CHESS"); 		
		System.out.println(s1.toLowerCase());
		String s2 = "small";
		System.out.println(s2.toUpperCase());
		
		String s11 = new String("wadgaon iws in pwune");
		System.out.println(s11.replace('w', 'x'));
		System.out.println(s11.replaceAll("in", "out"));

	}
}
