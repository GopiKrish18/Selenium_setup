package com.seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TicketBook_Task {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		WebDriver ticket = new ChromeDriver();
		ticket.get("https://www.makemytrip.com");
		ticket.manage().window().maximize();
		WebElement findElement = ticket.findElement(By.xpath("//span[text()='Buses']"));
		findElement.click();
		ticket.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		ticket.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu']")).click();
		ticket.findElement(By.xpath("//input[@autocomplete ='off']")).sendKeys("coim");
		Thread.sleep(3000);
		ticket.findElement(By.xpath("(//div[@class='makeFlex column'])[1]")).click();
		ticket.findElement(By.xpath("(//div[text()='25'])[2]")).click();
		ticket.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(3000);
		ticket.findElement(By.xpath("//img[@class='primoCloseIcon']")).click();		
		Thread.sleep(2000);
		ticket.findElement(By.xpath("(//a[@class='sc-jKJlTe bPClQZ'])[8]")).click();
		Thread.sleep(2000);
		ticket.findElement(By.xpath("(//span[text()='Koyambedu'])[2]")).click();
		ticket.findElement(By.xpath("//span[text()='Omni Bus Stand']")).click();
		ticket.findElement(By.xpath("(//img[@class='seat-icon'])[43]")).click();
		ticket.findElement(By.xpath("//span[text()='BOOK SEATS']")).click();	
		ticket.findElement(By.id("fname")).sendKeys("Gopi");
		ticket.findElement(By.id("age")).sendKeys("26");
		ticket.findElement(By.xpath("//p[@tabindex='0']")).click();
		ticket.findElement(By.xpath("//span[@class='trdic-male-2x']")).click();
		ticket.findElement(By.id("contactEmail")).sendKeys("gopikrishna18.gk@gmail.com");
		ticket.findElement(By.id("mobileNumber")).sendKeys("8015905207");
		ticket.findElement(By.xpath("//span[@class='lineHeight18 paddingT02']")).click();
		ticket.findElement(By.xpath("(//span[text()='Continue to Book Now'])")).click();					
	}
}