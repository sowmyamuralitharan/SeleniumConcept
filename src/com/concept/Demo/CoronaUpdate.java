package com.concept.Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaUpdate {

	public static void countryUpdate(String CountryName) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	    List<WebElement> headers = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
	    
	    for(int i=0;i<headers.size();i++)
	    {
	    	System.out.println(i+ " " +headers.get(i).getText().replaceAll("\n"," "));
	    }
	
	   List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr"));
	   System.out.println("number of countries =" +allrows.size()+"\n");
	   
	   for(int i=0;i<allrows.size(); i++)
	   {
		   List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[\"+i+\"]/td"));
		   
		   for(int j=0;j<alldata.size(); j++)
		   {
			   if(alldata.get(j).getText().contains(CountryName))
			   {
				   System.out.println("countryName:" +alldata.get(1).getText());
				   System.out.println("TotalCases:" +alldata.get(2).getText());
				   System.out.println("NewCases:" +alldata.get(3).getText());
				   System.out.println("Total death:" +alldata.get(4).getText());
				   System.out.println("Total Recovered:" +alldata.get(6).getText());
				   System.out.println("Population:" +alldata.get(13).getText());
				      
			   }
		   }
      }
	System.out.println();
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
