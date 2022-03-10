package com.crm.qa.pages;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 extends BasePage{

	public LoginPage1(WebDriver driver) throws IOException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private By emailId=By.id("username");
	private By password=By.id("password");
	private By loginButton=By.xpath("//button[normalize-space()='Login']");
	private By header=By.xpath("//img[@class='logo-icon margin-r-10']");
	

	
	
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() //Encapsulation getter methods
	{
		return getElement(emailId);
	}
	
	/**
	 * @return the password
	 */
	public WebElement getPassword() //Encapsulation getter methods
	{
		return getElement(password);
	}
	
	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton()//Encapsulation getter methods
	{
		return getElement(loginButton);
	}
	
	/**
	 * @return 
	 */
	public String getLoginPageHeader()//Encapsulation getter methods
	{
		return getPageHeader(header);
	}
	/**
	 * @return 
	 * @return title
	 */
	public String getLoginPageTitle()//Encapsulation getter methods
	{
		return getPageTitle();
	}
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return 
	 */
	public HomePage2 doLogin(String username,String password)
	{
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		return getInstance(HomePage2.class);
	}
	
	/**
	 * @return
	 */
	public void  doLogin()
	{
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
		
	}
	//username: 9876543211
	public void doLogin(String userCred)
	{
		if(userCred.contains("username"))
		{
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}else if(userCred.contains("password"))
		{
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();
	}
	
	
	
}
