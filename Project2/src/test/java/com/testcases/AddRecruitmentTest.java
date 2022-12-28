package com.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.AddRecruitment;
import com.pages.LoginPage;

public class AddRecruitmentTest extends Base{
	LoginPage lp;
	AddRecruitment addrc;	
		@BeforeMethod
		public void openBrowser(){
			initialization();
		}
		
		@Test
		private void validateAddRecruitment() throws IOException, AWTException, InterruptedException {	
			lp = new LoginPage();
			addrc = new AddRecruitment();
			lp.login(prop1.getProperty("username"),prop1.getProperty("password"));
			addrc.addRecruitment();
		
		}
		
		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}


}
