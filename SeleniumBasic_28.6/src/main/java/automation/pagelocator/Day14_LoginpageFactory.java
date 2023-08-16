package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_LoginpageFactory {
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="password")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement buttonLogin;
	
	private WebDriver driver;
	
	public Day14_LoginpageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
		
	}
	public void LoginFunctionFactory(String email,String pass) {
		txtemail.clear();
		txtemail.sendKeys(email);
		txtpass.clear();
		txtpass.sendKeys(pass);
		buttonLogin.click();
	}
}
