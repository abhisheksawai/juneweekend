package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

public class mousehover {


	public static void main(String[] args) throws Exception {		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		String thirdhalf="]";		

		
		for(int i =1; i<=10; i ++)		{
			
				System.out.println(driver.findElement(By.xpath(firsthalf+i+secondhalf)).getText());
				String checkcompany = driver.findElement(By.xpath(firsthalf+i+secondhalf)).getText();
				if(companyname.equals(checkcompany))
				{
					System.out.println("currnet value of share is ");
					System.out.println(driver.findElement(By.xpath(firsthalf+i+againsecond+3+thirdhalf)).getText());
				}
			
		
		
		}
		
		
	}
}
