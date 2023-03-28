package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		
		WebDriver check = new ChromeDriver();
		
		check.get("https://www.facebook.com/");
		
		WebElement newaccount = check.findElement(By.xpath("(//a[@role = 'button'])[2]"));
		
		newaccount.click();
		
		Thread.sleep(2000);//main area
		
		WebElement firstname = check.findElement(By.name("firstname"));

		
		Thread.sleep(2000);
		firstname.sendKeys("gpokrish");
	
		WebElement lastname = check.findElement(By.xpath("//input[@name = 'lastname']"));
		
		lastname.sendKeys("A");
		
		WebElement number = check.findElement(By.xpath("//input[@name = 'reg_email__']"));
		
		number.sendKeys("8015905207");
		
		WebElement pass = check.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
		
		pass.sendKeys("Gopi@299234");
		
		WebElement date = check.findElement(By.xpath("//select[@name = 'birthday_day']"));
		
		Select day = new Select(date);
		
		day.selectByVisibleText("29");
		
		
		WebElement month = check.findElement(By.xpath("//select[@name = 'birthday_month']"));
		
		Select mymonth = new Select(month);
		
		mymonth.selectByVisibleText("Feb");
		
		WebElement year = check.findElement(By.xpath("//select[@name = 'birthday_year']"));
		
		Select ye = new Select(year);
		
		ye.selectByVisibleText("1996");
		
		WebElement Gender = check.findElement(By.xpath("//label[text() = 'Male']"));
		
		Gender.click();
		
		WebElement signup = check.findElement(By.xpath("(//button[@type = 'submit'])[2]"));
		
		signup.click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
