package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramDemo {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		//driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	//	WebElement email = driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"));
	//	email.sendKeys("acg@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement mobileno = driver.findElement(By.xpath("//input[contains(@aria-label,'Email')]"));
		mobileno.sendKeys("abd@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement fullName = driver.findElement(By.xpath("//input[contains(@aria-label,'Full ')]"));
		fullName.sendKeys("sowmyakannapiran");
		
		Thread.sleep(2000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@aria-label='Username']"));
		userName.sendKeys("meow");
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("123456");
		
		Thread.sleep(2000);

		WebElement signUp = driver.findElement(By.xpath("//button[text()='Sign up']"));
		signUp.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement email = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone ')]"));
		email.sendKeys("abcd@gmail.com");
		
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		pass.sendKeys("123456");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("(//div[contains(@class,'Igw0E     ')])[3]"));
		login.click();*/
	}

}
