package com.orangehrmlive;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class NewTest1 {
	ChromeDriver chrome;
		@DataProvider (name="credentials")
		public Object[][] dataSet()
		{
			return new Object[][]
					{
						{"admin","admin"},
						{"linda.anderson","linda.anderson"},
						{"@admin","12345"}
				
					};
		}
		
  @Test(dataProvider="credentials")
  public void valid(String un, String pwd) throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\ASDM\\ASDM\\chromedriver_win32\\chromedriver.exe");
	  chrome= new ChromeDriver();
	  chrome.get("https://opensource-demo.orangehrmlive.com");
	  
	  chrome.findElement(By.name("txtUsername")).sendKeys(un);
		
	  chrome.findElement(By.name("txtPassword")).sendKeys(pwd);
		
	  chrome.findElement(By.id("btnLogin")).click();
	  
	 // Thread.sleep(20000);
	  try
	  {
	  WebElement error= chrome.findElement(By.id("spanMessage"));
	  
	  boolean err= error.isDisplayed();
	  
	  	if(err)
	  	{
		  System.out.println("Invalid creditial");
	  	}
	  }
	  catch (Exception e)
	  {
		  chrome.findElement(By.id("welcome")).click();
		//  Thread.sleep(20000);
		  chrome.findElement(By.linkText("Logout")).click();
	  }
  }
}
