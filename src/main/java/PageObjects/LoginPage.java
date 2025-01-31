package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nav-link-accountList-nav-line-1")
	private WebElement btn_Signin;
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement txt_Username;
	
	@FindBy(id = "continue")
	private WebElement btn_Continue;
	
	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement txt_Password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement btn_Submit;
	
	@FindBy(id = "nav-cart")
	private WebElement btn_Cart;
	
	public void attemptlogin(String username, String password) {
		btn_Signin.click();
		txt_Username.sendKeys(username);
		btn_Continue.click();
		txt_Password.sendKeys(password);
		btn_Submit.click();
	}
	
	public void navigateToCart() {
		btn_Cart.click();
	}

}
