package stringDemo;

import java.util.Arrays;

public class String8 {

	public static void main(String[] args) {
		
		int a[] = {3232,10,20,334,2};
		
		for(int i=0 ; i <a.length ; i ++)
		{
			System.out.println(a[i]);
		}
		System.out.println("---------");
		Arrays.sort(a);
		for(int i=0 ; i <a.length ; i ++)
		{
			System.out.println(a[i]);
		}
		
		//System.out.println(a);
		//a.sort();
		//a[].sort();
	}
}
