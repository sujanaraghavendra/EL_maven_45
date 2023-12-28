package Generic_lib;

import java.io.IOException;
import java.time.Duration;

import javax.xml.ws.LogicalMessage;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.functions.Address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Element_repository.Login_page;

public class Base_Class {
	public WebDriver driver;
	public WebDriverWait explicitWait;
	public String url = "https://demowebshop.tricentis.com/";
	public LogicalMessage loginpage;
	public Address addresses;

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("from before suite", true);
	}

	@BeforeTest
	public void beforetest() {
		Reporter.log("from before test", true);
	}

	@BeforeMethod
	public void beforetmethod() throws EncryptedDocumentException, IOException {
		Reporter.log("from before method", true);
		// step1: Launch the browser
		driver = new ChromeDriver();
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// step2: Enter Test URL
		driver.get(url);
		Reporter.log("Test URL Entered");
		Login_page Login_page = new Login_page(driver);
		// step3: Click on login link
		Login_page.getLogin().click();
		Reporter.log("Clicked on Log in Link");
		// step4: Enter email id in Email ID Text Box
		Login_page.getEmailbox().clear();
		Login_page.getEmailbox().sendKeys("gopalancoworks@gmail.com");
		Reporter.log("Email Entered");
		// step5: Enter Password in Password Text Box
		Login_page.getPasswordbox().clear();
		Login_page.getPasswordbox().sendKeys("gopi90");
		Reporter.log("Password Entered");
		// step6: Click on Login button
		Login_page.getLoginbutton().click();
		Reporter.log("Login Button Clicked");

	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("from before class", true);

	}

	@AfterSuite
	public void Aftersuite() {
		Reporter.log("from After suite", true);
	}

	@AfterTest
	public void Aftertest() {
		Reporter.log("from After test", true);
	}

	@AfterMethod
	public void Aftertmethod() {
		Reporter.log("from After method", true);
	}

	@AfterClass
	public void Afterclass() {
		Reporter.log("from After class", true);
	}

}
