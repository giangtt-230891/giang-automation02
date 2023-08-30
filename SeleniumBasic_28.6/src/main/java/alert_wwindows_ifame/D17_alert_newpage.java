package alert_wwindows_ifame;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class D17_alert_newpage extends CommonBase {
	@BeforeTest
	public void openbrowser() {
		driver = initChromeDriver("https://demo.guru99.com/popup.php");
	}
	@Test
	public void Testpopupwindows() {
		click(By.xpath("//a[contains(@href,'popup.php')]"));
		String mainWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for (String subwindow : windows) {
			System.out.println(subwindow);
			if(!mainWindow.equals(subwindow)) {
				driver.switchTo().window(subwindow);
				pause(2000);
			System.out.println("Dx chuyen den lop wiwndow con");
			System.out.println("Title: "+ driver.switchTo().window(subwindow).getTitle());
			System.out.println("Current Title: "+ driver.switchTo().window(subwindow).getCurrentUrl());
			type(By.name("emailid"),"testdemo@gmail.com");
			click(By.name("btnLogin"));
			String text = driver.findElement(By.xpath("//table//td//h2")).getText();
			System.out.println(text);
			Assert.assertEquals(text, "Access details to demo site.");
			driver.close();		
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println("Da chuyen ve window chinh"+driver.getCurrentUrl());
		driver.close();	
		
	}

}
