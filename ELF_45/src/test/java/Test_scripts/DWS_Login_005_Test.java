package Test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_lib.Base_Class;
import Generic_lib.Base_page;

public class DWS_Login_005_Test extends Base_Class {
	@Test(groups="Regression")
	public void addtocompare() {
		String compareTitle = "Demo Web Shop. Compare Products";
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
		basepage.getComparelist().click();
		Reporter.log("products placed in compare products", true);
		System.out.println(driver.getTitle());
		String actualcompareTitle = driver.getTitle();
		Assert.assertEquals(actualcompareTitle, compareTitle, "compare products is not displayed");

	}
}
