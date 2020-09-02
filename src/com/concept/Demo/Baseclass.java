package com.concept.Demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName) {

		try {
			if(browserName.equalsIgnoreCase("chrome"))
			{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("ie"))
			{
			System.setProperty("webdriver.ie.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\IEDriver.exe");
			driver = new InternetExplorerDriver();
			}
			else
			{
				System.out.println("invalid browser");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
		}
	
	public static void waitForElementVisibility(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void getUrl(String Url) {

		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void inputToElement(WebElement element,String value) {
     
		waitForElementVisibility(element);
		
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void clickOnElement(WebElement element) {

		try {
			waitForElementVisibility(element);
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close() {

		try {
			driver.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void quit() {

		try {
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void navigateTo(String value) {

		try {
			driver.navigate().to(value);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void navigateBack() {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void navigateForward() {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void navigateRefresh() {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickOnSingleAlert() {
		
		try {
			Alert simplealert = driver.switchTo().alert();
			simplealert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public static void clickOnConfirmAlert(String condition) {

		try {
			if(condition.equalsIgnoreCase("accept"))
			{
			Alert confirmalert = driver.switchTo().alert();
			confirmalert.accept();
			}
			else if(condition.equalsIgnoreCase("dismiss"))
			{
				Alert confirmalert = driver.switchTo().alert();
                confirmalert.dismiss();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void clickOnPromptAlert(String condition, String value) {

		try {
			if(condition.equalsIgnoreCase("accept"))
			{
			Alert promptalert = driver.switchTo().alert();
			promptalert.sendKeys(value);
			promptalert.accept();
			}
			else if(condition.equalsIgnoreCase("dismiss"))
			{
			Alert promptalert = driver.switchTo().alert();
			promptalert.dismiss();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void moveToFrame(WebElement element) {

		waitForElementVisibility(element);
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void defaultContent() {

		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void moveToParentFrame() {

		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void takeScreenshot(String Url) throws IOException  {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File desFile = new File(Url);
		FileUtils.copyFile(srcFile, desFile);
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

