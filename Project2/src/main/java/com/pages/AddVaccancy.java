package com.pages;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class AddVaccancy extends Base{
	public void addVaccancy() throws AWTException, InterruptedException {
		
		driver.findElement(By.xpath(prop6.getProperty("recruitmentBtn_xpath"))).click();
		driver.findElement(By.xpath(prop6.getProperty("vaccancyBtn_xpath"))).click();
		driver.findElement(By.xpath(prop6.getProperty("addBtn_xpath"))).click();
		driver.findElement(By.xpath(prop6.getProperty("vname_xpath"))).sendKeys(prop6.getProperty("vname"));
		
		List <WebElement> items=driver.findElements(By.xpath(prop6.getProperty("jobselect_xpath")));
		for(int i=0;i<items.size();i++)
		{
			if(items.get(i).getText().equals("Software Engineer"))
            {
            	items.get(i).click();
            }

		}
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop6.getProperty("desc_xpath"))).sendKeys(prop6.getProperty("desc"));
        driver.findElement(By.xpath(prop6.getProperty("h_manager_xpath"))).sendKeys(prop6.getProperty("h_manager"));
		driver.findElement(By.xpath(prop6.getProperty("no_positions_xpath"))).sendKeys(prop6.getProperty("no_positions"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(prop6.getProperty("saveBtn_xpath"))).click();
		Thread.sleep(3000);
		
}

}
