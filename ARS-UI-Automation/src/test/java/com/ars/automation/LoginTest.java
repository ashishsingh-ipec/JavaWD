package com.ars.automation;

import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class LoginTest {		
	    private WebDriver driver;
	    @BeforeTest
		public void beforeTest() {	
	    	//System.setProperty("webdriver.chrome.driver", "src/main/resources/browserDrivers/chromedriver.exe");
		    driver = new FirefoxDriver();  
		}
		@Test				
		public void testEasy() {	
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Free Selenium Tutorials")); 		
		}			
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	