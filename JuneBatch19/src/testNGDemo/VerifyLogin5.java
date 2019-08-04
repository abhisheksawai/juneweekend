package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyLogin5 {
	
	@Test(priority=3)
	public void a()
	{
			System.out.println("a");
	}

	@Test(priority=2)
	public void b()
	{
			System.out.println("b");
	}
	@Test(priority=1)
	public void c()
	{
			System.out.println("c");
	}

	@Test(priority=-1)
	public void db()
	{
			System.out.println("db");
	}
	@Test(priority=0)
	public void da()
	{
			System.out.println("da");
	}

}
