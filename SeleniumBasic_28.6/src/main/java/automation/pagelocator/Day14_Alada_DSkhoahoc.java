package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Day14_Alada_DSkhoahoc {

	public By textthongbao = By.xpath("//div[@id='thongbao']");
	public By khoahoccuatoi = By.xpath("//a[@class='fleft martop20 khct']");
	
	@FindBy(xpath = "//a[@class='fleft w100per headcate']")
	private WebElement linkprofile;

	@FindBy(xpath = "//a[@class='fs14']")
	private WebElement editprofile;
	
	@FindBy(xpath = "//a[contains(text(),'Thoát')]")
	private WebElement linklogout;
	
	public void openpage_Editprofile() {
		linkprofile.click();
		editprofile.click();
		
	}
	public void Logout_Function() {
		linkprofile.click();
		linklogout.click();
	}

}
