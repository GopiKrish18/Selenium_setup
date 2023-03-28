package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		check.manage().window().maximize();
		
		WebElement webErefname = check.findElement(By.xpath("(//select)[3]"));
		
		Select sref = new Select(webErefname); 		
		List<WebElement> op = sref.getOptions(); 
		
		int size = op.size();
		
		System.out.println("Options range:-  "+size);
		
		System.out.println("Options List:-");
		
		for (WebElement webElement : op) {
			
			String text = webElement.getText();
			System.out.println(text);
			
		}
		
		sref.selectByIndex(2);
		sref.selectByIndex(1);
		
		List<WebElement> allSelectedOptions = sref.getAllSelectedOptions();
		
		System.out.println("Selected Dropdown values:-");
		
		for (WebElement webElement : allSelectedOptions) {
			
			
			String text1 = webElement.getText();
			System.out.println(text1);
			
		}
		System.out.println("First Selected DropDown Values:-");
		WebElement firstSelectedOption = sref.getFirstSelectedOption();
		
		String text3 = firstSelectedOption.getText();
		
		System.out.println(text3);
	}
}
