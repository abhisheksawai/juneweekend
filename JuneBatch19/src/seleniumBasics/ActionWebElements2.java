package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionWebElements2 {

	public static void main(String[] args) throws Exception {		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();				
	//driver.get("https://www.facebook.com/");
	driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/?_ga=2.32751611.435706626.1563005481-385890719.1563005481");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
 }
}
