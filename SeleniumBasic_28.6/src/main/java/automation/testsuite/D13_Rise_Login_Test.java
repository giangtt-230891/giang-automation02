package automation.testsuite;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_Rise_DashboardPage;
import automation.pagelocator.D13_Rise_LoginPage;

public class D13_Rise_Login_Test extends CommonBase {
	@BeforeTest	
	public void openPage() {
	driver =initChromeDriver(D13_Account_Constant.RiseURL);
}
	@Test
	public void loginsuccessfully() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");
		
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected =driver.findElement(dashboard.dashboardText);
		assertTrue(expected.isDisplayed());
		
	}
	
	@Test
	public void loginfail_IncorrectEmail() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("TestFailadmin@demo.com", "riseDemo");
		
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected =driver.findElement(page.authenFailtext);
		assertTrue(expected.isDisplayed());
			
	}
	
	@Test
	public void loginfail_IncorrectPass() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo12345");
		
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected1 =driver.findElement(page.authenFailtext);
		assertTrue(expected1.isDisplayed());
		
	}
	
	@Test
	public void loginfail_IncorrectEmailandPass() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("Failadmin@demo.com", "riseDemo12345");
		
		D13_Rise_DashboardPage dashboard = new D13_Rise_DashboardPage(driver);
		WebElement expected2 =driver.findElement(page.authenFailtext);
		assertTrue(expected2.isDisplayed());
		
	}
	
}
