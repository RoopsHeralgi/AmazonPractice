package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import PageObjects.CartPage;
import PageObjects.LoginPage;

import org.testng.Assert;
import org.testng.AssertJUnit;

public class TestCart extends BaseTest {

	@Test
	public void testCartPageTitle() {
		LoginPage login = new LoginPage(driver);
		login.navigateToCart();
		logger.info("Navigated to Cart");

		CartPage cart = new CartPage(driver);
		Assert.assertEquals(cart.getLabelEmptyCart().getText(), "Your Amazon Cart is empty");
		logger.info("Assertion Passed - Amazon Cart is Empty");

		Assert.assertEquals(driver.getTitle(), "https://www.amazon.com/gp/cart/",
				"Test Failed because the title didn't match");

	}
}