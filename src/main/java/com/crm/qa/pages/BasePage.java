package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page{

	public BasePage(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPageTitle() {
		
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		 //waitForElementPresent(locator);
		 waitForElementPresent(locator);
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
			//waitForElementPresent(locator); 
			waitForElementPresent(locator);			//There was Error here
			element=driver.findElement(locator);
			return element;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("some error occurred while creating element"+locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
	
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Some exceptions/error occurred while waiting for the element"+locator.toString());
		}
		
	}

	@Override
	public void waitForPageTitle(String title) {
	try {
		wait.until(ExpectedConditions.titleContains(title));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("some exceptions/error occurred while waiting for the element"+title);
	}
	
	
	
	}

}
