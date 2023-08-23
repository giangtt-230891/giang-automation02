package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D13_Rise_LoginPage {
	public By txtemail= By.id("email"); //Xpad là kiểu BY
	private By txtpassword = By.id("password");
	private By buttonLogin = By.xpath("//button[text()='Sign in']");
	//private By linklogout = By.xpath("//a[text()=' Sign Out']");
	private WebDriver driver;
	
	public By authenFailtext = By.xpath("//div[normalize-space()='Authentication failed!' and @role='alert']");
	public D13_Rise_LoginPage(WebDriver _driver) {
		this.driver =_driver;
	}
	public void LoginFunction(String email, String password) {
		WebElement textboxEmail =driver.findElement(txtemail);
		if(textboxEmail.isDisplayed()) {
			textboxEmail.clear();
			textboxEmail.sendKeys(email);
		}
		
		WebElement textboxPass =driver.findElement(txtpassword);
		if(textboxPass.isDisplayed()) {
			textboxPass.clear();
			textboxPass.sendKeys(password);
		}
		WebElement btnLogin =driver.findElement(buttonLogin);
		if(btnLogin.isDisplayed()) {
			btnLogin.click();
		}
		
	}
	

}
