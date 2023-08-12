package automation.testsuite;
import org.testng.annotations.Test;
import automation.common.CommonBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class D12_dropdown extends automation.common.CommonBase {
	@Test
	public void handle_dropdown() {
		driver= initChromeDriver("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");	
		Select singleSelect = new Select(driver.findElement(By.id("select-demo")));
		System.out.println("Size is: "+singleSelect.getOptions().size());

		WebElement dropday = driver.findElement(By.id("select-demo"));
singleSelect.selectByVisibleText("Monday");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
Assert.assertEquals("Monday", singleSelect.getFirstSelectedOption().getText());
	}
}
