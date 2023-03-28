package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_Ticket {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");			
		WebDriver check = new ChromeDriver();
		check.get("https://in.bookmyshow.com/");
		WebElement city = check.findElement(By.xpath("//input[@type = 'text']"));
		city.sendKeys("Thiruttani");
		check.findElement(By.xpath("//strong[text() = 'Thiruttani']")).click();
		check.manage().window().maximize();
		JavascriptExecutor jsrefname = (JavascriptExecutor) check;
		Thread.sleep(3000);
		WebElement movie = check.findElement(By.xpath("//div[text()='Thiruchitrambalam']"));
		jsrefname.executeScript("arguments[0].scrollIntoView();", movie);
		Thread.sleep(1000);
		jsrefname.executeScript("window.scrollBy(0, -400);");
		jsrefname.executeScript("arguments[0].click();", movie);
		Thread.sleep(1000);
		check.findElement(By.xpath("//button[@data-phase = 'postRelease']")).click();
		Thread.sleep(5000);
		check.findElement(By.xpath("//button[text()= 'Not Now']")).click();
		Thread.sleep(2000);
		check.findElement(By.xpath("//li[@data-slick-index = '1']")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[starts-with(normalize-space(text()),'10:00 PM')]")).click();
		check.findElement(By.xpath("//div[text() = 'Accept']")).click();
		Thread.sleep(7000);
		check.findElement(By.xpath("//li[text() = '5']")).click();
		check.findElement(By.xpath("//div[starts-with(normalize-space(text()),'Select Seats')]")).click();
		check.findElement(By.xpath("(//a[starts-with(normalize-space(text()),'2')])[14]")).click();
		check.findElement(By.id("btmcntbook")).click();
		check.findElement(By.id("prePay")).click();
		
		
		
	}
}
