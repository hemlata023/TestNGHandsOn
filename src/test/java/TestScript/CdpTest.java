package TestScript;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CdpTest {
     ChromiumDriver  driver;
     DevTools devTools;
     
     
     @BeforeMethod
     public void setup() {
    	 driver=new ChromeDriver(); 
    	 devTools=driver.getDevTools();
    	 devTools.createSession();
    	 
     }
  @Test
  public void deviceModeTest()
  {
	  Map deviceMetrics=new HashMap() {{
		  put("width",800);
		  put("height",1000);
		  put("deviceScaleFactor",100);
		  put("mobile",true);
	  }};
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
	  driver.get("https://www.selenium.dev/");
	  }
		  
		  
	 
  }

