package com.concept.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdownDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement list = driver.findElement(By.id("multi-select"));
		Select s= new Select(list);
		s.selectByValue("Florida");
		s.selectByVisibleText("Ohio");
		s.selectByIndex(6);
		Thread.sleep(4000);
		
		
		
		
		
		

		
		
		
		/*WebElement list = driver.findElement(By.id("select-demo"));
		Select s = new Select(list);
		boolean multiple2 = s.isMultiple();
		System.out.println(multiple2);
		s.selectByValue("Wednesday");
		Thread.sleep(3000);*/
		
		/*WebElement multi = driver.findElement(By.id("multi-select"));
		Select s1 = new Select(multi);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		
		s1.selectByVisibleText("Texas");
		s1.selectByIndex(1);
		s1.selectByValue("Washington");
		Thread.sleep(3000);*/
		
		/*List<WebElement> al = s1.getAllSelectedOptions();
		for (WebElement option : al)
		{
			
			System.out.println(option.getText());
			
		}
		
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		Thread.sleep(3000);
		
		s1.deselectAll();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
