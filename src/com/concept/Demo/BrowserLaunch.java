package com.concept.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserLaunch extends Baseclass {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
	
		/*driver.get("https://www.facebook.com/");*/
		
		/*driver.manage().window().maximize();*/

		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");*/
	
		/*WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("1234567");*/
		
		/*WebElement login = driver.findElement(By.id("u_0_b"));
		login.click();*/

		 driver = getBrowser("chrome");
		 getUrl("https://www.facebook.com/");
		
		 WebElement email = driver.findElement(By.id("email"));
		 inputToElement(email,"abc@gmail.com");
		 
		 WebElement password = driver.findElement(By.name("pass"));
		 inputToElement(password,"1234567");
		 
		 WebElement login = driver.findElement(By.id("u_0_b"));
		 clickOnElement(login);
		
		 close();
		
		 quit();
		
		
		
/*driver.close();
driver.quit();*/
		
		
	
	}

}






















