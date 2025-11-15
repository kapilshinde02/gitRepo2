package com.testing;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class NewTest1111 {
  @Test(priority = 2)
  public void Login() 
  {
	  System.out.println("Login page test case");
  }
  @Test(priority = 'a')
  public void Reg() {
	  System.out.println("I am in registration page test case");
  }
  @Test(priority = 3)
  public void Home() {
	  throw new SkipException("We are helleluia ");
//	  System.out.println("i am in home test case");
  }
  @Test(priority = 4)
  public void Logout() {
	  System.out.println("i am in logout test case");
  }
}
