package com.cyient.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WebAppTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		//platform-android
		//browser-chrome
		//devicename- your mobile device
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName","redmi");
		cap.setCapability("browserName", "chrome");
 
		cap.setCapability("chromedriverExecutable", "D:\\training\\java\\MobileAutomation\\src\\test\\resources\\driver\\chromedriver_83.exe");
		//send details to appium server
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://magento.com/");
	
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("balaji0017@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("balaji@12345");
		
		driver.hideKeyboard();
		
		
		
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
	}

}
