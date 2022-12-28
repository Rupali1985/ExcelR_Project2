package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Base;
import com.pages.ForgetPassword;

public class ForgetPasswordTest extends Base{
	 ForgetPassword fp;
		
		@BeforeMethod
		public void openBrowser() throws IOException {
			initialization();
		}
		
		@Test
		public void validateForgetPassword() throws IOException {	
			fp = new ForgetPassword();
			
		}
		
		@AfterMethod
		public void closeBrowser() {
			tearDown();
		}

}
