package com.MyTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.crm.qa.pages.BasePage;
import com.crm.qa.pages.Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	public Page page;
	
	
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUpTest(String browser) throws IOException
	{
	if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		/*
		else if(browser.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}*/
		else {
			System.out.println("no browser");
		}
		driver.get("http://103.50.162.196/testing/index.php");
		try {
			Thread.sleep(6800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		page = new BasePage(driver);
	}
/*
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/
}
