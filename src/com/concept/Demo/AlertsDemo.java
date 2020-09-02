package com.concept.Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo extends Baseclass {

	public static void main(String[] args) throws InterruptedException{

		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		
		getBrowser("chrome");
		getUrl("http://demo.automationtesting.in/Alerts.html");
		
		WebElement alert1 = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[2]"));
		alert1.click();
		clickOnSingleAlert();
		
		WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alert2.click();
		WebElement cAlert = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[3]"));
		cAlert.click();
		clickOnConfirmAlert("accept");

		WebElement alert3 = driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[3]"));
		alert3.click();
		WebElement pAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		pAlert.click();
		clickOnPromptAlert("dismiss","null");
	
		close();
	}

}
/*driver.get("http://demo.automationtesting.in/Alerts.html");
driver.manage().window().maximize();

WebElement alert1 = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[2]"));
alert1.click();
Thread.sleep(3000);
Alert simplealert = driver.switchTo().alert();
simplealert.accept();
Thread.sleep(3000);

WebElement alert2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
alert2.click();
WebElement cAlert = driver.findElement(By.xpath("(//button[contains(@class,'btn ')])[3]"));
cAlert.click();
Thread.sleep(3000);
Alert confirmalert = driver.switchTo().alert();
confirmalert.accept();
confirmalert.dismiss();

WebElement alert3 = driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[3]"));
		alert3.click();
		WebElement pAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		pAlert.click();
		Thread.sleep(3000);
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("selenium technology");
		promptalert.accept();*/
