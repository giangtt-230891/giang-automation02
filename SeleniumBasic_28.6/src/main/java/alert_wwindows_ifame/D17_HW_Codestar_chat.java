package alert_wwindows_ifame;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;
public class D17_HW_Codestar_chat  extends CommonBase {
	@BeforeMethod
	public void openbrowser() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void register_fail() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("IFrame total:"+ driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(5);
		click(By.xpath("//div[@style='cursor: pointer;']"));
		click(By.xpath("//div[@class='_a2zm']"));
		pause(2000);
		WebElement expected =driver.findElement(By.xpath("//div[@class='_4ik4 _4ik5' and text()='Đăng nhập']"));
		assertTrue(expected.isDisplayed());
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
