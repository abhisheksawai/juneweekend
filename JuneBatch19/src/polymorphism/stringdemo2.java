package polymorphism;

public class stringdemo2 {

	public static void main(String[] args) {
		
		
		String name = "Abhishek-stay-in-wadgaon-sheri";
		String words[] = name.split("-");
		//System.out.println(words);
		
		for(String w : words)
		{
			System.out.println(w);
		}
		System.out.println("-------------------------");
		System.out.println(words[2]);
		

	}

}
