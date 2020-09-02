package com.concept.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement downlogo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",downlogo);
		Thread.sleep(3000);
		
		WebElement amazon = driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
		js.executeScript("arguments[0].scrollIntoView()",amazon);
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1500)");   //positive scrolldown
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-1000)");   //negativeScrollUp
		
	}

}
