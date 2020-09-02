package com.concept.Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
	//	driver.manage().window().maximize();
		
		System.out.println("===Data====");
		List<WebElement> allData = driver.findElements(By.xpath("//table[@id='customers']"));
		for(WebElement data:allData)
		{
			System.out.println(data.getText());
		}
		
		System.out.println("===========all data=====");
		List<WebElement> allda = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for(WebElement data1:allda)
		{
			System.out.println(data1.getText());
		}
		
		System.out.println("particular row");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(row.size());
		for(WebElement parRow : row)
		{
			System.out.println(parRow.getText());
		}
		
		System.out.println("====particular data=====");
		WebElement dat = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[2]"));
		System.out.println(dat.getText());
		
		System.out.println("====particular column=====");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for(WebElement parCol : col)
		{
			System.out.println(parCol.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
