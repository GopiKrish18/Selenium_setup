package com.seleniumbasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
	 WebDriver table = new ChromeDriver();
	 table.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	 table.manage().window().maximize();
	 table.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement findElement = table.findElement(By.xpath("(//div[@dir='ltr'])[4]"));//table directly
	List<WebElement> findElements = findElement.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
	for (WebElement webElement : findElements) {
		String text = webElement.getText();
		System.out.println(webElement.getText());
		
	}
	
	int size = findElements.size();
	System.out.println(size);
//	List <WebElement> findElements2 = table.findElements(By.xpath("(//table)[2]/tfoot/tr/td"));

	 
	// int size2 = findElements2.size();
	 //System.out.println(size2);
	 
	 
//	// for (WebElement web : findElements) {
//		 if(size == 4) {
//		 //System.out.println(web.getText());
//		 System.out.println("the table has 4 rows");
//	}else {
//		System.out.println("the table is invalid");
//	}
	}
	}
//}
	
//(//table)[2]/thead/tr/th") - table row heading
//table)[2]/tbody/tr/th") - table column heading
//table)[2]/tbody/tr/td") - entire table data
				