package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;



public class SampleoneTest {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extenttest;
	
	@BeforeTest
	public void setupExtent() {
		extentReports= new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkRport.html")
		        .viewConfigurer()
		        .viewOrder()
		        .as(new ViewName[] {
		        	ViewName.DASHBOARD,
		        	ViewName.TEST,
		        	ViewName.AUTHOR,
		        	ViewName.DEVICE,
		        	ViewName.LOG,

		        	
		        }).apply();
		        
		extentReports.attachReporter(spark);
	}
	private Object viewConfigurer() {
		// TODO Auto-generated method stub
		return null;
	}
	//@BeforeMethod
	    // public void setup()
	     //{
		  //driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.manage().deleteAllCookies();
	   // }
			
	
	// Soft Assertin Example 
 // @Test
//  public void Cucumbersearch() {
//	  WebDriver driver = new ChromeDriver();
//	   SoftAssert softAssert=new SoftAssert();
//	   softAssert.assertEquals(driver.getTitle(),"Google1");
	     
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://www.google.com");
 //     WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
	//	sercbox.sendKeys("java tutorial");
	//	sercbox.sendKeys(Keys.ENTER);
	//    softAssert.assertEquals(driver.getTitle(),"java Tutorial-Google Search");
	 //   softAssert.assertAll();
    
			
  //}
  @Test(retryAnalyzer= RetryAnalyzerSample.class)
  
  public void Seleniumrsearch() {
	  extenttest =extentReports.createTest("Selenium search Test");
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
     WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
		sercbox.sendKeys("Selenuim tutorial");
		sercbox.sendKeys(Keys.ENTER);
    Assert.assertEquals(driver.getTitle(),"Selenuim Tutorial-Google Search");
	    driver.close();
				
}
  @Test()
   void Cucumbersearch() {
	  extenttest =extentReports.createTest("java search Test");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
   	  driver.manage().deleteAllCookies();
   	  driver.get("https://www.google.com");
   	WebElement sercbox =driver.findElement(By.id("APjFqb"));
   	sercbox.sendKeys("java tutorial");
   	sercbox.sendKeys(Keys.ENTER);
  }
  
  @Test()
  void appiumSearch() {
	  extenttest =extentReports.createTest("appium search Test");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
  	  driver.manage().deleteAllCookies();
  	  driver.get("https://www.google.com");
  	WebElement sercbox =driver.findElement(By.id("APjFqb"));
  	sercbox.sendKeys("Appium  tutorial");
  	sercbox.sendKeys(Keys.ENTER);
 }
  
  @Test()
  void CyberSearch() {
	  extenttest =extentReports.createTest("cyber search Test");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
  	  driver.manage().deleteAllCookies();
  	  driver.get("https://www.google.com");
  	WebElement sercbox =driver.findElement(By.id("APjFqb"));
  	sercbox.sendKeys("cyber  tutorial");
  	sercbox.sendKeys(Keys.ENTER);
  	
  } 	
  @AfterMethod
  public void tearDown(ITestResult result) {
	  if(ITestResult.FAILURE== result.getStatus()) {
		  extenttest.log(Status.FAIL,result.getThrowable().getMessage());
	  }
	  
  }
  	
  	@AfterTest
  	public void finishExtent() {
  		
  		extentReports.flush();
  		
  		
  	}
 }

	     	
       	    
		
		
	
    
			

