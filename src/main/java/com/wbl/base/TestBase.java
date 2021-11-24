package com.wbl.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.wbl.util.TestUtil;
import com.wbl.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws IOException {
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\sivaj\\eclipse-workspace\\"
				+ "FreeCRMTestAutomation\\src\\main\\java\\com\\wbl\\config\\config.properties");
		prop.load(ip);
		//System.out.println(prop.getProperty("browser"));
		
	}
	
	public static void initialization() throws IOException {
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\resources\\driver\\chromedriver.exe");
			// creating a driver object for chrome browser
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ".\\resources\\driver\\gecko.exe");
				// creating a driver object for chrome browser
				driver = new FirefoxDriver();
		}
		
		
		EventFiringWebDriver e_driver = new EventFiringWebDriver(driver);
		WebEventListener eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		//comment this step running testrunner class in cucumber options
		driver.get(prop.getProperty("url"));
		
		
	}
}
