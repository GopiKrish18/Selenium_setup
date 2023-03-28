package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotagain {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		WebDriver check = new ChromeDriver();
		check.get("https://www.amazon.com/");
	}
}
