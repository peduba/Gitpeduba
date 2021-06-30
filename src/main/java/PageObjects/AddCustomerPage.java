package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCustomerPage {
public WebDriver driver;
	
	By customerName=By.xpath("//input[@id='name']");
	By contactNo=By.xpath("//input[@id='contactNo']");
	By streetNo=By.xpath("//input[@id='street-no']");
	By street=By.xpath("//input[@id='street']");
	By suburb=By.xpath("//input[@id='suburb']");
	By state=By.xpath("//input[@id='state']");
	By postcode=By.xpath("//input[@id='postcode']");
	By selectCategory=By.xpath("//select[@id='categories']");
	By submit=By.xpath("//button[@type='submit']");
	
	
	public  AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getcustomerName()
	{
		return driver.findElement(customerName);
	}
	public WebElement getcustomerContactNo()
	{
		return driver.findElement(contactNo);
	}
	public WebElement getstreetNo()
	{
		return driver.findElement(streetNo);
	}
	public WebElement getStreet()
	{
		return driver.findElement(street);
	}
	public WebElement getSuburb()
	{
		return driver.findElement(suburb);
	}
	public WebElement getState()
	{
		return driver.findElement(state);
	}
	public WebElement getPostcode()
	{
		return driver.findElement(postcode);
	}
	public WebElement getselectCategory()
	{
		return driver.findElement(selectCategory);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}

}
