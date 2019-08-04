package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyLogin2 {
	
	@Test(priority=3)
	public void Abc()
	{
			System.out.println("Abc");
	}

	@Test(priority=2)
	public void Abcd()
	{
			System.out.println("Abcd");
	}
	@Test(priority=1)
	public void Abce()
	{
			System.out.println("Abce");
	}
}
