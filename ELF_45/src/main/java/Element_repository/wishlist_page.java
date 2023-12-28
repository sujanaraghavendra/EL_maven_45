package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_lib.Base_page;

public class wishlist_page extends Base_page{

	public wishlist_page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "removefromcart")
	private WebElement removefromcart;
	
	@FindBy(name="addtocart")
	private WebElement addtocart;

	@FindBy(name="updatecart")
	private WebElement updatecart;
	
	@FindBy(name="addtocartbutton")
	private WebElement addtocartbutton;
	
	@FindBy(xpath = "'//input[@value='Email a friend']")
	private WebElement email_a_frd;
	
	@FindBy(xpath = "//input[@class='qty-input valid']")
	private WebElement quality;
	
	@FindBy(xpath = "//input[contains(@value,'Add to wishlist')]")
	private WebElement wishlist;

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getRemovefromcart() {
		return removefromcart;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getUpdatecart() {
		return updatecart;
	}

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}

	public WebElement getEmail_a_frd() {
		return email_a_frd;
	}

	public WebElement getQuality() {
		return quality;
	}
}
