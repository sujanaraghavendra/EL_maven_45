package Test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.checkout_page;
import Element_repository.shopping_page;
import Generic_lib.Base_Class;
import Generic_lib.Base_page;

public class DWS_Login007_Test extends Base_Class {
	@Test
	public void creditcard() {
		String ShoppingpageTitle = "Demo Web Shop. Shopping Cart";
		String ElectronicsTitle = "Demo Web Shop. Electronics";
		String cellTitle = "Demo Web Shop. Cell phones";

		Base_page basepage = new Base_page(driver);
		basepage.getElectronics().click();
		Reporter.log("Electronics page displayed");
		String actualElectronicsTitle = driver.getTitle();
		Assert.assertEquals(actualElectronicsTitle, ElectronicsTitle, "Electronics page is not displayed");
		basepage.getCellphones().click();
		Reporter.log("cellphones page displayed", true);
		String actualcellTitle = driver.getTitle();
		Assert.assertEquals(actualcellTitle, cellTitle, "Cell phones page is not displayed");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Reporter.log("SmartPhone  added to cart", true);
		basepage.getShoppingcart().click();
		Reporter.log("Moved to cart page", true);
		System.out.println(driver.getTitle());
		String actualShoppingTitle = driver.getTitle();
		Assert.assertEquals(actualShoppingTitle, ShoppingpageTitle, "Shopping page is not displayed");
		shopping_page shopping = new shopping_page(driver);
		shopping.getTermscheckbox().click();
		Reporter.log("Checkbox enabled", true);
		shopping.getCheckout().click();
		Reporter.log("Moved to checkout page", true);
		checkout_page check = new checkout_page(driver);
		check.getFirstName().clear();
		check.getFirstName().sendKeys("sujana");
		Reporter.log("First name entered", true);
		check.getLastname().clear();
		check.getLastname().sendKeys("raghu");
		Reporter.log("Lastname entered", true);
		check.getEmail().clear();
		check.getEmail().sendKeys("gopalancoworks@gmail.com");
		Reporter.log("Email entered", true);
		Select country = new Select(check.getCountryDropdown());
		country.selectByVisibleText("India");
		Reporter.log("Country selected", true);
		check.getCity().clear();
		check.getCity().sendKeys("Banglore");
		Reporter.log("entered city", true);
		check.getAddress1().clear();
		check.getAddress1().sendKeys("Gopalan Coworks");
		Reporter.log("entered Address1", true);
		check.getAddress2().clear();
		check.getAddress2().sendKeys("katriguppe 1st cross");
		Reporter.log("entered address2", true);
		check.getZipPostalCode().clear();
		check.getZipPostalCode().sendKeys("562101");
		Reporter.log("Entered zipcode", true);
		check.getPhonenumber().clear();
		check.getPhonenumber().sendKeys("8431570571");
		Reporter.log("entered phone number", true);
		driver.findElement(By.xpath("//input[contains(@onclick,'Billing.save()')]")).click();
		Reporter.log("Move to shipping address", true);
		check.getContinueShipping().click();
		Reporter.log("Move to shipping method", true);
		check.getContinueShippingMethod().click();
		driver.findElement(By.id("paymentmethod_2")).click();
		driver.findElement(By.xpath("//h2[text()='Payment method']/../..//input[@value='Continue']")).click();
		WebElement card = driver.findElement(By.id("CreditCardType"));
		Select cardType = new Select(card);
		cardType.selectByVisibleText("Visa");
		driver.findElement(By.id("CardholderName")).sendKeys("sujana");
		driver.findElement(By.id("CardNumber")).sendKeys("5314625640123");
		WebElement month = driver.findElement(By.id("ExpireMonth"));
		Select expMonth = new Select(month);
		expMonth.selectByValue("4");
		WebElement year = driver.findElement(By.id("ExpireYear"));
		Select expyear = new Select(year);
		expyear.selectByVisibleText("2025");
		driver.findElement(By.id("CardCode")).sendKeys("123");
		check.getContinuePaymentInfo().click();
		Reporter.log("Move to confirm order", true);
		check.getConfirmButton().click();

	}
}
