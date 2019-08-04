package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class VerifyLogin9 {
	
	@Test
	public void a()
	{
			System.out.println("a");
	}

	@Test(enabled=false)
	public void b()
	{
			System.out.println("b");
			throw new SkipException("any message");
	}
	@Test
	public void c()
	{
			System.out.println("c");
	}

	
}
