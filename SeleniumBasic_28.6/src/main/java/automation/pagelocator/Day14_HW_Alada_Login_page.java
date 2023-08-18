package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_HW_Alada_Login_page {
	private WebDriver driver;
	
	@FindBy(xpath="//input[@id='txtLoginUsername']")
	private WebElement txtemail;
	
	@FindBy(xpath="//input[@id='txtLoginPassword']")
	private WebElement txtpass;

	@FindBy(xpath="//button[@class='btn btn-lg btn_pink fs18 fleft w100per pass btn_submit']")
	private WebElement btnlogin;
	
	@FindBy(xpath="//a[@class='btn-anis-effect' and contains(text(),'Đăng Nhập')]")
	private WebElement btnlogin_00;
	
	public Day14_HW_Alada_Login_page(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
		
	}
	public void openpage_Login() {
		btnlogin_00.click();
		
	}
	
	public void LoginFunction(String email, String pass) {
		
		txtemail.clear();
		txtemail.sendKeys(email);
		
		txtpass.clear();
		txtpass.sendKeys(pass);
	
		btnlogin.click();
	}
}

