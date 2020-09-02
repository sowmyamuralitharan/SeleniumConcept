package com.concept.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?");
		
		//driver.manage().window().maximize();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("sowmyakannapiran17@gmail.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys("123456");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		sign.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(women).perform();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		ac.moveToElement(tshirt).perform();
		ac.click().perform();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement pic = driver.findElement(By.xpath("//a[@class='quick-view-mobile']"));
		pic.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		System.out.println("inside frame");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement quantity = driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]"));
		quantity.click();
		System.out.println("clicked");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select s = new Select(size);
		s.selectByVisibleText("L");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement color = driver.findElement(By.xpath("//a[@id='color_14']"));
		color.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement button = driver.findElement(By.xpath("//button[@name='Submit']"));
		button.click();
		System.out.println("button clicked");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		Thread.sleep(4000);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		checkout.click();
		System.out.println(" checkout clicked");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement checkout2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		checkout2.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement checkout3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		checkout3.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		WebElement chckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		chckbox.click();
		Thread.sleep(4000);
		
		WebElement chckout4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		chckout4.click();
		Thread.sleep(4000);
		
		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		pay.click();
		Thread.sleep(4000);

		WebElement confirmorder = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirmorder.click();
		Thread.sleep(4000);
		
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dress.click();	
	}

}
