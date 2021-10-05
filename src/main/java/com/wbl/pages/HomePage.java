package com.wbl.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()='bhavana rayabandi']")
	WebElement bhavana;
	
	@FindBy(xpath="//div[@class='rd_wid2']/h4")
	WebElement adressBook;
	
	
	public String validateHomePageTitlte() throws InterruptedException {
		
		return driver.getTitle();
	}
	
	public WebElement validateUserName() {
		return bhavana;	
	}
	
	public ContactsPage clickOnContancts() throws IOException, InterruptedException {
		adressBook.click();
		Thread.sleep(2000);
		return new ContactsPage();
	}
}
