package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ParentClass.parentClass;

public class HomePage extends parentClass{

@FindBy(xpath="//*[@class='user-display']")
WebElement display;
@FindBy(xpath="//*[contains(text(),'Contacts')]")
WebElement contacts;
@FindBy(xpath="//*[contains(text(),'Deals')]")	
WebElement deals;
@FindBy(xpath="//*[contains(text(),'Tasks')]")	
WebElement tasks;
@FindBy(xpath="//button[contains(text(),'New')]")
WebElement cont_New_btn;

public HomePage()
{
	PageFactory.initElements(driver, this);
}

public Boolean Verifyframetitle()
{
	Boolean b1=display.isDisplayed();
	return b1;
}
public contactsPage clickonContact()
{
	contacts.click();
	cont_New_btn.click();
	return new contactsPage();
}
public DealsPage clickonDeal()
{
	deals.click();
	return new DealsPage();
}
public taskPage clickonTasks()
{
	tasks.click();
	return new taskPage();
}
}
