package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Order_now {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		WebDriver check = new ChromeDriver();
		check.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI-NWSm-Hh-QIVQYNLBR30HAaPEAAYASAAEgLTw_D_BwE");
		check.manage().window().maximize();
		check.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("8015905207");
		Thread.sleep(1000);
		check.findElement(By.xpath("//input[@type='password']")).sendKeys("Gopi@1234");
		Thread.sleep(2000);
		check.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		check.findElement(By.xpath("//input[contains(@placeholder, 'Search')]")).sendKeys("sneakers for men", Keys.ENTER);
		Thread.sleep(2000);
		check.findElement(By.xpath("//a[text()='Casual Shoes']")).click();
		Thread.sleep(4000);
		check.findElement(By.xpath("//div[text()='Gender']")).click();
		Thread.sleep(2000);
		check.findElement(By.xpath("//div[text() ='Men']")).click();
		Thread.sleep(7000);
		WebElement fed1 = check.findElement(By.xpath("(//select)[1]"));
		Thread.sleep(4000);
		Select ref1= new Select(fed1);
		ref1.selectByIndex(1);
		WebElement fed2 = check.findElement(By.xpath("(//select)[2]"));
		Thread.sleep(4000);
		Select ref2= new Select(fed2);
		ref2.selectByIndex(2);
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[@title='NIKE']")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[text()='40% or more']")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[text()='Navy']")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("(//div[text()='10'])[1]")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(3000);
		check.findElement(By.xpath("//div[text()='Include Out of Stock']")).click();
		
		
}}