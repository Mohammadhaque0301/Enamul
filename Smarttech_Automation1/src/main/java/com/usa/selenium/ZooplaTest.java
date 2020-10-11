package com.usa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ZooplaTest {

 
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\enamh\\eclipse-workspace\\com.usa.smarttech\\Driver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com");
		
		
	}
}
