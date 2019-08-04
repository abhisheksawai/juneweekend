package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyLogin4 {
	
	@Test(priority=2)
	public void Abc()
	{
			System.out.println("Abc");
	}

	@Test(priority=1)
	public void Abcd()
	{
			System.out.println("Abcd");
	}
	@Test(priority=1)
	public void Abcegw()
	{
			System.out.println("Abce");
	}
	@Test(priority=2)
	public void Abcg()
	{
			System.out.println("Abc");
	}

	@Test(priority=1)
	public void Abcdg()
	{
			System.out.println("Abcd");
	}
	@Test(priority=1)
	public void Abceg()
	{
			System.out.println("Abce");
	}
}
