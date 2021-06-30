package E2Eflow;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObjects.SiginPage;
import Utility.base;

public class LoginTest extends base{
	ExtentReports extent;
	private static Logger log =LogManager.getLogger(LoginTest.class.getName());
	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports+\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Peduba Automation Results");
		reporter.config().setDocumentTitle("Web Automation Results");
	
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TesterName", "Kiran Kumar");
		
		
	}
	@Test
	public void loginPeduba() throws IOException
	{
		ExtentTest test=extent.createTest("loginPeduba");
		driver=browserInvoke();
		driver.get("http://ec2-54-252-143-97.ap-southeast-2.compute.amazonaws.com:8080/peduba");
		log.info("Launch url");
		SiginPage si=new SiginPage(driver);
		si.getusername().sendKeys("matt@fknsolutions.com.au");
		log.info("Enter username");
		si.getpassword().sendKeys("1234");
		log.info("password");
		si.login().click();
		log.info("click on login button");
		test.fail("Results not found");
		extent.flush();
	}

}
