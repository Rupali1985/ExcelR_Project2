package com.pages;

import org.openqa.selenium.By;

import com.base.Base;

public class LoginPage extends Base{
	public void login(String uname,String pwd) throws InterruptedException {
		driver.findElement(By.name(prop1.getProperty("username_name"))).sendKeys(uname);
		driver.findElement(By.name(prop1.getProperty("password_name"))).sendKeys(pwd);
		driver.findElement(By.xpath(prop1.getProperty("loginBtn_xpath"))).click();;
		Thread.sleep(3000);
	}
	
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath(prop1.getProperty("profileBtn_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop1.getProperty("logoutBtn_xpath"))).click();
		Thread.sleep(3000);
	}
	
	

}
