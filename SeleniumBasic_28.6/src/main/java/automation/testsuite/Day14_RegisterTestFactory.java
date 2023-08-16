package automation.testsuite;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.pagelocator.Day14_DSkhoahoc;
import automation.pagelocator.Day14_RegisterPageFactory;

public class Day14_RegisterTestFactory extends CommonBase {
	@BeforeTest
	public void openApplication() {
		driver =initChromeDriver("https://alada.vn/tai-khoan/dang-ky.html");
	}
	@Test
	public void registersuccessfully() {
		Day14_RegisterPageFactory register = new Day14_RegisterPageFactory(driver);
		register.RegisterFunctionFactory("NAME","giang04@test.com","giang04@test.com", "riseDemo","riseDemo","0987671733");
		Day14_DSkhoahoc dskh = new Day14_DSkhoahoc();
		pause(4000);
		WebElement expected =driver.findElement(dskh.textthongbao);
		assertTrue(expected.isDisplayed());
	}
}
