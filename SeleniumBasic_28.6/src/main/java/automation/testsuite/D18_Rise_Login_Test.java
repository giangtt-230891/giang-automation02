package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_Rise_DashboardPage;
import automation.pagelocator.D13_Rise_LoginPage;

public class D18_Rise_Login_Test extends CommonBase {
//	@BeforeTest	
//	@Parameter("browser")
	//public void initDriver(String browser) {
	//driver =initChromeDriver(D13_Account_Constant.RiseURL);
//}
	
	@BeforeTest	
	@Parameters("testNGbrowser")
	public void initDriver(@Optional("chorme") String browser) {
		setupDriver(browser);
		driver.get(D13_Account_Constant.RiseURL);
	}
	
	@Test
	public void loginsuccessfully() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");
		
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected =driver.findElement(dashboard.dashboardText);
		assertTrue(expected.isDisplayed());
		
	}
}
