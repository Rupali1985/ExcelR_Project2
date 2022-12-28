package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import com.base.Base;

public class AddEmp extends Base{
	public void addEmp() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath(prop2.getProperty("pimBtn_xpath"))).click();
		driver.findElement(By.xpath(prop2.getProperty("addBtn_xpath"))).click();
		driver.findElement(By.xpath(prop2.getProperty("firstname_xpath"))).sendKeys(prop2.getProperty("firstname"));
		driver.findElement(By.xpath(prop2.getProperty("middlename_xpath"))).sendKeys(prop2.getProperty("middlename"));
		driver.findElement(By.xpath(prop2.getProperty("lastname_xpath"))).sendKeys(prop2.getProperty("lastname"));
		driver.findElement(By.xpath(prop2.getProperty("id_xpath"))).sendKeys(prop2.getProperty("id"));
		driver.findElement(By.xpath(prop2.getProperty("addimageBtn_xpath"))).click();
		
	    Robot rb = new Robot();
		
		StringSelection path = new StringSelection(prop2.getProperty("image"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.setAutoDelay(3000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.setAutoDelay(5000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(5000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath(prop2.getProperty("logindetailsBtn_xpath"))).click();
		driver.findElement(By.xpath(prop2.getProperty("username_xpath"))).sendKeys(prop2.getProperty("username"));
		driver.findElement(By.xpath(prop2.getProperty("password_xpath"))).sendKeys(prop2.getProperty("password"));
		driver.findElement(By.xpath(prop2.getProperty("cpassword_xpath"))).sendKeys(prop2.getProperty("cpassword"));
		Thread.sleep(2000);
	    driver.findElement(By.xpath(prop2.getProperty("saveBtn_xpath"))).click();
		Thread.sleep(5000);

	}
}
