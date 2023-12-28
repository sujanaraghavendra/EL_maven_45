package Test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.Login_page;
import Generic_lib.Base_Class;
import Generic_lib.Base_page;

public class DWS_Login002_Test extends Base_Class {
	@Test(groups="Smoke")
	public void AddToCart() {
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
		System.out.println(driver.getTitle());
		String actualShoppingTitle = driver.getTitle();
		Assert.assertEquals(actualShoppingTitle, ShoppingpageTitle, "Shopping page is not displayed");
	}
}
