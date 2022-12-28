package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;

public class LoginPageTest extends Base{
     LoginPage lp;
	
	@BeforeMethod
	public void openBrowser() {
		initialization();
	}
	
	@Test
	private void ValidateLogin() throws IOException, InterruptedException {	
		lp = new LoginPage();
		lp.login(prop1.getProperty("username"),prop1.getProperty("password"));
		lp.logout();
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	

}
