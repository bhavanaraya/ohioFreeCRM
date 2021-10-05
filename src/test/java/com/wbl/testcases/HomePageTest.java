package com.wbl.testcases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.base.TestBase;
import com.wbl.pages.ContactsPage;
import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.DataProvider;
public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;

	private static Logger log=LogManager.getLogger(HomePageTest.class);
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization(); //method of TestBase class
		loginPage = new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		//homePage = new HomePage();
	}

	
	@Test(priority=0)
	public void validateHomePageTitleTest() throws InterruptedException {
		String homePageTitle=homePage.validateHomePageTitlte();
		Assert.assertEquals(homePageTitle, "Rediffmail");
	}
	
	@Test(priority=1)
	public void validateUserNameTest() {
		WebElement userName=homePage.validateUserName();
		String userNametext=userName.getText();
		Assert.assertEquals(userNametext, "bhavana rayabandi");
	}
	
	@Test(priority=2)
	public void clickOnContanctsTest() throws IOException, InterruptedException {
		Assert.assertNotNull(homePage.clickOnContancts(), "successfully clicked Contacts page ");
	}
	
	@DataProvider
	public void getTestData() {
		
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
