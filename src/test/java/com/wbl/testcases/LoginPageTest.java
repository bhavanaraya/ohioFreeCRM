package com.wbl.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.base.TestBase;
import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	private static Logger log=LogManager.getLogger(LoginPageTest.class);
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setUp() throws IOException {
		initialization(); //method of TestBase class
		log.info("driver invoked and launched browser succefully");
		loginPage = new LoginPage();
	}

	@Test(priority=0)
	public void loginPageTitleTest() {
		String loginPagetitle=loginPage.validateLoginPagetitle();
		System.out.println(loginPagetitle);
		log.info("sucessfully validated the title");
		Assert.assertEquals(loginPagetitle, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
	}
	
	@Test(priority=1)
	public void LoginTest() throws IOException {
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));	
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
}
