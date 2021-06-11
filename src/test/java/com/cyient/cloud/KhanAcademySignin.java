package com.cyient.cloud;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class KhanAcademySignin {
	
	public static void main(String[] args) throws MalformedURLException {
		
	
  DesiredCapabilities caps = new DesiredCapabilities();
      
      // Set your access credentials
      caps.setCapability("browserstack.user", "shubhamdesai_wnyG5a");
      caps.setCapability("browserstack.key", "p8EydWqogyx7UazXyvdv");
      
      // Set URL of the application under test
      caps.setCapability("app", "bs://2880da212dbca173af7cdebea636804935efd304");
      
      // Specify device and os_version for testing
      caps.setCapability("device", "Google Pixel 3");
      caps.setCapability("os_version", "9.0");
        
      // Set other BrowserStack capabilities
      caps.setCapability("project", "First Java Project");
      caps.setCapability("build", "Java Android");
      caps.setCapability("name", "first_test");
        
      
      // Initialise the remote Webdriver using BrowserStack remote URL
      // and desired capabilities defined above
        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(
            new URL("http://hub.browserstack.com/wd/hub"), caps);
        

      /* Write your Custom code here */
        

		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
		driver.findElement(By.xpath("//*[@text='Profile']")).click();
		
		driver.findElement(By.xpath("//*[@text='Sign in']")).click();
        
        
      // Invoke driver.quit() after the test is done to indicate that the test is completed.
     // driver.quit();

}
}
