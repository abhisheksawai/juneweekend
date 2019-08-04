package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo3 {

	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://paytm.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='shPe']")).click();
		System.out.println("check box check");
		//recharge button
		driver.findElement(By.xpath("//button[text()='Recharge Now']")).click();
		String sn = driver.findElement(By.xpath("//button[text()='Recharge Now']")).getText();
		System.out.println(sn);
		System.out.println("check box check");

		
			
		
	}
}
