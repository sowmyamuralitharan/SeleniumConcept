package com.task.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonTask2 {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		//driver.manage().window().maximize();
		
		
		WebElement deal = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(deal).perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement cusservice = driver.findElement(By.xpath("//a[text()='Customer Service']"));
		ac.contextClick(cusservice).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement gift = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
		ac.contextClick(gift).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement registry = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
		ac.contextClick(registry).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement signin = driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]"));
		ac.contextClick(signin).perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("========ID for Parent Window=========");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		String title = driver.switchTo().window(windowHandle).getTitle();
		System.out.println(title);
		
		System.out.println("========All Ids=======");
		Set<String> allId = driver.getWindowHandles();
		for (String id : allId) {
			
			String title2 = driver.switchTo().window(id).getTitle();
			System.out.println(title2);
			}

		for (String id : allId) {
			
			if(driver.switchTo().window(id).getTitle().equals("Amazon Sign-In"))
			{
				WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
				email.sendKeys("abx@gmail.com");
				break;
			}
			
		}	
		
	}

}
