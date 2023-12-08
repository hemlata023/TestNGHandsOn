package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SampleoneTest {
	//WebDriver driver;
	//@BeforeMethod
	   //  public void setup()
	    // {
		  //  driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		//	driver.manage().deleteAllCookies();
	//     }
			
	
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
  @Test()
  
  public void Seleniumrsearch() {
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
  @Test(alwaysRun=true, dependsOnMethods="Seleniumrsearch")
   void Cucumbersearch() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
   	  driver.manage().deleteAllCookies();
   	  driver.get("https://www.google.com");
   	WebElement sercbox =driver.findElement(By.id("APjFqb"));
   	sercbox.sendKeys("java tutorial");
   	sercbox.sendKeys(Keys.ENTER);
  }
  
  @Test(enabled=false)
  void appiumSearch() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
  	  driver.manage().deleteAllCookies();
  	  driver.get("https://www.google.com");
  	WebElement sercbox =driver.findElement(By.id("APjFqb"));
  	sercbox.sendKeys("Appium  tutorial");
  	sercbox.sendKeys(Keys.ENTER);
 }
  
  @Test(enabled=false)
  void CyberSearch() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
  	  driver.manage().deleteAllCookies();
  	  driver.get("https://www.google.com");
  	WebElement sercbox =driver.findElement(By.id("APjFqb"));
  	sercbox.sendKeys("cyber  tutorial");
  	sercbox.sendKeys(Keys.ENTER);
 }
}
	     	
       	    
		
		
	
    
			

