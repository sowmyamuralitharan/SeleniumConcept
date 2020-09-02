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

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		email.sendKeys("sowmyakannapiran17@gmail.com");
		Thread.sleep(3000);
		
		WebElement createAcc = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		createAcc.click();
		Thread.sleep(3000);
		
		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radio.click();
		Thread.sleep(3000);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		name.sendKeys("sowmya");
		Thread.sleep(3000);
		
		WebElement namel = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		namel.sendKeys("k");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		pass.sendKeys("123456");
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.id("days"));
		Select s6 = new Select(day);
		s6.selectByVisibleText("29  ");
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.id("months"));
		Select s7 = new Select(month);
		s7.selectByIndex(5);
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.id("years"));
		Select s5 = new Select(year);
		s5.selectByIndex(7);
		Thread.sleep(3000);
		
		/*WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		fname.sendKeys("Murali");
		Thread.sleep(3000);
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		lname.sendKeys("k");
		Thread.sleep(3000);*/
		
		WebElement company = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		company.sendKeys("Zoho");
		Thread.sleep(3000);
		
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		address.sendKeys("No.12 RamNagar,Chennai");
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		city.sendKeys("Chennai");
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s = new Select(state);
		s.selectByVisibleText("Indiana");
		Thread.sleep(3000);
				
		WebElement zip = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		zip.sendKeys("00000");
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("United States");
		Thread.sleep(3000);
	
		WebElement phoneno = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		phoneno.sendKeys("1234456789");
		Thread.sleep(3000);
		
		WebElement myadd = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		myadd.sendKeys("No.15 TNagar,Chennai");
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		register.click();
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Screenshot\\auto.png");
		FileUtils.copyFile(srcFile, desFile);
	}

}
