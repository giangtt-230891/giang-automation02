package multi_project;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_Rise_DashboardPage;
import automation.pagelocator.D13_Rise_LoginPage;

public class ClientTestFactory extends CommonBase {
	@BeforeTest
	@Parameters("testNgBrowser")
	public void openpage(String browser) {
		setupDriver(browser);
		driver.get(D13_Account_Constant.RiseURL);
	}
	@Test
	public void Logintestsuccessfully()throws InterruptedException {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected =driver.findElement(dashboard.dashboardText);
		assertTrue(expected.isDisplayed());
	}
}
