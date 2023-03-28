package com.seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot_Training{
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://www.facebook.com/");
		
		check.manage().window().maximize();
		
		WebElement webErefname = check.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		
		webErefname.click();
		
		Thread.sleep(5000);//after click give buffer time for the driver to take screenshot.
		
		TakesScreenshot screenrefname = (TakesScreenshot) check;
		
		File sourcerefname = screenrefname.getScreenshotAs(OutputType.FILE);
		
		File destinationrefname = new File("\\C:\\Jave Programs\\Excersice\\Selenium_Setup\\src\\screenshot\\snapshot6.png");
		
		FileHandler.copy(sourcerefname, destinationrefname);
	}

	
}

