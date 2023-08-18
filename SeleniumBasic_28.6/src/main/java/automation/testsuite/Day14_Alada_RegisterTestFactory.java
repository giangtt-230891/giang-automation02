package automation.testsuite;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.Day14_Alada_DSkhoahoc;
import automation.pagelocator.Day14_Alada_RegisterPageFactory;

public class Day14_Alada_RegisterTestFactory extends CommonBase {
	@BeforeTest
	public void openApplication() {
		driver =initChromeDriver(D13_Account_Constant.alazaURL);

	}
	@Test
	public void registersuccessfully() {
		Day14_Alada_RegisterPageFactory register = new Day14_Alada_RegisterPageFactory(driver);
		register.openpage_Register();
		register.RegisterFunctionFactory("NAME","giang17@test.com","giang17@test.com", "riseDemo","riseDemo","0987671733");
		Day14_Alada_DSkhoahoc dskh = new Day14_Alada_DSkhoahoc();
		pause(8000);
		WebElement expected =driver.findElement(dskh.khoahoccuatoi);
		assertTrue(expected.isDisplayed());
	}
}
