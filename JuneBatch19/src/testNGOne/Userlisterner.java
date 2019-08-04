package testNGOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGOne.TestOne2Listen.class)
public class Userlisterner {
	
	@Test
	public void fb()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
	
		driver.findElement(By.tagName("wrong")).sendKeys("abhishekTagname");
	}
	
	@Test
	public void c()
	{
			System.out.println("c");
			
	}
}
