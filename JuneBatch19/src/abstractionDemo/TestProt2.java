package abstractionDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import accessModifiersDemo.ProtectedDemo;

public class TestProt2 { 
	
	// Method to convert characters 
	// of a string to opposite case 
	static void convertOpposite(StringBuffer str) 
	{ 
		int ln = str.length(); 
			
		// Conversion using predefined methods 
		for (int i=0; i<ln; i++) 
		{ 
			Character c = str.charAt(i); 
			if (Character.isLowerCase(c)) 
				str.replace(i, i+1, Character.toUpperCase(c)+""); 
			else
				str.replace(i, i+1, Character.toLowerCase(c)+""); 
			
		} 
		
		 String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        //System.out.println("Reversed string is:");
	        System.out.println(reverse);
		
	} 
	
	public static void main(String[] args) 
	{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer();
		 str=br;
		//StringBuffer str = new StringBuffer("This is a Question"); 
		// Calling the Method 
		convertOpposite(br); 
		//System.out.println("printint in main---");
		//System.out.println(str); 
		} }
