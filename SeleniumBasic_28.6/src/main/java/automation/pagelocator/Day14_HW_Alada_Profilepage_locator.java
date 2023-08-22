package automation.pagelocator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_HW_Alada_Profilepage_locator {
	private WebDriver driver;

	@FindBy(xpath="//input[@id='txtpassword']")
	private WebElement txtpass;
	
	
	@FindBy(xpath="//input[@id='txtnewpass']")
	private WebElement txtnewpass;
	
	@FindBy(xpath="//input[@id='txtrenewpass']")
	private WebElement txtrenewpass;
	
	@FindBy(xpath="(//button[@class='btn_blue_sm marleft42per'])[2]")
	private WebElement btnregister;

	public Day14_HW_Alada_Profilepage_locator(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	
	}

	public void Editpass_Function(String pass, String newpass, String renewpass ) {
		
		txtpass.clear();
		txtpass.sendKeys(pass);
		
		txtnewpass.clear();
		txtnewpass.sendKeys(newpass);
		
		txtrenewpass.clear();
		txtrenewpass.sendKeys(renewpass);
		
		btnregister.click();
		
	}
	public Alert alert() {
    Alert alert = driver.switchTo().alert();
    return alert;
	}
}