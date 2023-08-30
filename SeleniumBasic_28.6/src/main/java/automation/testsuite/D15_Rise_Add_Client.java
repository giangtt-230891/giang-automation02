package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.D13_Rise_DashboardPage;
import automation.pagelocator.D13_Rise_LoginPage;
import automation.pagelocator.D15_Rise_Client_page;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D15_Rise_Add_Client extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver(D13_Account_Constant.RiseURL);
		
	}
	@Test
	public void Add_client() {
		D13_Rise_LoginPage page = new D13_Rise_LoginPage(driver);
		page.LoginFunction("admin@demo.com", "riseDemo");
		D13_Rise_DashboardPage DBpage = new D13_Rise_DashboardPage(driver);
		DBpage.open_client_page();
		D15_Rise_Client_page clientpage = new D15_Rise_Client_page(driver);
		clientpage.open_add_client();
		clientpage.add_client("Giangtt_D15");
		
	}
}
