package alert_wwindows_ifame;

import static org.testng.Assert.assertEquals;
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

public class D17_HW_Dang_ky_nhan_tai_lieu  extends CommonBase {
	@BeforeMethod
	public void openbrowser() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void register_fail() {
		System.out.println("IFrame total:"+ driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//h2[text()='Đăng ký nhận tài liệu:']"));
		driver.switchTo().frame(3);
		type(By.name("account_name"),"giang");
		type(By.id("account_phone"),"0979535822");
		click(By.xpath("//button[text()='Đăng ký ngay']"));
		
		pause(2000);
		WebElement expected =driver.findElement(By.xpath("//button[text()='Đăng ký ngay']"));
		assertTrue(expected.isDisplayed());
		//pause(2000);
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
