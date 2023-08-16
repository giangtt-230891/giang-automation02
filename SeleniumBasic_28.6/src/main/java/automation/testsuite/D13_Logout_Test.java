package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_DashboardPage;
import automation.pagelocator.D13_LoginPage;

public class D13_Logout_Test  extends CommonBase{
	@BeforeTest	
	public void openPage() {
	driver =initChromeDriver(D13_Account_Constant.webURL);

}
	@Test
	public void logout() {		
		D13_LoginPage page = new D13_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");	
		D13_DashboardPage dashboard = new D13_DashboardPage(driver);
		dashboard.LogoutFunction();
		WebElement expected =driver.findElement(page.txtemail);
		assertTrue(expected.isDisplayed());
		driver.close();
	}
}
