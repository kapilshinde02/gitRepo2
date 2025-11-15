package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginPage {
	WebDriver wb=new ChromeDriver();
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(10000);
	  WebElement w=wb.findElement(By.xpath("//input[@name='username']"));
	  WebElement w1=wb.findElement(By.xpath("//input[@name='password']"));
	  WebElement w2=wb.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	  w.click();
	  w.sendKeys("Admin");
	  w1.click();
	  w1.sendKeys("admin123");
	  w2.click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  wb.manage().window().maximize();
	  wb.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(3000);
	  wb.close();
	  
  }

}
