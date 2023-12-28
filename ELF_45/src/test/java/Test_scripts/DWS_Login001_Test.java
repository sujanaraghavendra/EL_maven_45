package Test_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Element_repository.Login_page;
import Generic_lib.Base_Class;

public class DWS_Login001_Test {
	public String url = "https://demowebshop.tricentis.com/";

	@Test(groups="Smoke")
	public void Login() {
		String DemoTitle = "Demo Web Shop";
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Reporter.log("Test URL Entered", true);
		Login_page Login_page = new Login_page(driver);
		// step3: Click on login link
		Login_page.getLogin().click();
		Reporter.log("Clicked on Log in Link", true);
		// step4: Enter email id in Email ID Text Box
		Login_page.getEmailbox().clear();
		Login_page.getEmailbox().sendKeys("gopalancoworks@gmail.com");
		Reporter.log("Email Entered", true);
		// step5: Enter Password in Password Text Box
		Login_page.getPasswordbox().clear();
		Login_page.getPasswordbox().sendKeys("gopi90");
		Reporter.log("Password Entered", true);
		// step6: Click on Login button
		Login_page.getLoginbutton().click();
		Reporter.log("Login Button Clicked", true);

		System.out.println(driver.getTitle());
		String actualDWSTitle = driver.getTitle();
		Assert.assertEquals(actualDWSTitle, DemoTitle, "DWS is not displayed");

	}

}
