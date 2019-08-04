package seleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).click();
		
		Set <String> ss = driver.getWindowHandles();
		
		Iterator<String> it = ss.iterator();
		String parentwin = it.next();
		String childwin = it.next();		
	// ithe apan child madhe switch zalo - >
		driver.switchTo().window(childwin);		
		
		String InteractionsName=driver.findElement(By.xpath("//h3[text()='Interactions']")).getText();
		System.out.println(InteractionsName);
		
		driver.switchTo().window(parentwin);
		String HomeName=driver.findElement(By.xpath("//strong[text()='Demo Website for Practice Automation']")).getText();
		System.out.println(HomeName);
		
	}

}
