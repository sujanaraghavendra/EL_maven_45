package Test_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.Login_page;
import Element_repository.Register_page;
import Element_repository.checkout_page;
import Element_repository.shopping_page;
import Generic_lib.Base_page;

public class DWS_Login_006_Test {
	public WebDriver driver;
	public WebDriverWait explicitWait;
	public String url = "https://demowebshop.tricentis.com/";

	@Test(groups="Regression")
	public void register() {
		driver = new ChromeDriver();
		String DemoTitle = "Demo Web Shop";
		Reporter.log("Browser launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// step2: Enter Test URL
		driver.get(url);
		Reporter.log("Test URL Entered");
		Register_page register = new Register_page(driver);
		Base_page basepage = new Base_page(driver);
		basepage.getRegisterlink().click();
		register.getGender_radio_button().click();
		register.getFirstname().clear();
		register.getFirstname().sendKeys("Deepa");
		Reporter.log("entered firstname",true);
		register.getLastElement().clear();
		register.getLastElement().sendKeys("shree");
		Reporter.log("entered lastname",true);
		register.getEmailbox().clear();
		register.getEmailbox().sendKeys("classmate101@gmail.com");
		Reporter.log("entered email",true);
		register.getPasswordbox().clear();
		register.getPasswordbox().sendKeys("Deepa@123");
		Reporter.log("entered password",true);
		register.getConfirmpassword().clear();
		register.getConfirmpassword().sendKeys("Deepa@123");
		Reporter.log("entered confirmpassword",true);
		register.getRegister_button().click();
		register.getContinueregister().click();
		register.getLogout().click();
		Login_page Login_page = new Login_page(driver);
		// step3: Click on login link
		Login_page.getLogin().click();
		Reporter.log("Clicked on Log in Link",true);
		// step4: Enter email id in Email ID Text Box
		Login_page.getEmailbox().clear();
		Login_page.getEmailbox().sendKeys("classmate101@gmail.com");
		Reporter.log("Email Entered",true);
		// step5: Enter Password in Password Text Box
		Login_page.getPasswordbox().clear();
		Login_page.getPasswordbox().sendKeys("Deepa@123");
		Reporter.log("Password Entered",true);
		// step6: Click on Login button
		Login_page.getLoginbutton().click();
		Reporter.log("Login Button Clicked",true);
		System.out.println(driver.getTitle());
		String actualDWSTitle = driver.getTitle();
		Assert.assertEquals(actualDWSTitle, DemoTitle, "DWS is not displayed");

		String ShoppingpageTitle = "Demo Web Shop. Shopping Cart";
		basepage.getElectronics().click();
		Reporter.log("Electronics page displayed",true);
		basepage.getCellphones().click();
		Reporter.log("cellphones page displayed",true);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Reporter.log("SmartPhone  added to cart",true);
		basepage.getShoppingcart().click();
		System.out.println(driver.getTitle());
		String actualShoppingTitle = driver.getTitle();
		Assert.assertEquals(actualShoppingTitle, ShoppingpageTitle, "Shopping page is not displayed");

		shopping_page shopping = new shopping_page(driver);
		shopping.getTermscheckbox().click();
		shopping.getCheckout().click();
		checkout_page check = new checkout_page(driver);
		check.getFirstName().clear();
		check.getFirstName().sendKeys("sujana");
		Reporter.log("First name entered",true);
		check.getLastname().clear();
		check.getLastname().sendKeys("Deepa");
		Reporter.log("Lastname entered",true);
		check.getEmail().clear();
		check.getEmail().sendKeys("gopalancoworks@gmail.com");
		Reporter.log("Email entered",true);
		Select country = new Select(check.getCountryDropdown());
		country.selectByVisibleText("India");
		Reporter.log("Country selected",true);
		check.getCity().clear();
		check.getCity().sendKeys("Banglore");
		Reporter.log("entered city",true);
		check.getAddress1().clear();
		check.getAddress1().sendKeys("Gopalan Coworks");
		Reporter.log("entered address1",true);
		check.getAddress2().clear();
		check.getAddress2().sendKeys("katriguppe1");
		Reporter.log("entered Address2",true);
		check.getZipPostalCode().clear();
		check.getZipPostalCode().sendKeys("562101");
		Reporter.log("Entered zipcode",true);
		check.getPhonenumber().clear();
		check.getPhonenumber().sendKeys("9972545737");
		Reporter.log("entered phone number",true);
		driver.findElement(By.xpath("//input[contains(@onclick,'Billing.save()')]")).click();
		Reporter.log("Move to shipping address",true);
		check.getContinueShipping().click();
		Reporter.log("Move to shipping method",true);
		check.getContinueShippingMethod().click();
		Reporter.log("Move to payment method",true);
		check.getContinuePaymentMethod().click();
		Reporter.log("Move to payment information",true);
		check.getContinuePaymentInfo().click();
		Reporter.log("Move to confirm order",true);
		check.getConfirmButton().click();
		Reporter.log("Move to Thank you page",true);

	}
}
