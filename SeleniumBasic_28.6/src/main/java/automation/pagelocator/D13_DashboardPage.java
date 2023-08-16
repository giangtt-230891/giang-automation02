package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.D13_Account_Constant;

public class D13_DashboardPage {
	public By dashboardText =By.xpath("//span[text()='Dashboard']");
	private By linklogout = By.xpath("//a[text()=' Sign Out']");
	private By profile = By.xpath("//a[contains(@id,'user-dropdown')]");
	private WebDriver driver1;
	public D13_DashboardPage(WebDriver _driver) {
		this.driver1 =_driver;
	}
	public void LogoutFunction() {
		WebElement profiletxt =driver1.findElement(profile);
		if(profiletxt.isDisplayed()) {
			profiletxt.click();
			WebElement signout =driver1.findElement(linklogout);
			if(signout.isDisplayed()) {
				signout.click();
				driver1.get(D13_Account_Constant.webURL);
		}
	}

}
}