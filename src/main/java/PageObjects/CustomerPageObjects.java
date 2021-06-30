package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPageObjects {
	public WebDriver driver;
	
	By customerLink=By.xpath("//span[contains(text(),'Customers')]");
	By addNew=By.partialLinkText("Add N");
	
	
	public CustomerPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getcustomerlink()
	{
		return driver.findElement(customerLink);
	}
	public WebElement getAddNew()
	{
		return driver.findElement(addNew);
	}
}
