package E2Eflow;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.CustomerPageObjects;
import PageObjects.SiginPage;
import Utility.base;

public class Customer extends base {
	private static Logger log =LogManager.getLogger(Customer.class.getName());
	
	public WebDriver driver;
	@Test
	public void customerCreation() throws IOException
	{

		
		driver=browserInvoke();

		SiginPage si=new SiginPage(driver);
		driver.get("http://ec2-54-252-143-97.ap-southeast-2.compute.amazonaws.com:8080/peduba");
		si.getusername().sendKeys("matt@fknsolutions.com.au");
		si.getpassword().sendKeys("123");
		si.login().click();
		CustomerPageObjects cpo=new CustomerPageObjects(driver);
		cpo.getcustomerlink().click();
		cpo.getAddNew().click();
		
		
		
	}

}
