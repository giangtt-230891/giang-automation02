package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_RegisterPageFactory {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtFirstname']")
	private WebElement txtname;
	
	@FindBy(xpath="//input[@id='txtEmail']")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@id='txtCEmail']")
	private WebElement txtnhaplaiemail;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement txtpass;
	
	@FindBy(xpath="//input[@id='txtCPassword']")
	private WebElement txtnhaplaipass;
	
	@FindBy(xpath="//input[@id='txtPhone']")
	private WebElement txtsdt;
	
	@FindBy(xpath="//input[contains(@id,'chkRight')]")
	private WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'ĐĂNG KÝ') and contains(@class,'btn_pink_sm fs16')]")
	private WebElement btnregister;
	
	public Day14_RegisterPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void RegisterFunctionFactory(String name,String email, String emailagain, String pass, String passagain, String phonenumber) {
		txtname.clear();
		txtname.sendKeys(name);
		
		txtemail.clear();
		txtemail.sendKeys(email);
		
		txtnhaplaiemail.clear();
		txtnhaplaiemail.sendKeys(emailagain);
		
		txtpass.clear();
		txtpass.sendKeys(pass);
		
		txtnhaplaipass.clear();
		txtnhaplaipass.sendKeys(passagain);
		
		txtsdt.clear();
		txtsdt.sendKeys(phonenumber);
		
		//checkbox.isDisplayed();
		//checkbox.click();	
		
		btnregister.click();
	}
}
