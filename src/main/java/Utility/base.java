package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
	public WebDriver browserInvoke() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kirankumar\\eclipse-workspace\\Peduba\\resources\\data.properties");
		prop.load(fis);
		String browserName=System.getProperty("browser");
		//String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedrivertwo\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else if(browserName.equals("firefox"))
		{
			
				System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.29.1-win64\\geckodriver.exe");
				driver=new FirefoxDriver();
				
			}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
	public void getScreenshot(String testName,WebDriver driver) throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\screenshots\\"+testName+".png";
		System.out.println(destinationFile);
		FileUtils.copyFile(source, new File(destinationFile));
		
	}
	}
	

