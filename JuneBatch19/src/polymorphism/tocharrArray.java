package polymorphism;

public class tocharrArray {

	public static void main(String[] args) {
		
		
		String name = "Abhishek";
		//String words[] = name.split("-");
		//System.out.println(words);
		
		char ch[] = name.toCharArray();
		System.out.println(ch.length);
		for(int i =0; i <ch.length; i++)
		{
			System.out.println(ch[i]);
		}
	}

}
