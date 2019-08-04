package stringDemo;

public class String7 {

	public static void main(String[] args) {
		
		String s1 = new String("CHESS,is,game is good"); 		
		
		String word[] = s1.split(",");
		
		for( String w: word)
		{
			System.out.println(w);
		}

	}
}
