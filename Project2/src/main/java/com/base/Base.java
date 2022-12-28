package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static Properties prop1;
	public static Properties prop2;
	public static Properties prop3;
	public static Properties prop4;
	public static Properties prop5;
	public static Properties prop6;
	

	public void initialization() {
		loadPropertyFile();
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
        
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public void tearDown() {
		driver.quit();
		
	}
	
	public void loadPropertyFile() {
		FileInputStream fis;
		String configFilePath = "./src/main/java/com/config/Config.properties";
		String configFilePath1 = "./src/main/java/com/config/Scenario1.properties";
		String configFilePath2 = "./src/main/java/com/config/Scenario2.properties";
		String configFilePath3 = "./src/main/java/com/config/Scenario3.properties";
		String configFilePath4 = "./src/main/java/com/config/Scenario4.properties";
		String configFilePath5 = "./src/main/java/com/config/Scenario5.properties";
		String configFilePath6 = "./src/main/java/com/config/Scenario6.properties";
		
		try {
			fis = new FileInputStream(configFilePath);
			prop = new Properties();
			prop.load(fis);
			fis = new FileInputStream(configFilePath1);
			prop1 = new Properties();
			prop1.load(fis);
			fis = new FileInputStream(configFilePath2);
			prop2 = new Properties();
			prop2.load(fis);
			fis = new FileInputStream(configFilePath3);
			prop3 = new Properties();
			prop3.load(fis);
			fis = new FileInputStream(configFilePath4);
			prop4 = new Properties();
			prop4.load(fis);
			fis = new FileInputStream(configFilePath5);
			prop5 = new Properties();
			prop5.load(fis);
			fis = new FileInputStream(configFilePath6);
			prop6 = new Properties();
			prop6.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}




}
