/*
 * author: Bhavana Rayabandi
 * description: contacts page test class with 2 test case. create new contact and select contact test cases.
 */
package com.wbl.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.TestBase;
import com.wbl.pages.ContactsPage;
import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;
import com.wbl.util.TestUtil;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class ContactspageTest extends TestBase{
	ContactsPage contactsPage;
	HomePage homePage;
	LoginPage loginPage;
	String sheetName="contacts";

	private static Logger log=LogManager.getLogger(ContactspageTest.class);
	public ContactspageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
		initialization(); //method of TestBase class
		loginPage = new LoginPage();
		homePage=new HomePage();
		contactsPage=new ContactsPage();
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println(prop.getProperty("username"));
		contactsPage=homePage.clickOnContancts();
		
		
	}
	
	/*
	@Test(priority=0)
	public void newContactTest() throws InterruptedException {
		
			contactsPage.newContact();
		//Assert.assertNull(contactsPage.newContact(), "successfully added contact");
	}
	
	*/	
	
	
	@DataProvider
	public Object[][] getTestDataExcel() throws IOException {
		Object[][] data=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	
	/*@Test(priority=0)
	public void createnewContactTest() throws InterruptedException {
		
			contactsPage.createnewContact("krithy shetty", "krithydolly@rediff.com", "DVS entertainments", "school");
	}	
	*/
	
	
	
	@Test(priority=0,dataProvider="getTestDataExcel")
	public void createnewContactTest(String fullname,String email,String company, String group) throws InterruptedException, IOException {
			
			contactsPage.createnewContact(fullname, email,company,group);

	}
	
	
	@Test(priority=1)
	public void selectContactTest() throws InterruptedException {
		contactsPage.selectContact("padm"); //" padma"
		contactsPage.selectContact("chiranjeevi ");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
