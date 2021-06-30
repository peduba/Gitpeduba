package E2Eflow;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjects.AddCustomerPage;
import PageObjects.CustomerPageObjects;
import PageObjects.SiginPage;
import Utility.base;

public class AddCustomer extends base {
	public WebDriver driver;
	
	@Test
	
	public void newCustomer() throws IOException
	{
		//Customer cus=new Customer();
		//cus.browserInvoke();
		//cus.customerCreation();
		 driver=browserInvoke();
		SiginPage si=new SiginPage(driver);
		driver.get("http://ec2-54-252-143-97.ap-southeast-2.compute.amazonaws.com:8080/peduba");
		si.getusername().sendKeys("matt@fknsolutions.com.au");
		si.getpassword().sendKeys("123");
		si.login().click();
		CustomerPageObjects cpo=new CustomerPageObjects(driver);
		cpo.getcustomerlink().click();
		cpo.getAddNew().click();

	   
		AddCustomerPage acpo=new AddCustomerPage(driver);
		acpo.getcustomerName().sendKeys("Havells");
		acpo.getcustomerContactNo().sendKeys("9494413330");
		acpo.getstreetNo().sendKeys("25");
		acpo.getStreet().sendKeys("Shanthinagar");
		acpo.getSuburb().sendKeys("Nagarjuna model school");
		acpo.getState().sendKeys("Telangana");
		acpo.getPostcode().sendKeys("1234");
		WebElement cs=acpo.getselectCategory();
		
		Select se=new Select(cs);
		se.selectByIndex(1);
		acpo.getSubmit().click();
		
		
	}


}
