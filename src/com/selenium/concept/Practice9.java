package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice9 {

	public static void main(String[] args)throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	/*WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	createAcc.click();*/
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("abc@gmail.com");
	String attribute = email.getAttribute("value");
	System.out.println(attribute);
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("12345");
	String attribute2 = password.getAttribute("class");
	System.out.println(attribute2);
	Thread.sleep(2000);
	

	WebElement createAc = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
	createAc.click();
	Thread.sleep(2000);
	
	
	WebElement day = driver.findElement(By.id("day"));
	Select s = new Select(day);
	s.selectByIndex(2);
	Thread.sleep(2000);
	
	WebElement month = driver.findElement(By.id("month"));
	Select s1 = new Select(month);
	s1.selectByVisibleText("May");
	Thread.sleep(2000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select s2 = new Select(year);
	s2.selectByIndex(5);
	Thread.sleep(2000);
	
	String text = month.getText();
	System.out.println(text);
	
	String text2 = day.getText();
	System.out.println(text2);
	
	
	
		
		
	}

}
