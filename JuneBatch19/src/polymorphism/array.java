package polymorphism;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		
		int[] i  = {10,34,5,9};
		
		for(int a=0;a<=3;a++)
		{
		System.out.println(i[a]);
		}
		
		Arrays.sort(i);
		
		System.out.println("----------");
		for(int a=0;a<=3;a++)
		{
		System.out.println(i[a]);
		}
		
		
	}

}
