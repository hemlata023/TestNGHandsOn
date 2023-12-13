package RometeScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteDriverSample {
     
	
	
	@Test
	public void sampetest() throws MalformedURLException{
		ChromeOptions options= new ChromeOptions();
		
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.BROWSER_VERSION, "115");
		String strHub= "";
		RemoteWebDriver driver= new RemoteWebDriver(new URL(strHub), options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
        WebElement sercbox =driver.findElement(By.id("APjFqb"));
		
		sercbox.sendKeys("java tutorial");
		sercbox.sendKeys(Keys.ENTER);
		
		
		  
		
	}
}
