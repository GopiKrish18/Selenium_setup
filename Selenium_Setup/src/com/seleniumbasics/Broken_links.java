package com.seleniumbasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		for (WebElement w : alllinks) {
			String link = w.getAttribute("href");
			
			URL url = new URL(link);
			HttpURLConnection con =(HttpURLConnection)url.openConnection();
			if(con.getResponseCode() >= 400) {
				System.out.println(link);
				System.out.println("Broken link");
			}			
		}
	}
}
