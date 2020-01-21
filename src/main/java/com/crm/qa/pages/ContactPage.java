package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//input[@name='last_name']")
	WebElement lastName;
	@FindBy(xpath = "//i[@class='save icon']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//div[@name='company']//input[@class='search']")
	WebElement enterCompanyName;
	
	@FindBy(xpath = "//div[@class='ui active visible fluid multiple search selection dropdown']")
	WebElement enterTag;
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ContactPage addUser()
	{
		andContactBtn.click();
		enterFirstName.sendKeys("Philip");
		enterMiddleName.sendKeys("Njuguna");
		lastName.sendKeys("Mwangi");
		enterCompanyName.sendKeys("G-TECH");
		saveBtn.click();
		//enterL.sendKeys("mwangi");
		return new ContactPage();
	}
}
