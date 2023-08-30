package alert_wwindows_ifame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class IFrame_ExplicitWait extends CommonBase{
	@BeforeMethod
	public void openbrowser() {
		driver = initChromeDriver("https://codestar.vn/");
	}
	@Test
	public void handleIFrame() {
		System.out.println("IFrame total:"+ driver.findElements(By.tagName("iframe")).size());
		scrollToElement(By.xpath("//h2[text()='Đội ngũ giảng viên']"));
		driver.switchTo().frame(1);
		type(By.id("account_phone"),"0979535822");
		click(By.xpath("//button[text()='Gửi ngay']"));
	}
	@Test
	public void findIFrame1() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Số lượng iframe:"+ size);
		for(int i=0; i<size; i++) {
			driver.switchTo().frame(i);
			int numberOfIframe = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			if(numberOfIframe!=0) {
				System.out.println("Element cần tìm ở vị trí thứ :"+ i);
			}
			driver.switchTo().defaultContent();
		}

	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}