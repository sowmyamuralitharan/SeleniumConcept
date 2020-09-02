package com.concept.Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sowmya");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(2000);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver1 = new ChromeDriver();
		
		driver1.get("https://www.google.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(2000);
		
		int length = driver.getCurrentUrl().length();
		System.out.println(length);
		
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		int length2 = driver.getTitle().length();
		System.out.println(length2);
		Thread.sleep(2000);
		
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		//Thread.sleep(2000);
		
		int length3 = driver.getPageSource().length();
		System.out.println(length3);
		Thread.sleep(2000);
		
		//driver.close();
		 // driver1.quit();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\test2.png");
		FileUtils.copyFile(srcFile, desFile);	
		
	}

}
