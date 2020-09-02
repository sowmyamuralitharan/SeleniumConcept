package com.concept.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//driver.manage().window().maximize();
		
		WebElement alert1 = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[2]"));
		alert1.click();
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		
		WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert2.click();
		WebElement cAlert = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[3]"));
		cAlert.click();
		Alert confirmalert = driver.switchTo().alert();
		//confirmalert.accept();
		confirmalert.dismiss();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement alert3 = driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[3]"));
		alert3.click();
		WebElement pAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		pAlert.click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("selenium technology");
		promptalert.accept();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);

	}

}
