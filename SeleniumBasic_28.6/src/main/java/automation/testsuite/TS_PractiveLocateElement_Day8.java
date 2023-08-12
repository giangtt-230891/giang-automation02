package automation.testsuite;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public final class TS_PractiveLocateElement_Day8 extends automation.common.CommonBase {
	@BeforeTest
	public void init() {
		driver= initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
	}
	

	@Test
	public void Demo_Testcase() {
		pause(3000);
		driver.findElement(By.partialLinkText("Hut mui ong khoi"));
		System.out.println("Link text OK");
		driver.close();
	}

}
