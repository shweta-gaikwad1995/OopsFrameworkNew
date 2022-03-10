package com.crm.qa.pages;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public  abstract class AbstractPage {
WebDriver driver;
WebDriverWait wait;

public AbstractPage(WebDriver driver) {
	this.driver=driver;
	this.wait=new WebDriverWait(this.driver,20);
	
}

//abstract methods


public abstract String getPageTitle();
public abstract String getPageHeader(By locator);
public abstract WebElement getElement(By locator);
public abstract void waitForElementPresent(By locator);
public abstract void waitForPageTitle(String title);


//Generics
public <TPage extends BasePage>TPage getInstance(Class<TPage> pageClass) 
{
	try {
		return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null; 
	}
	
	
}




}

