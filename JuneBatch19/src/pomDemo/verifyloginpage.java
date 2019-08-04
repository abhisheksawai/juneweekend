package pomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifyloginpage {

	@Test
	public void verifylogin()
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\June Batch 19\\junebatchJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.facebook.com/");
			
		loginpage lp = new loginpage(driver);
		
		lp.typeusername("parametername");
		lp.typepassword();
		lp.clickonlogin();
		
	}
	
	
	
	
	
	
	

	 
}
