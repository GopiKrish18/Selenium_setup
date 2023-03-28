package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://www.facebook.com/");
		
		WebElement click = check.findElement(By.xpath("(//a[contains(@onclick, 'require')])[2]"));
		
		click.click();
		
		
	}
}
