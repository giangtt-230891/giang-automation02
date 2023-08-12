package automation.testsuite;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class D12_radiobutton extends automation.common.CommonBase {
@Test
public void handle_radio() {
	driver= initChromeDriver("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");	
	WebElement Male_radio = driver.findElement(By.xpath("//input[contains(@value,'Male') and contains(@name,'gender')]"));
	WebElement Female_radio = driver.findElement(By.xpath("//input[contains(@value,'Female') and contains(@name,'gender')]"));	
	boolean isSelected = Male_radio.isSelected();
	if(isSelected == false) {
		Male_radio.click();
		System.out.println("Male radio button is: "+Male_radio.isSelected());
	}
	else {
		Female_radio.click();
		System.out.println("Female radio button is: "+Female_radio.isSelected());	
	}
	driver.close();
}
}
