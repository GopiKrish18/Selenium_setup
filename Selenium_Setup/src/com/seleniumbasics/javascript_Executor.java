package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_Executor {
	public static void main(String[] args) {
		
		WebDriver check = new ChromeDriver();
		check.get("https://www.facebook.com");
		check.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)check;
//		WebElement scrollElement = check.findElement(By.xpath("//span[text()=' Meta © 2022']"));
//		js.executeScript("arguments[0].scrollIntoView();",scrollElement);//scroll using argument
		js.executeScript("history.go(0)");//refresh
		js.executeScript("alert('hi JavaScript');");//alert Msg
		check.switchTo().alert().accept();
//		WebElement text = check.findElement(By.xpath("//img[@alt='Facebook']"));
//		String text2 = text.getText();
//		String string = js.executeScript("return arguments[0].innerHTML",text2).toString();
//		System.out.println(string);
		
		js.executeScript("window.location = 'https://amazon.com'");
 
	} 
}
