package testNGOne;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvDemo {
	
	@Test(dataProvider="data")
	public void loginfb(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
			@DataProvider
			public Object[][] data()
			{
			Object arr[][]= new Object[2][2];
			arr[0][0]="uname 1";
			arr[0][1]="Password 1";
		
			arr[1][0]="uname 2";
			arr[1][1]="password 2";
		
			return arr;
		
			}


}
