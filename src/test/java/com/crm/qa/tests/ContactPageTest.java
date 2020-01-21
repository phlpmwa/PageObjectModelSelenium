package com.crm.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class ContactPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	DealsPage dealsPage;
	TasksPage tasksPage;

	public ContactPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		contactPage=new ContactPage();
		dealsPage=new DealsPage();
		tasksPage=new TasksPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        contactPage = homePage.clickOnContactsLink(); 
	}
	@Test
	public void addUser()
	{
		contactPage.addUser();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

}
