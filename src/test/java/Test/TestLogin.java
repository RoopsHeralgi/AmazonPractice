package Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.BaseTest;
import PageObjects.LoginPage;

public class TestLogin extends BaseTest{
	
	@Test
	public void testSuccessLogin() {
		LoginPage login = new LoginPage(driver);
		System.out.println("Bowser launched and amazon page loaded");
		login.attemptlogin("+919969378379", "123456");
		System.out.println("Success - Test finished");
	}
	

}
