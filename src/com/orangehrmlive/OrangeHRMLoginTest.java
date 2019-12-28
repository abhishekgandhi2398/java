package com.orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/ASDM/ASDM/chromedriver_win32/chromedriver.exe");
		
		//Open Browser
		ChromeDriver chrome= new ChromeDriver();
		
		//enter into driver
		Thread.sleep(2000);
		chrome.get("https://opensource-demo.orangehrmlive.com");
		
		//locates the username field and password field 
		chrome.findElement(By.name("txtUsername")).sendKeys("Admin");
		chrome.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//submit button
		chrome.findElement(By.name("Submit")).click();
		
		
		//chrome.findElement(By.id("welcome")).click();
		
		//chrome.findElement(By.id("aboutDisplayLink")).click();
		
		
		//chrome.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);
		chrome.findElement(By.linkText("Admin")).click();
		
		WebElement userdd = chrome.findElement(By.id("searchSystemUser_userType"));
		
		Select userType = new Select(userdd);
		userType.selectByIndex(1);
		
		chrome.findElement(By.id("welcome")).click();
		//Thread.sleep(2000);
		chrome.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
		
		
	}



}
