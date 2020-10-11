package com.usa.study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	static WebDriver driver;   
	public static void main(String[] args) {
		
		System. setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser.
		WebDriver driver = new ChromeDriver(); //Up casting.
        driver.get("https://www.ups.com/lasso/login");

	}

}
