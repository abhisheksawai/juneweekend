package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class chekcbox2 {


	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.flipkart.com/search?sid=tyy%2C4io&otracker=CLP_Filters&p%5B%5D=facets.serviceability%5B%5D%3Dfalse");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//WebElement sixgb = driver.findElement(By.xpath("//div[text()='6 GB & Above']"));
	
	
		
		boolean gendercheck;
		gendercheck=driver.findElement(By.xpath("//div[text()='6 GB & Above']")).isSelected();
		System.out.println(gendercheck);
			

		
	
		
		
		
	}
}
