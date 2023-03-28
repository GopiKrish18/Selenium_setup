package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Data_Driven\\drivers\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://demoqa.com/alerts");
		
		//WebElement webEref = check.findElement(By.xpath("(//button[text() = 'Click me'])[3]"));
		
		//webEref.click();
		
		//Thread.sleep(6000);
		
		//check.switchTo().alert().dismiss();
		
		JavascriptExecutor jsrefname = (JavascriptExecutor) check;
		Thread.sleep(3000);
		WebElement scroll = check.findElement(By.xpath("//span[text()='Modal Dialogs']"));
		jsrefname.executeScript("arguments[0].scrollIntoView();", scroll);
		jsrefname.executeScript("window.scrollBy(0,-100);");
		WebElement prompt = check.findElement(By.xpath("(//button[text() = 'Click me'])[4]"));
		jsrefname.executeScript("arguments[0].click();", prompt);
		
		check.switchTo().alert().sendKeys("Gopi Krishna");
		check.switchTo().alert().accept();
		
//		//jsrefname.executeScript("alert('successful');");
//		Thread.sleep(1000);
//		//jsrefname.executeScript("history.go(0)");
//		String strtext = jsrefname.executeScript("return.document.title;").toString();
//		System.out.println(strtext);
//		String strtext1 = jsrefname.executeScript("return document.URL;").toString();
//		System.out.println(strtext1);
//		//jsrefname.executeScript("window.location = 'https://www.facebook.com/'");
//		Thread.sleep(2000);
//		//String fulltext = jsrefname.executeScript("return.document.documentElement.innerText;").toString();
//		//Thread.sleep(6000);
//		//System.out.println(fulltext);
//		String string = jsrefname.executeScript("return arguments[0].innerHTML", prompt).toString();
//		System.out.println(string);
//	
		
		
		
		
		

		
		
		
	}
}
