package automation.pagelocator;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_Rise_DashboardPage;
import automation.pagelocator.D13_Rise_LoginPage;

public class Day14_LoginTestFactory extends CommonBase{
	@BeforeTest
	public void openApplication() {
		driver =initChromeDriver(D13_Account_Constant.RiseURL);
	}
	@Test
	public void loginsuccessfully() {
		Day14_LoginpageFactory factory = new Day14_LoginpageFactory(driver);
		factory.LoginFunctionFactory("admin@demo.com", "riseDemo");
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected =driver.findElement(dashboard.dashboardText);
		assertTrue(expected.isDisplayed());
	}
}
