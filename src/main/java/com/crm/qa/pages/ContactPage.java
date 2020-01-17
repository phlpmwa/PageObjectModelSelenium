package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement contactLabel;
	
	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement andContactBtn;
	
	@FindBy(name = "first_name")
	WebElement enterFirstName;
	
	@FindBy(name = "middle_name")
	WebElement enterMiddleName;
	
	@FindBy(name="company")
	WebElement enterCompanyName;
	
	@FindBy(xpath = "//div[@class='ui active visible fluid multiple search selection dropdown']")
	WebElement enterTag;
	public ContactPage()
	{
		
	}
	
}
