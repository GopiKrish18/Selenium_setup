package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WD {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://www.facebook.com/");
		
		check.manage().window().maximize();
		
		check.navigate().to("https://www.instagram.com/");
		
		check.navigate().back();
		
		check.navigate().refresh();
		
		WebElement user = check.findElement(By.id("email"));
		
		user.sendKeys("@gmail.com");
		
		WebElement ps = check.findElement(By.id("pass"));
		
		boolean selected = ps.isEnabled();
		System.out.println(selected);
		
		ps.sendKeys("Krishna");
		
		WebElement log = check.findElement(By.name("login"));
		
		boolean selected1 = log.isDisplayed();
		System.out.println(selected1);
		
		log.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}