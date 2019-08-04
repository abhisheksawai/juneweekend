package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jseDemp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.trivago.in/");
		//driver.findElement(By.xpath("//input[@id='querytext']")).sendKeys("check");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('querytext').value='Pune'");
		System.out.println("jse ok");

	}

}
