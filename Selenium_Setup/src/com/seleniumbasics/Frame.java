package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Data_Driven\\drivers\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://leafground.com/frame.xhtml");
		
		check.switchTo().frame(0);//by index method
		Thread.sleep(2000);
		check.findElement(By.id("Click")).click();
		
		
		check.switchTo().defaultContent();
		check.switchTo().frame(2);
		check.switchTo().frame(0);
		check.findElement(By.id("Click")).click();
		check.switchTo().parentFrame();
		
		List<WebElement> frames = check.findElements(By.xpath("//iframe"));
		int size = frames.size();
		
		System.out.println(size);
		
	
	}	
}
