package com.com.orangehrmlive;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testng {
	ChromeDriver chrome ;   //create chrome object globally....
	
  @Test(priority=1)
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "E:\\ASDM\\ASDM\\chromedriver_win32\\chromedriver.exe");
			//opens the browser window
	   chrome = new ChromeDriver();
			//Enters thr url
			chrome.get("https://opensource-demo.orangehrmlive.com");
			//Locates the username field and pass the data
			chrome.manage().window().maximize();
  }
  
  @Test(priority=2)
  public void loginText() throws InterruptedException {
	  Thread.sleep(2000);
	 //  chrome = new ChromeDriver();
	  chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		chrome.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
  }
  
  @Test(priority=3)
 public void admin() throws InterruptedException {
	  Thread.sleep(2000);
	 WebElement admin = chrome.findElement(By.linkText("Admin"));
		Actions mouseHover = new Actions(chrome);
		mouseHover.moveToElement(admin).build().perform();
		  Thread.sleep(2000);
		chrome.findElement(By.id("menu_admin_UserManagement")).click();
		  Thread.sleep(2000);
		  chrome.findElement(By.id("menu_admin_viewSystemUsers")).click();
	 
 }
  
 @Test(priority=4)
 public void pim()
 {
	 Actions mouseHover = new Actions(chrome);
	 WebElement job = chrome.findElement(By.linkText("PIM"));
		mouseHover.moveToElement(job).build().perform();
		chrome.findElement(By.id("menu_pim_viewPimModule")).click();
		
 }
 
@Test(priority=5)
public void logout() throws Exception
{
	 
	 chrome.findElement(By.id("welcome")).click();
	 Thread.sleep(2000);
	 chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
}
	
}

