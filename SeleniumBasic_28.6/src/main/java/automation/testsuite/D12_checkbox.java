package automation.testsuite;
import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class D12_checkbox extends automation.common.CommonBase{
	//@BeforeTest
	//public void openpage() {
	//	driver= initChromeDriver("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
	//}
	
	@BeforeTest	
	@Parameters("browser")
	public void initDriver(@Optional("edge") String browser) {
		setupDriver(browser);
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
	}
	
	@Test
	public void handle_checkbox() {
		WebElement thisCheckbox = driver.findElement(By.xpath("//form/descendant::label/child::input[@id='isAgeSelected']"));
		////div//input[@id='isAgeSelected']
		boolean check = thisCheckbox.isSelected();
		if(check == false) {
			thisCheckbox.click();
		System.out.println("Element is selected: "+ thisCheckbox.isSelected());
		}
	}


}
