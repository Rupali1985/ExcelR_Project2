package com.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class MyInfo extends Base{
public void personalDetails() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath(prop3.getProperty("myinfoBtn_xpath"))).click();
		driver.findElement(By.xpath(prop3.getProperty("nickname_xpath"))).sendKeys(prop3.getProperty("nickname"));
		driver.findElement(By.xpath(prop3.getProperty("otherid_xpath"))).sendKeys(prop3.getProperty("otherid"));
		driver.findElement(By.xpath(prop3.getProperty("expdate_xpath"))).sendKeys(prop3.getProperty("expdate"));
		Thread.sleep(2000);
		List <WebElement> items=driver.findElements(By.xpath(prop3.getProperty("nationality_xpath")));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("Indian"))
            {
            	items.get(i).click();
            }

		}
		Thread.sleep(3000);
		
		List <WebElement> items1=driver.findElements(By.xpath(prop3.getProperty("maritalstatus_xpath")));
		for(int i=0;i<items1.size();i++)
		{
			if(items1.get(i).getText().equals("Married"))
            {
            	items1.get(i).click();
            }

		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(prop3.getProperty("genderBtn_xpath"))).click();
		driver.findElement(By.xpath(prop3.getProperty("miltery_service_xpath"))).sendKeys(prop3.getProperty("miltery_service"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop3.getProperty("saveBtn_xpath"))).click();
        Thread.sleep(3000);
     
     }
     
     public void contactDetails() throws InterruptedException
     {
        driver.findElement(By.xpath(prop3.getProperty("myinfoBtn_xpath"))).click();
        driver.findElement(By.xpath(prop3.getProperty("contactBtn_xpath"))).click();
		driver.findElement(By.xpath(prop3.getProperty("street1_xpath"))).sendKeys(prop3.getProperty("street1"));
		driver.findElement(By.xpath(prop3.getProperty("street2_xpath"))).sendKeys(prop3.getProperty("street2"));
		driver.findElement(By.xpath(prop3.getProperty("city_xpath"))).sendKeys(prop3.getProperty("city"));
		driver.findElement(By.xpath(prop3.getProperty("state_xpath"))).sendKeys(prop3.getProperty("state"));
		driver.findElement(By.xpath(prop3.getProperty("zip_code_xpath"))).sendKeys(prop3.getProperty("zip_code"));
		List <WebElement> items2=driver.findElements(By.xpath(prop3.getProperty("countryselect_xpath")));
		for(int i=0;i<items2.size();i++)
		{
			if(items2.get(i).getText().equals("India"))
            {
            	items2.get(i).click();
            }

		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(prop3.getProperty("home_tele_xpath"))).sendKeys(prop3.getProperty("home_tele"));
		driver.findElement(By.xpath(prop3.getProperty("mob_xpath"))).sendKeys(prop3.getProperty("mob"));
		driver.findElement(By.xpath(prop3.getProperty("work_tele_xpath"))).sendKeys(prop3.getProperty("work_tele"));
		driver.findElement(By.xpath(prop3.getProperty("work_email_xpath"))).sendKeys(prop3.getProperty("work_email"));
		driver.findElement(By.xpath("work_email_xpath")).sendKeys(prop3.getProperty("other_email"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop3.getProperty("saveBtn1_xpath"))).click();
		Thread.sleep(3000);
     }
		public void emergencyContact() throws InterruptedException
		{
		driver.findElement(By.xpath(prop3.getProperty("myinfoBtn_xpath"))).click();
		driver.findElement(By.xpath(prop3.getProperty("econtact_xpath"))).click();
		driver.findElement(By.xpath(prop3.getProperty("addBtn_xpath"))).click();
        driver.findElement(By.xpath(prop3.getProperty("name_xpath"))).sendKeys(prop3.getProperty("name"));
        driver.findElement(By.xpath(prop3.getProperty("relation_xpath"))).sendKeys(prop3.getProperty("relation"));
        driver.findElement(By.xpath(prop3.getProperty("home_tele1_xpath"))).sendKeys(prop3.getProperty("home_tele1"));
        driver.findElement(By.xpath(prop3.getProperty("mob1_xpath"))).sendKeys(prop3.getProperty("mob1"));
        driver.findElement(By.xpath(prop3.getProperty("work_tele1_xpath"))).sendKeys(prop3.getProperty("work_tele1"));
        Thread.sleep(3000);
        driver.findElement(By.xpath(prop3.getProperty("saveBtn_xpath"))).click();
        Thread.sleep(3000);
     }		

}
