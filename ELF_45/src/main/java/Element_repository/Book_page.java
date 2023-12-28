package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_lib.Base_page;

public class Book_page extends Base_page{

	public Book_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement computing_and_internet;

	public WebElement getComputing_and_internet() {
		return computing_and_internet;
	}
	

}
