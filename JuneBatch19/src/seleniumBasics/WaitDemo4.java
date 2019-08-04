package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo4 {

	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://paytm.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='shPe']")).click();
		System.out.println("check box check");
		//recharge button
		driver.findElement(By.xpath("//button[text()='Recharge Now']")).click();
		WebElement recharge = driver.findElement(By.xpath("//button[text()='Recharge Now']"));
		
		
		String sn = driver.findElement(By.xpath("//button[text()='Recharge Now']")).getText();
		System.out.println(sn);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Recharge Now']")));
		
		
		System.out.println(element.getText());
		
		System.out.println("check box check");

		
			
		
	}
}
