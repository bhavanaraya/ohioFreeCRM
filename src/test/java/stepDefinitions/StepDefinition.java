package stepDefinitions;
import java.io.IOException;
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

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition extends TestBase{
		public StepDefinition() throws IOException {
		super();
	}
		@Given("intialiize the browser with chrome")
		public void intialiize_the_browser_with_chrome() throws IOException  {
		    // Write code here that turns the phrase above into concrete actions
			initialization(); //method of TestBase class
		}
	    @And("^navigate to the \"([^\"]*)\" base page$")
	    public void navigate_to_the_something_base_page(String strArg1)  {
	    	driver.get(strArg1);
	    }
		@And("^click on sign in button in base page to land on login page$")
		    public void click_on_sign_in_button_in_base_page_to_land_on_login_page()  {
		    System.out.println("clicked on sign in button");    
		}        
		
		/*@When("^user enters the \"([^\"]*)\" and \"([^\"]*)\" and log in$")
		    public void user_enters_the_something_and_something_and_log_in(String strArg1, String strArg2) throws IOException  {
			LoginPage loginPage = new LoginPage();
			HomePage homePage = loginPage.login(strArg1,strArg2);
		}*/
		  @When("^user enters the (.+) and (.+) and log in$")
		    public void user_enters_the_and_and_log_in(String username, String password) throws IOException  {
			  LoginPage loginPage = new LoginPage();
				HomePage homePage = loginPage.login(username,password);  
				System.out.println("user:"+username);
				System.out.println("password:"+password);
		    }
		@Then("^verify the user successfully logged in and navigated to home page$")
		    public void verify_the_user_successfully_logged_in_and_navigated_to_home_page() throws IOException, InterruptedException  {
			HomePage homePage = new HomePage();
			String homePageTitle=homePage.validateHomePageTitlte();
			System.out.println(driver.getTitle());
			Assert.assertEquals(homePageTitle, "Rediffmail");
			
			Boolean b=driver.findElement(By.xpath("//div[@class='rd_wid2']/h4")).isDisplayed();
			Assert.assertTrue(b);
			driver.close();
			System.out.println("successfully naviagted too home page");
		}

}