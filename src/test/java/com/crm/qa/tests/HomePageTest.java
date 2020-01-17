package com.crm.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	DealsPage dealsPage;
	TasksPage tasksPage;

	public HomePageTest() {
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

	}
	// test cases should be separated--independent with each other
	// after each test case --close the browser
	// before each test case --launch the browser and login

	@Test(priority = 1)
	public void verifyHomePageTitleTest() {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Cogmento CRM", "Home page tittle not matched");

	}

	@Test(priority = 2)
	public void verivyUserNameTest() {
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}

	@Test(priority = 3)
	public void clickOnContactTest() {
		contactPage = homePage.clickOnContactsLink();

	}

	@Test(priority = 4)
	public void verifyClickOnDealsLink() {
		dealsPage = homePage.clickOnDealsLink();
	}

	@Test(priority = 5)
	public void verifyClickOnTasksPage() {
		tasksPage = homePage.clickOnTasksLink();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
