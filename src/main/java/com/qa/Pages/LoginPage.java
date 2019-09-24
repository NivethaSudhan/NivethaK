package com.qa.Pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ParentClass.parentClass;

public class LoginPage extends parentClass{
		@FindBy(xpath="//*[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
		WebElement LogInBtn;
		@FindBy(name="email")
		WebElement username;
		@FindBy(name="password")
		WebElement password;
		@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
		WebElement loginBtn;
		//@FindBy(xpath="//div[@class='rd-navbar-brand']//parent::a[@class='brand-name' and @title='free crm home']")
		//WebElement logo;
		public void HomePage() 
		{ 
			driver.get(prop.getProperty("url_path"));
			}
	 	public LoginPage()
	 	{
	 		PageFactory.initElements(driver, this);
	 		
	 	}
	 	
	 	public String validateInit() 
	 	{
	 		String title=driver.getTitle();
	 		//System.out.println("After Launch Title is: "+title);
			return title;
	 		
	 	}
	/* 	public Boolean validateLogo()
	 	{
	 		return logo.isDisplayed();
	 	}*/
	 	public HomePage logininto(String un,String pwd) throws IOException
	 	{
	 		LogInBtn.click();
	 		username.sendKeys(un);
	 		password.sendKeys(pwd);
	 		loginBtn.click();
	 		//logo.isDisplayed();
	 		return new HomePage();
	 	}
}
