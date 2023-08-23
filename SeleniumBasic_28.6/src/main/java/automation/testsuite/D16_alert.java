package automation.testsuite;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class D16_alert extends CommonBase{
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
		
	}
	@Test
	public void TestAlert01() {
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).submit();
		
		Alert alert = driver.switchTo().alert()	;
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		assertEquals(alertmsg,"Do you really want to delete this Customer?");
		pause(2000);
		alert.accept();
		pause(2000);
		//Alert alert2 = driver.switchTo().alert()	;
		//String alertmsg2 = alert2.getText();
		//assertEquals(alertmsg2,"Customer Successfully Delete!");
		//alert2.accept();
		//pause(2000);
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
