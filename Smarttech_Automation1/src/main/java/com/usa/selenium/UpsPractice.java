package com.usa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsPractice {
 static WebDriver driver;
 public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\enamh\\eclipse-workspace\\com.usa.smarttech\\Driver\\chromedriver.exe");	
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.ups.com/us/en/Home.page");
   String div;
driver.findElement(By.xpath("div[@class='//qGXjvb]'"));
   
   
 
 } 
}
