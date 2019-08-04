package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
		
		WebElement bdayelement= driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select  s = new Select(bdayelement);		
		//Select s1 = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("6");
		Thread.sleep(3000);
		s.selectByVisibleText("13");
		
		//List<WebElement> bdaylist = s.getOptions().size();
		//System.out.println(bdaylist.);
	
		
		
		
		int bdaysize = s.getOptions().size();
		System.out.println(bdaysize);

		
		
	}
}
