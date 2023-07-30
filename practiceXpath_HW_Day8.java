package automation.testsuite;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public final class practiceXpath_HW_Day8 extends automation.common.CommonBase {
	@BeforeTest
	public void init() {
		driver= initChromeDriver("https://automationfc.github.io/basic-form/");
	}
	@Test
	public void testcase() {
		pause(3000);
		driver.findElement(By.id("name"));
		System.out.println("Name OK");
		driver.findElement(By.id("address"));
		System.out.println("address OK");
		driver.findElement(By.name("email"));
		System.out.println("email OK");	
		driver.findElement(By.name("email"));
		System.out.println("email OK");	
		driver.findElement(By.name("password"));
		System.out.println("password OK");		
		driver.findElement(By.tagName("input"));
		System.out.println("tag name input OK");		
		driver.close();
	}
}
