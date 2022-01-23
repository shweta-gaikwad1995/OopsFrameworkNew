package com.MyTests;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage2;
import com.crm.qa.pages.LoginPage1;

public class LoginTest2 extends BaseTest{
	public LoginTest2() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority=1, enabled=true)
	public void verifyLoginPageTitleTest()
	{
		String title=page.getInstance(LoginPage1.class).getLoginPageTitle();
	}
	
	@Test(priority=2, enabled=true)
	public void verifyLoginPageHeaderTest()
	{
		String header=page.getInstance(LoginPage1.class).getLoginPageHeader();
	}
	
	@Test(priority=3)
	public void doLoginTest()
	{
		HomePage2 homePage=page.getInstance(LoginPage1.class).doLogin("9876543211", "admin");
	String headerHome=homePage.getHomePageHeader();
	}
	
}
