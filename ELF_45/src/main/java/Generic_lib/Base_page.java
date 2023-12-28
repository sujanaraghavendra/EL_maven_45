package Generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_page {
	public Base_page(WebDriver driver) {
	 PageFactory.initElements(driver, this);
}


	@FindBy(linkText = "Register")
	private WebElement registerlink;
	
	@FindBy(linkText ="Log in")
	private WebElement login;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement shoppingcart;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlist;
	
	@FindBy(linkText = "Books")
	private WebElement Books;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computers;
	
	@FindBy(partialLinkText =  "ELECTRONICS")
	private WebElement electronics;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement Apparelshoes;
	
	@FindBy(linkText = "Digital downloads")
	private WebElement digital;
	
	@FindBy(linkText = "Jewelry")
	private WebElement Jewelry;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftCards;
	
	@FindBy(id="small-searchterms")
	private WebElement searchbar;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchbutton;
	
	@FindBy(partialLinkText = "Cell phones")
	private WebElement cellphones;

	public WebElement getCellphones() {
		return cellphones;
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getWishlist() {
		return wishlist;
	}

	public WebElement getBooks() {
		return Books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparelshoes() {
		return Apparelshoes;
	}

	public WebElement getDigital() {
		return digital;
	}

	public WebElement getJewelry() {
		return Jewelry;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	@FindBy(linkText = "Compare products list")
	private WebElement compareproducts_list;

	public WebElement getCompareproducts_list() {
		return compareproducts_list;
	}
	
	@FindBy(xpath = "//input[contains(@class,'button-2 add-to-compare-list-button')]")
	private WebElement comparelist;

	public WebElement getComparelist() {
		return comparelist;
	}
	
	

}
