package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.AddVaccancy;
import com.pages.LoginPage;

public class AddVaccancyTest extends Base{
	LoginPage lp;
	AddVaccancy addvc;
	
		@BeforeMethod
		public void openBrowser() throws IOException {
			initialization();
		}
		
		@Test
		private void validateAddVaccancy() throws IOException, AWTException, InterruptedException {	
			lp = new LoginPage();
			addvc = new AddVaccancy();
			lp.login(prop1.getProperty("username"),prop1.getProperty("password"));
			addvc.addVaccancy();
			lp.logout();
		}
		
		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}


}
