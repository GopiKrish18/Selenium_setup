package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_training {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jave Programs\\Excersice\\Selenium_Setup\\drive\\chromedriver.exe");
		WebDriver check = new ChromeDriver();
		check.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=2853573901305446040&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=20469&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIi4uRm8_e-QIVyH0rCh0vHw6EEAAYASAAEgILR_D_BwE");

		Actions actrefname = new Actions (check);
		
		WebElement webref = check.findElement(By.xpath("(//a[text() = 'Best Sellers'])[1]"));
		
		//actrefname.contextClick(webref).build().perform();
		//actrefname.clickAndHOld(webref).build().perform();
		//actrefname.Click(webref).build().perform();
		
		WebElement webref2 = check.findElement(By.xpath("//img[@alt = 'Tablets']"));
		actrefname.moveToElement(webref2).build().perform();
		
		check.get("https://www.leafground.com/drag.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		WebElement destination = check.findElement(By.xpath("//p[text()='Drop here']"));
		
		WebElement source = check.findElement(By.xpath("//p[text() = 'Drag to target']"));
		
		actrefname.dragAndDrop(source, destination).build().perform();
	}
}
