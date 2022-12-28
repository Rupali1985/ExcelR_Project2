package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class ForgetPassword extends Base{
public void forgetPassword() throws InterruptedException {
		
		driver.findElement(By.xpath(prop4.getProperty("forgetpasswordBtn_xpath"))).click();
		driver.findElement(By.xpath(prop4.getProperty("username_xpath"))).sendKeys(prop2.getProperty("username"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop4.getProperty("resetpassword_xpath"))).click();
	    Thread.sleep(3000);
		}


}
