package pomDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropDemo {
	
	@Test
	public void facebooklogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
		
		File src = new File("E:\\World Of Program\\JuneBatch19\\OR.properties");
		FileInputStream fis = new FileInputStream(src);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		File srcc = new File("E:\\World Of Program\\JuneBatch19\\data.properties");
		FileInputStream fiss = new FileInputStream(srcc);
		
		Properties propd = new Properties();
		propd.load(fiss);
		
		driver.findElement(By.id(prop.getProperty("username"))).sendKeys(propd.getProperty("username"));
	}

}
