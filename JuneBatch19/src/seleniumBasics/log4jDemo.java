package seleniumBasics;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class log4jDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Logger log = Logger.getLogger("according to tets case");
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("browser launch kiya");
		driver.get("https://www.flipkart.com/");
		log.info("browser launch ho gaya");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		log.info("element par click kiya");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Electronics')]"));
		log.info("element par click karte hai fir se");
		log.info("===============");
		log.error("we are giving error msg");
		
		
	

	}

}
