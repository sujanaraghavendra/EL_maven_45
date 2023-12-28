package Test_scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.wishlist_page;
import Generic_lib.Base_Class;
import Generic_lib.Base_page;

public class DWS_Login_004_Test extends Base_Class {

	@Test(groups="Regression")
	public void addtowishlist() {
		String WishlistTitle = "Demo Web Shop. Wishlist";
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
		driver.findElement(By.linkText("Smartphone")).click();
		Reporter.log("Smartphone page displayed", true);
		wishlist_page wishlist = new wishlist_page(driver);
		wishlist.getWishlist().click();
		Reporter.log("Smartphone is added to wishlist", true);
		basepage.getWishlist().click();
		System.out.println(driver.getTitle());
		String actualWishlistTitle = driver.getTitle();
		Assert.assertEquals(actualWishlistTitle, WishlistTitle, "Wishlist page is not displayed");

	}
}
