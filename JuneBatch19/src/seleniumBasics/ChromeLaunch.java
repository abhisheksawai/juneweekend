package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
		//textbox me username enter karenge
		//driver.findElement(By.name("email")).sendKeys("abhishek");
		//driver.findElement(By.id("email")).sendKeys("abhishekid");
		//driver.findElement(By.className("inputtext")).sendKeys("abhishekClass");
		//driver.findElement(By.type("email")).sendKeys("abhishekid");
		
		// xpath , tagName , css, linktext, partial link text , name , id , classname
		driver.findElement(By.tagName("input")).sendKeys("abhishekTagname");
		//driver.findElement(By.xpath("experssion")).sendKeys("abhishek");
		
		driver.findElements(By.tagName("input")).getsize();
	}

}
