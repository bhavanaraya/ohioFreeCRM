package com.wbl.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.base.TestBase;

public class LoginPage extends TestBase{

	//object repository
	
	/*@FindBy(xpath="//a[text()='Sign in']")
	WebElement Login;
	
	@FindBy(name="email")
	WebElement email;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[text()='Sign Up']")
	WebElement signUpBtn;
	*/
	
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signInBtn;
	
	/*@FindBy(xpath="//a[text()='Sign']")
	WebElement signInBtn;
	*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement loginBtn;
	
	//intializing the oage objects
	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions on login page
	public String validateLoginPagetitle() {
		return driver.getTitle();
		
	}
	
	
	
	public HomePage login(String usrname,String pwd) throws IOException {
		signInBtn.click();
		username.sendKeys(usrname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
}
