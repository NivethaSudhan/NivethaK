package com.qa.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ParentClass.parentClass;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
/* going to add in GitHub*/
public class LoginTestCase extends parentClass
{
	LoginPage lp;
	HomePage hp;
	
	public LoginTestCase() throws IOException {
		super();
	}
@BeforeMethod
	public void setup() throws IOException
	 {	
		initialization();
		lp=new LoginPage();
     }

/*@Test(priority=0)
	public void loginCaseTitle()
	{
	String title=lp.validateInit();
	AssertJUnit.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
@Test(priority=1)
	public void logo()
	{
	Boolean logo=lp.validateLogo();
	Assert.assertTrue(logo);		
	}*/
@Test
	public void testCase1() throws IOException
	{
	hp=lp.logininto(prop.getProperty("username"), prop.getProperty("password"));
	}
@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
