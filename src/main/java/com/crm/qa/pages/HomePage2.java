package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage2 extends BasePage{
	
	private By header =By.xpath("//h2[starts-with(text(),'Dashboard')]");

	public HomePage2(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public WebElement getHeader()
	{
		return getElement(header);
	}
	
	//page actions
	public String getHomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader()
	{
		return getPageHeader(header);
	}
}
