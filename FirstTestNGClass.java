package com.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGClass {
	@Test
	public void f() {
		System.out.println("i am in test cases");
	}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am in beforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am in afterMethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am in beforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am in afterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am in beforeTest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am in afterTest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am in beforeSuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am in afterSuite annotation");
  }

}
