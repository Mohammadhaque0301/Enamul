package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System. setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		// Initialize browser.
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
        driver.manage().window().maximize();
 driver.findElement(By.xpath("//button[@class='ui-button-primary ui-cookie-accept-all-medium-large']")).click();
	}

}
