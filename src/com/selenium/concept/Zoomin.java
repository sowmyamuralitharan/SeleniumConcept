package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoom.us/signin");
	//	driver.manage().window().maximize();
		
		WebElement findElement2 = driver.findElement(By.xpath("//input[@type='email']"));
		findElement2.sendKeys("sowmyakannapiran17@gmail.com");
		
		
		WebElement findElement3 = driver.findElement(By.id("password"));
		findElement3.sendKeys("SowmyaMurali@12");
		
		WebElement findElement4 = driver.findElement(By.xpath("//a[text()='Sign In']"));
		findElement4.click();
		
		
	//	WebElement findElement3 = driver.findElement(By.xpath("//input[@type='password']"));
	//	findElement3.sendKeys("Sowmya");
	}

}
