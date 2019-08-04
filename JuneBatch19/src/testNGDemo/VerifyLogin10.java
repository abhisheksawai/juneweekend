package testNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class VerifyLogin10 {
	
	@Test
	public void a()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.tagName("wrong")).sendKeys("abhishekTagname");
	}

	@Test(dependsOnMethods="a")
	public void b()
	{
			System.out.println("b");
			
	}
	@Test
	public void c()
	{
			System.out.println("c");
			
	}

	
}
