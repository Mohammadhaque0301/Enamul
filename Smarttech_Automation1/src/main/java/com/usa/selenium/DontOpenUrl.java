package com.usa.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DontOpenUrl {

   static WebDriver drive;	
	
   public static void main(String[] args)  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\enamh\\eclipse-workspace\\com.usa.smarttech\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.zoopla.co.uk/");
	driver.manage().window().maximize();
	

}
}

	
	
	

