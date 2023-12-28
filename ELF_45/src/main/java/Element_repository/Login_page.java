package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_lib.Base_page;

public class Login_page extends Base_page{

	public Login_page(WebDriver driver) {
		super(driver);
		
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
	
	@FindBy(linkText = "Electronics")
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
	
	@FindBy(id="Email")
	private WebElement emailbox;
	
	@FindBy(id="Password")
	private WebElement passwordbox;
	
	@FindBy(id="RememberMe")
	private WebElement rememberme;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement registerbutton;

	public WebElement getEmailbox() {
		return emailbox;
	}

	public WebElement getPasswordbox() {
		return passwordbox;
	}

	public WebElement getRememberme() {
		return rememberme;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
}
