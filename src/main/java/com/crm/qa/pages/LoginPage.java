package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// page factory=OR
	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement xpathLogin;

	@FindBy(name = "email")
	WebElement userMail;

	@FindBy(name = "password")
	WebElement userPass;

	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
	WebElement LoginBtn;
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement SignupBtn;
	@FindBy(xpath = "//div[@class='rd-navbar-panel']//span[contains(text(),'free')]")
	WebElement crmLogo;

	// initialize page objects

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// actions

	public String validateLogninPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogo()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String email, String password)
	{   xpathLogin.click();
		userMail.sendKeys(email);
		userPass.sendKeys(password);
		LoginBtn.click();
		return new HomePage();
	}
}
