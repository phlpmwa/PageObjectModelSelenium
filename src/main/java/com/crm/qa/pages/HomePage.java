package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userNameLabel;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactLink;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement taskLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName()
	{
		return userNameLabel.isDisplayed();
		
	}

	public ContactPage clickOnContactsLink() {
		contactLink.click();
		return new ContactPage();
	}

	public DealsPage clickOnDealsLink() {
		dealLink.click();
		return new DealsPage();
	}

	public TasksPage clickOnTasksLink() {
		taskLink.click();
		return new TasksPage();
	}
}
