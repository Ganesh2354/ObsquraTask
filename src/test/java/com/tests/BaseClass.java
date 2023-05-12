package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.utils.ExcelDataReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;	
	String email=ExcelDataReader.excelDataReader("Sheet1",1,0);
	String password=ExcelDataReader.excelDataReader("Sheet1",1,1);
	String url="https://www.facebook.com/";
	
	
	@Parameters("browser")
	@BeforeTest	
	public void openBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(4000);	
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(4000);
		}	
	}
	@AfterTest	
	public void closeBrowser()
	{
		driver.close();
	}
	
}
