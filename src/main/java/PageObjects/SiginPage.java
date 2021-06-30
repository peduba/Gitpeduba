package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiginPage {

	public WebDriver driver;
	
		By username=By.xpath("//input[@id='username']");
		By password=By.xpath("//input[@id='password']");
		By login=By.xpath("//button[@type='submit']");
		
		public SiginPage(WebDriver driver)
		{
			this.driver=driver;
		}
	
		public WebElement getusername()
		{
			return driver.findElement(username);
		}
		public WebElement getpassword()
		{
			return driver.findElement(password);
		}
		public WebElement login()
		{
			return driver.findElement(login);
		}
}

