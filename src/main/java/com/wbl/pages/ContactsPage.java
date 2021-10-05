package com.wbl.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.CacheLookup;


import com.wbl.base.TestBase;
public class ContactsPage extends TestBase{
	public ContactsPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='rd_wid2']/h4")
	WebElement adressBook;
	
	@FindBy(xpath="//div[@id='rdAddContactHandle']")
	WebElement newContactBtn;
	
	@FindBy(xpath="//input[@id='contact_full_name']")
	WebElement fullName;
	
	@FindBy(xpath="//input[@id='contact_email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='contact_company_name']")
	WebElement companyName;
	
	@FindBy(xpath="//select[@id='contact_ind_group_list']")
	WebElement group;
	
	@FindBy(xpath="//input[@id='contact_home_phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//div[@id='save_contact']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[@id='jqi_state0_buttonOk']")
	WebElement okBtn;
	
	@FindBy(xpath="//a[text()='Vijaya Deverakonda']")
	WebElement vijayContact;
	
	
	/*
	public void newContact() throws InterruptedException {
		
		newContactBtn.click();
		fullName.sendKeys("Vijaya Deverakonda");
		email.sendKeys("vijaydevarakonda@gmail.com");
		companyName.sendKeys("Movies");
		phoneNumber.sendKeys("9856948359");
		saveBtn.click();
		okBtn.click();
	}
	*/

	
	
	
	public void createnewContact(String fname,String emailid,String companyname, String groupName) {

		newContactBtn.click();
		fullName.sendKeys(fname);
		email.sendKeys(emailid);
		companyName.sendKeys(companyname);
		Select s=new Select(group);
		s.selectByValue(groupName);
		//phoneNumber.sendKeys(phnNumber);
		saveBtn.click();	
	}
	
	
	public void selectContact(String name) throws InterruptedException {
		
		//vijayContact.click();
		driver.findElement(By.xpath("//a[text()='"+name+"']/parent::span/parent::li/cite")).click();  //String name
	}
	
	
}
