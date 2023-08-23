package automation.testsuite;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import automation.common.CommonBase;

public class D16_Alert_SendKey extends CommonBase {
	@BeforeTest
	public void openPage() {
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
		
	}
	@Test
	public void Test_alert_sendkey() {	
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert = driver.switchTo().alert()	;
		alert.sendKeys("GiangTT D16");
		alert.accept();
		pause(2000);
		String confirmmsg = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		assertEquals(confirmmsg,"Hello GiangTT D16 How are you today");
		pause(2000);
		//alert.accept();
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}
