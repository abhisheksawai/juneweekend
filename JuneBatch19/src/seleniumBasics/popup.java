package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class popup {


	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		driver.switchTo().alert().accept(); // mhanje ok kar ,
//		driver.switchTo().alert().dismiss(); // cancel kar
//		driver.switchTo().alert().getText(); // alert cha text ghenar
//		driver.switchTo().alert().sendKeys("alervarsendkey");
		
		
		
			

		
	
		
		
		
	}
}
