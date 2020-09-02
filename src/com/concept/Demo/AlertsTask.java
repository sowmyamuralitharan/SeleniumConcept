package com.concept.Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		alert1.click();
		Thread.sleep(2000);
		Alert simpleAlert = driver.switchTo().alert();
		simpleAlert.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[2]"));
		alert2.click();
		Thread.sleep(2000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		WebElement alert3 = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		alert3.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("sowmya");
		promptAlert.accept();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\test3.png");
		FileUtils.copyFile(srcFile, desFile);			
	}

}
