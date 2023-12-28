package Test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.checkout_page;
import Element_repository.shopping_page;
import Generic_lib.Base_Class;
import Generic_lib.Base_page;

public class DWS_Login003_Test extends Base_Class {
	@Test(groups="Smoke")
	public void removeproduct() {
		String ShoppingpageTitle = "Demo Web Shop. Shopping Cart";
		String ElectronicsTitle = "Demo Web Shop. Electronics";
		String cellTitle = "Demo Web Shop. Cell phones";
		Base_page basepage = new Base_page(driver);
		basepage.getElectronics().click();
		Reporter.log("Electronics page displayed", true);
		String actualElectronicsTitle = driver.getTitle();
		Assert.assertEquals(actualElectronicsTitle, ElectronicsTitle, "Electronics page is not displayed");
		basepage.getCellphones().click();
		Reporter.log("cellphones page displayed", true);
		String actualcellTitle = driver.getTitle();
		Assert.assertEquals(actualcellTitle, cellTitle, "Cell phones page is not displayed");
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		Reporter.log("SmartPhone  added to cart", true);
		basepage.getShoppingcart().click();
		String actualShoppingTitle = driver.getTitle();
		Assert.assertEquals(actualShoppingTitle, ShoppingpageTitle, "Shopping page is not displayed");
		shopping_page shopping = new shopping_page(driver);
		shopping.getTermscheckbox().click();
		Reporter.log("Checkbox enabled", true);
		shopping.getCheckout().click();
		Reporter.log("Moved to checkout page", true);
		checkout_page check = new checkout_page(driver);
		check.getFirstName().clear();
		check.getFirstName().sendKeys("saloni");
		Reporter.log("First name entered", true);
		check.getLastname().clear();
		check.getLastname().sendKeys("Dhotkar");
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
		check.getAddress2().sendKeys("katriguppe");
		Reporter.log("entered address2", true);
		check.getZipPostalCode().clear();
		check.getZipPostalCode().sendKeys("562101");
		Reporter.log("Entered zipcode", true);
		check.getPhonenumber().clear();
		check.getPhonenumber().sendKeys("9972545737");
		Reporter.log("entered phone number", true);
		driver.findElement(By.xpath("//input[contains(@onclick,'Billing.save()')]")).click();
		Reporter.log("Move to shipping address", true);
		check.getContinueShipping().click();
		Reporter.log("Move to shipping method", true);
		check.getContinueShippingMethod().click();
		Reporter.log("Move to payment method", true);
		check.getContinuePaymentMethod().click();
		Reporter.log("Move to payment information", true);
		check.getContinuePaymentInfo().click();
		Reporter.log("Move to confirm order", true);
		check.getConfirmButton().click();
		Reporter.log("Move to Thank you page", true);
		basepage.getShoppingcart().click();
		Assert.assertEquals(actualShoppingTitle, ShoppingpageTitle, "Shopping page is not displayed");
		Reporter.log("Product should be removed", true);

	}

}
