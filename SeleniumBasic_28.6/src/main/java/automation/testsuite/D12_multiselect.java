package automation.testsuite;
import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.WebElement;
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

public class D12_multiselect extends automation.common.CommonBase {
	@BeforeMethod
	public void openpage() {
		driver= initChromeDriver("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
	}
	@Test
	public void multiCheckbox() throws InterruptedException {
		List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
		System.out.println("Tong so luong checkbox: "+listCheckbox.size());
		for(int i=0;i<listCheckbox.size();i++) {
			System.out.println("Checkbox ở vị trí thứ: "+i+"isSelected:"+listCheckbox.get(i).isSelected());
			boolean isCheckboxSelected = listCheckbox.get(i).isSelected();
			if(isCheckboxSelected== false) {
				listCheckbox.get(i).click();
				System.out.println("Checkbox ở vị trí thứ: "+i+"đã được check");

			}
		}
		System.out.println("-----------");
		for(int i=0;i<listCheckbox.size();i++) {
			WebElement itemCheckbox = driver.findElement(By.xpath("((//div[@class='panel-body'])[3]//div[@class='checkbox']//input)["+(i+1)+"]"));
			System.out.println(itemCheckbox.isSelected());

		}
		pause(3000);
		driver.close();
	}
}
