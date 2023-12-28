package Element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Generic_lib.Base_page;

public class shopping_page extends Base_page{

	public shopping_page(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(name = "updatecart")
	private WebElement updatecart;
	
	@FindBy(name="continueshopping")
	private WebElement continueshopping;
	
	@FindBy(id="CountryId")
	private WebElement countryid;
	Select country=new Select(countryid);
	
	public WebElement getUpdatecart() {
		return updatecart;
	}

	public WebElement getContinueshopping() {
		return continueshopping;
	}

	public WebElement getCountryid() {
		return countryid;
	}

	public Select getCountry() {
		return country;
	}

	public WebElement getStateprovinced() {
		return stateprovinced;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getEstimate() {
		return estimate;
	}

	public WebElement getTermscheckbox() {
		return termscheckbox;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getRemovecart() {
		return removecart;
	}

	public WebElement getDiscountcouponcode() {
		return discountcouponcode;
	}

	public WebElement getApplydiscountcouponcode() {
		return applydiscountcouponcode;
	}

	public WebElement getGiftcardbox() {
		return giftcardbox;
	}

	public WebElement getApplygiftcard() {
		return applygiftcard;
	}
	@FindBy(id="StateProvinceId")
	private WebElement stateprovinced;
	
	@FindBy(id="ZipPostalCode")
	private WebElement zipcode;
	
	@FindBy(name="estimateshipping")
	private WebElement estimate;
	
	@FindBy(id="termsofservice")
	private WebElement termscheckbox;
	
	@FindBy(id="checkout")
	private WebElement checkout;
	
	@FindBy(name="removefromcart")
	private WebElement removecart;
	
	@FindBy(name="discountcouponcode")
	private WebElement discountcouponcode;
	
	@FindBy(name="applydiscountcouponcode")
	private WebElement applydiscountcouponcode;
	
	@FindBy(name="giftcardcouponcode")
	private WebElement giftcardbox;
	
	@FindBy(name="applygiftcardcouponcode")
	private WebElement applygiftcard;
	
	
	
}
