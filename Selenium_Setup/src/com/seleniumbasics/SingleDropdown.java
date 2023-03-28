package com.seleniumbasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdown {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Data_Driven\\drivers\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
//		check.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
//		
//		check.manage().window().maximize();
//		
//		WebElement serefname = check.findElement(By.xpath("(//select)[1]"));
//		
//		Select s1 = new Select(serefname);
//		
//		s1.selectByValue("Google");
//		Thread.sleep(2000);
//		s1.selectByIndex(3);
//		Thread.sleep(2000);
//		s1.selectByVisibleText("Iphone");
		check.get("https://www.facebook.com/");
//		
		check.manage().window().maximize();
		check.findElement(By.xpath(("(//a[@role='button'])[2]"))).click();
		Thread.sleep(3000);
		WebElement serefname = check.findElement(By.xpath("(//select)[2]"));
		Select s1 = new Select(serefname);
		Thread.sleep(2000);
		s1.selectByVisibleText("May");
	}	
	
}
