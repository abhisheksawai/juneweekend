package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch2 {

	public static void main(String[] args) {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
	
		//driver.findElement(By.tagName("input")).sendKeys("abhishekTagname");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.partialLinkText("account?")).click();
	}
}
