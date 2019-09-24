package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ParentClass.parentClass;

public class contactsPage extends parentClass 
{
	@FindBy(xpath="//button[contains(text(),'New')]")
	public WebElement cont_New_btn;
	@FindBy(xpath="//*[@name='first_name']")
	public WebElement fname;
	@FindBy(xpath="//*[@name='last_name']")
	public WebElement lname;	
	@FindBy(xpath="//*[@name='description']")
	public WebElement Disc;	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	public WebElement save_btn;	
	public contactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public HomePage contactPageData()
	{
		cont_New_btn.click();
		fname.sendKeys("Nivetha");
		lname.sendKeys("Sudhan");
		Disc.sendKeys("testing");
		save_btn.click();
		return new HomePage();
	}

}
