package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class AddRecruitment extends Base{
public void addRecruitment() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath(prop5.getProperty("recruitmentBtn_xpath"))).click();
		driver.findElement(By.xpath(prop5.getProperty("addBtn_xpath"))).click();
		driver.findElement(By.xpath(prop5.getProperty("firstname_xpath"))).sendKeys(prop5.getProperty("firstname"));
		driver.findElement(By.xpath(prop5.getProperty("middlename_xpath"))).sendKeys(prop5.getProperty("middlename"));
		driver.findElement(By.xpath(prop5.getProperty("lastname_xpath"))).sendKeys(prop5.getProperty("lastname"));
		
		driver.findElement(By.xpath(prop5.getProperty("selectvaccancy_xpath"))).click();
		List <WebElement> items=driver.findElements(By.xpath(prop5.getProperty("selectmenu_xpath")));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("Software Engineer"))
            {
            	items.get(i).click();
            }

		}
		driver.findElement(By.xpath(prop5.getProperty("email_xpath"))).sendKeys(prop5.getProperty("email"));
		driver.findElement(By.xpath(prop5.getProperty("mob_xpath"))).sendKeys(prop5.getProperty("mob"));
		
		driver.findElement(By.xpath(prop5.getProperty("selectfileBtn_xpath"))).click();
		Robot rb=new Robot();
		
		StringSelection path = new StringSelection(prop5.getProperty("document"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		
		rb.setAutoDelay(5000);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		
		rb.setAutoDelay(7000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.setAutoDelay(7000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath(prop5.getProperty("keywords_xpath"))).sendKeys(prop5.getProperty("keywords"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop5.getProperty("notes_xpath"))).sendKeys(prop5.getProperty("notes"));
		driver.findElement(By.xpath(prop5.getProperty("keepdataBtn_xpath"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop5.getProperty("saveBtn_xpath"))).click();
		Thread.sleep(3000);
     }

}
