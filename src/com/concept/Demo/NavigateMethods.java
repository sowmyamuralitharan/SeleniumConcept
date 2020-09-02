package com.concept.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods extends Baseclass {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		/*driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(3000);*/
		
		getBrowser("chrome");
		getUrl("https://www.google.com/");
		navigateTo("https://twitter.com/");
		navigateBack();
		navigateForward();
		navigateRefresh();
		
		
		/*close();
		quit();*/
		/*driver.navigate().to("https://www.google.com/");
		Thread.sleep(3000);*/
		
	//	driver.navigate().to("https://twitter.com/");
		
		/*driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();*/
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		/*driver.quit();
		driver.close();*/
		
		
	}

}
