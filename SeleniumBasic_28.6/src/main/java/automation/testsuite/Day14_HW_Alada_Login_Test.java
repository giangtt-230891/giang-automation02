package automation.testsuite;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.FindBy;
import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.Day14_HW_Alada_Profilepage_locator;
import automation.pagelocator.Day14_Alada_DSkhoahoc;
import automation.pagelocator.Day14_HW_Alada_Login_page;

public class Day14_HW_Alada_Login_Test  extends CommonBase {

	@BeforeTest
	public void openApplication() {
		driver =initChromeDriver(D13_Account_Constant.alazaURL);

	}
	
	@Test
	public void registersuccessfully() {
		Day14_HW_Alada_Login_page login1 = new Day14_HW_Alada_Login_page(driver);
		login1.openpage_Login();
		login1.Login_Function("giang17@test.com","riseDemo");
		Day14_Alada_DSkhoahoc dskh = new Day14_Alada_DSkhoahoc(driver);
		pause(8000);
		WebElement expected =driver.findElement(dskh.khoahoccuatoi);
		assertTrue(expected.isDisplayed());
	}
}
