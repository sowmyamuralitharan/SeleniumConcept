package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/signup");
		
		WebElement findElement = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[1]"));
		findElement.sendKeys("sowmya");
		
		WebElement findElement2 = driver.findElement(By.xpath("(//input[@autocapitalize='sentences'])[2]"));
		findElement2.sendKeys("9123345678");
		
	
		
		
	}

}
 
