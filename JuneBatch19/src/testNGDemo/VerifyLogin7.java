package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLogin7 {
	
	@BeforeTest
	public void beforetestcheck()
	{
		System.out.println("beforetestcheck");
	}
	
	@AfterTest
	public void aftrtestcheck()
	{
		System.out.println("after");
	}
	
	@Test
	public void a()
	{
			System.out.println("a");
	}

	@Test
	public void b()
	{
			System.out.println("b");
	}



}
