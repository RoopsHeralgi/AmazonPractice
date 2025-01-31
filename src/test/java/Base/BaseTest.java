package Base;

import org.testng.annotations.AfterMethod;

import java.time.Duration;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
public static WebDriver driver;

public static final Logger logger = Logger.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
//		driver.close();
		driver.quit();
	}
	

}
