package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.LoginPage;
import com.pages.MyInfo;

public class MyInfoTest extends Base{
	LoginPage lp;
	MyInfo mi;
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		initialization();
	}
	
	@Test
	private void validateMyInfo() throws IOException, InterruptedException, AWTException {	
		lp = new LoginPage();
		lp.login(prop2.getProperty("username"), prop2.getProperty("password"));
		mi = new MyInfo();
		mi.personalDetails();
		mi.contactDetails();
		mi.emergencyContact();
		lp.logout();
	}
	
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}


}
