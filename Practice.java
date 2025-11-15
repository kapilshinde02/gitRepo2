package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice {
	WebDriver wr=new ChromeDriver();
	@Parameters({"username","password"})
  @Test
  public void f(String username,String password) throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)wr;
		js.executeScript("window.scrollBy(0,15000)");
	  wr.manage().window().maximize();
	  wr.get("https://practicetestautomation.com/practice-test-login/");
	  Thread.sleep(1000);
//	  wr.findElement(By.id("username")).sendKeys(username);
//	  wr.findElement(By.id("password")).sendKeys(password);
//	  Thread.sleep(1000);
//	  wr.findElement(By.id("submit-login")).click();
	  
  }
}
