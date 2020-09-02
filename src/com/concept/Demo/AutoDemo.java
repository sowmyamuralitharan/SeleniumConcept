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

public class AutoDemo
{

	public static void main(String[] args) throws InterruptedException, IOException{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sowmyakannapiran17@gmail.com");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("123456");
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.id("SubmitLogin"));
		signin.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\auto1.png");
		FileUtils.copyFile(srcFile, desFile);
		
	}

}
