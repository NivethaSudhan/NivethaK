package com.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ParentClass.parentClass;

public class DealsPage extends parentClass {
@FindBy(xpath="//*[@class='ui linkedin button' and contains(text(),'New')]")
public WebElement new_deal;
@FindBy(name="title")
public WebElement tit;
@FindBy(name="contacts")
public WebElement cont;
@FindBy(name="probability")
public WebElement prob;
@FindBy(xpath="//*[contains(text(),'Save')]")
public WebElement save_deal;
public DealsPage()
{
	super();
}
public void DealsPage_Data()
{
	new_deal.click();
	tit.sendKeys("Mr");
	cont.sendKeys("newtesting1");
	prob.sendKeys("newtesting2");
	save_deal.click();
}

}
