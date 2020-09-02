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
import org.openqa.selenium.support.ui.Select;

public class FacebookDemo {

public static void main(String[] args) throws InterruptedException, IOException   {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//driver.manage().window().maximize();
	Thread.sleep(2000);
	
		WebElement createAcc = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		boolean enabled = createAcc.isEnabled();
		System.out.println(enabled);
		createAcc.click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean displayed = firstName.isDisplayed();
		System.out.println(displayed);
		firstName.sendKeys("Sowmya");
		String attribute = firstName.getAttribute("value");
		System.out.println("value sent by us =" +attribute);
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("(//input[contains(@class,'inputtext ')])[4]"));
		lastName.sendKeys("murali");
		String attribute2 = lastName.getAttribute("class");
		System.out.println(attribute2);
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		boolean displayed2 = email.isDisplayed();
		System.out.println(displayed2);
		email.sendKeys("sow@gmail.com");
		String attribute3 = email.getAttribute("class");
		System.out.println(attribute3);
		Thread.sleep(2000);
		
		WebElement reEnterEmail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reEnterEmail.sendKeys("sow@gmail.com");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("124467");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByVisibleText("4");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("4");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2017");
		Thread.sleep(2000);
		
	/*	String text = day.getText();
		System.out.println(text);
		
		String text2 = month.getText();
		System.out.println(text2);
		
		String text3 = year.getText();
		System.out.println(text3);*/
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\test1.png");
		FileUtils.copyFile(srcFile, desFile);
		
		
	}

}
