package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_Alada_DSkhoahoc {

	public By textthongbao = By.xpath("//div[@id='thongbao']");
	public By khoahoccuatoi = By.xpath("//a[@class='fleft martop20 khct']");
	private WebDriver driver;

	@FindBy(xpath = "//a[@class='fleft w100per headcate']")
	private static WebElement  linkprofile;

	@FindBy(xpath = "//a[@class='fs14']")
	private static WebElement editprofile;
	
	@FindBy(xpath = "//a[contains(text(),'Thoát')]")
	private static WebElement linklogout;
	
	public Day14_Alada_DSkhoahoc(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(driver, this);
	
	}

	public static void Hover(WebDriver driver, WebElement element, WebElement objelement) {
       Actions action = new Actions(driver);
       action.moveToElement(element).click(objelement).build().perform();
	}
	
	public void openpage_Editprofile() {
		Hover(driver,linkprofile,editprofile);
		
	}
	public void Logout_Function() {
		Hover(driver,linkprofile,linklogout);
	}

}
