package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://paytm.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		

	}

}
