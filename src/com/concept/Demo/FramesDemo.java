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

public class FramesDemo extends Baseclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		getBrowser("chrome");
		getUrl("http://demo.automationtesting.in/Frames.html");
		
		WebElement frame1 = driver.findElement(By.id("singleframe"));
		moveToFrame(frame1);
		
		WebElement textBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		inputToElement(textBox,"sowmya");
		
		defaultContent();
		
		WebElement site = driver.findElement(By.xpath("//a[text()='Video']"));
		clickOnElement(site);
		
		WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		clickOnElement(frame2);
		
		WebElement outerFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		moveToFrame(outerFrame);
		
		WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		moveToFrame(innerFrame);
		
		WebElement textBox2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		inputToElement(textBox2,"Selenium");
		
		moveToParentFrame();
		
		moveToParentFrame();
		
		WebElement webTable = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a"));
		clickOnElement(webTable);
		
		takeScreenshot("C:\\\\Users\\\\hp\\\\eclipse-workspace\\\\SeleniumConcept\\\\Screenshot\\\\text4.png");
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();*/
		
		/*WebElement frame1 = driver.findElement(By.id("singleframe"));	
		driver.switchTo().frame(frame1);
		Thread.sleep(2000);*/
		
		/*WebElement textBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		textBox.sendKeys("sowmya");
		Thread.sleep(3000);*/
		
		//driver.switchTo().defaultContent();
		
		/*WebElement site = driver.findElement(By.xpath("//a[text()='Video']"));
		site.click();*/
		
		/*WebElement frame2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		frame2.click();
		Thread.sleep(2000);*/
		
		/*WebElement outerFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(outerFrame);
		System.out.println("swaitched to OuterFrame");
		Thread.sleep(2000);*/
		
		/*WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
		driver.switchTo().frame(innerFrame);
		System.out.println("switched to innerFrame");
		Thread.sleep(2000);*/
		
		/*WebElement textBox2 = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		textBox2.sendKeys("Selenium");
		Thread.sleep(2000);*/
		
		//driver.switchTo().defaultContent();
		//System.out.println("In applicationSite");
		/*driver.switchTo().parentFrame();
		System.out.println("in outerFrame");
		driver.switchTo().parentFrame();
		System.out.println("in site");
		*/
		/*WebElement webTable = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[9]/a"));
		webTable.click();*/
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\text4.png");
		FileUtils.copyFile(srcFile, desFile);*/

		
	}

}
