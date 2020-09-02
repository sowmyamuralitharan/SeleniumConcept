package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeDemo {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		search.sendKeys("agar tum saath ho");
		Thread.sleep(2000);*/
		
		/*WebElement findElement = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		findElement.click();
		Thread.sleep(2000);*/
		
		/*WebElement song = driver.findElement(By.xpath("//yt-formatted-string[text()='Agar Tum Saath Ho - Full Song - ALKA YAGNIK and ARIJIT SINGH']"));
		song.click();*/
		
		WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','agar tum saath ho')",search);
		Thread.sleep(3000);
		
		WebElement in = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		js.executeScript("arguments[0].click()",in);
		Thread.sleep(3000);
		
		WebElement song = driver.findElement(By.xpath("//yt-formatted-string[text()='Agar Tum Saath Ho - Full Song - ALKA YAGNIK and ARIJIT SINGH']"));
		js.executeScript("arguments[0].click()",song);
		
		
		
		
		
		
		
	}

}
