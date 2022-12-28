package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.AddEmp;
import com.pages.LoginPage;

public class AddEmpTest extends Base{
	LoginPage lp;
	AddEmp addemp;
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		initialization();
	}
	
	@Test
	private void validateAddEmp() throws IOException, AWTException, InterruptedException {	
		lp = new LoginPage();
		lp.login(prop1.getProperty("username"),prop1.getProperty("password"));
		addemp = new AddEmp();
		addemp.addEmp();
		lp.logout();
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
