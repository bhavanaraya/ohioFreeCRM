package stepDefinitions;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.wbl.base.TestBase;
import com.wbl.pages.ContactsPage;
import com.wbl.pages.HomePage;
import com.wbl.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class ContactsStepDef extends TestBase{

    public ContactsStepDef() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user is on base page1$")
    public void user_is_on_base_page() throws IOException  {
		 // Write code here that turns the phrase above into concrete actions
		initialization(); //method of TestBase class
    }
	

    @And("^navigate to the \"([^\"]*)\" base page1$")
    public void navigate_to_the_something_base_page(String strArg1)  {
    	driver.get(strArg1);
    }
    
    @And("^click on sign in button in base page to land on login page1$")
    public void click_on_sign_in_button_in_base_page_to_land_on_login_page()  {
    	 System.out.println("clicked on sign in button");    
    }


    @When("^user enters the username and password and log in1$")
    public void user_enters_the_username_and_password_and_log_in(DataTable credentials) throws IOException {
    	List<List<String>> testData = credentials.cells();
    	 LoginPage loginPage = new LoginPage();
			HomePage homePage = loginPage.login(testData.get(0).get(0),testData.get(0).get(1));  
			System.out.println("user:"+testData.get(0).get(0));
			System.out.println("password:"+testData.get(0).get(1));
    }

    @Then("^verify the user successfully logged in and navigated to home page1$")
    public void verify_the_user_successfully_logged_in_and_navigated_to_home_page() throws IOException, InterruptedException  {
    	
    	HomePage homePage = new HomePage();
		String homePageTitle=homePage.validateHomePageTitlte();
		System.out.println(driver.getTitle());
		Assert.assertEquals(homePageTitle, "Rediffmail");
		Boolean b=driver.findElement(By.xpath("//div[@class='rd_wid2']/h4")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println("successfully naviagted too home page");
        
    }

    @Then("^click on Address Book button$")
    public void click_on_address_book_button() throws IOException, InterruptedException  {
    	LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();
		ContactsPage contactsPage = new ContactsPage();
    	contactsPage=homePage.clickOnContancts();
    }

    @Then("^click on new contact and moves to new contatcs page$")
    public void click_on_new_contact_and_moves_to_new_contatcs_page()  {
    	System.out.println("this is done in next method");
		
    }

    @Then("^user enter details for contact$")
    public void user_enter_details_for_contact(DataTable details) throws IOException  {
    	List<List<String>> testData = details.cells();
    	ContactsPage contactsPage = new ContactsPage();
		contactsPage.createnewContact(testData.get(0).get(0), testData.get(0).get(1), testData.get(0).get(2), testData.get(0).get(3));
		//contactsPage.createnewContact(testData.get(1).get(0), testData.get(1).get(1), testData.get(1).get(2), testData.get(1).get(3));
        
    }

    @Then("^close the browser$")
    public void close_the_browser()  {
    	driver.close();
    }


 
}
