package pomDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class loginpage {
		
		By username = By.id("email");
		By password = By.id("pass");
		By loginbutton = By.xpath("//*[@id='u_0_2']");
		WebDriver driver;
			
		public loginpage(WebDriver driver){		
			this.driver=driver;		
		}

		
		public void typeusername(String uname)
		{
			driver.findElement(username).sendKeys(uname);
		}
		
		public void typepassword()
		{
			driver.findElement(password).sendKeys("password");
		}
		public void clickonlogin()
		{
			driver.findElement(loginbutton).click();
		}
		
		
	
}
