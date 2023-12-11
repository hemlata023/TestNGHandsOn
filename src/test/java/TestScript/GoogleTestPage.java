package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTestPage {
	WebDriver driver;
	@Parameters("browser")
    @Test
  public void JavaSearchTest(String strBrowser) {
		if(strBrowser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(strBrowser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
	  //WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
        WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
		sercbox.sendKeys("java tutorial");
		sercbox.sendKeys(Keys.ENTER);
		//Assert.assertEquals(driver.getTitle(),"java Tutorial-Google Search");
		
		
		 
		
		
		driver.close();
	  
  }
}
