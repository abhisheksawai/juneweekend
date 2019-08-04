package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionWebElements {

	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
	
		
	}
}
