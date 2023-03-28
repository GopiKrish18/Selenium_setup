package com.seleniumbasics;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotr {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		WebDriver check = new ChromeDriver();
		check.get("https://www.amazon.com");
		check.findElement(By.id("twotabsearchtextbox")).click();
		
//		Robot ref = new Robot();
//		
//		
//		ref.keyPress(KeyEvent.VK_S);
//		ref.keyPress(KeyEvent.VK_H);
//		ref.keyPress(KeyEvent.VK_I);
//		ref.keyPress(KeyEvent.VK_R);
//		ref.keyPress(KeyEvent.VK_T);
//		
//		ref.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);
//		ref.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(4000);
//		
//		
//		ref.keyPress(KeyEvent.VK_CONTROL);
//		ref.keyPress(KeyEvent.VK_T);
//		Thread.sleep(7000);
//		ref.keyRelease(KeyEvent.VK_CONTROL);
//		ref.keyRelease(KeyEvent.VK_T);
//		
		
		
}
}