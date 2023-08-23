package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D15_Rise_Client_page {
	private WebDriver driver;
	public D15_Rise_Client_page(WebDriver _driver) {
		this.driver =_driver;
	}
	
	private By client_add = By.xpath("//a[@title ='Add client']");
	
	public void open_add_client() {
		WebElement btn_Addclient =driver.findElement(client_add);
		btn_Addclient.click();
	}
	
	private By radio_organization = By.xpath("//div[@class='col-md-9']/input[@id='type_organization']");
	private By radio_person = By.xpath("//div[@class='col-md-9']/input[@id='type_person']");
	private By txt_name = By.xpath("//div[@class='col-md-9']/input[@id='company_name']");
	private By dropdown_owner = By.xpath("//div[@id='s2id_created_by']");
	// từng item trong drop down
	private By txt_address = By.xpath("//div[@class='col-md-9']/textarea[@id='address']");
	private By txt_city = By.xpath("//div[@class='col-md-9']/input[@id='city']");
	private By txt_state = By.xpath("//div[@class='col-md-9']/input[@id='state']");
	private By txt_zip = By.xpath("//div[@class='col-md-9']/input[@id='zip']");
	private By txt_country = By.xpath("//div[@class='col-md-9']/input[@id='country']");
	private By txt_phone = By.xpath("//div[@class='col-md-9']/input[@id='phone']");
	private By txt_website = By.xpath("//div[@class='col-md-9']/input[@id='website']");
	private By txt_vat = By.xpath("//div[@class='col-md-9']/input[@id='vat_number']");
	private By txt_gst = By.xpath("//div[@class='col-md-9']/input[@id='gst_number']");
	private By txt_client_group = By.xpath("//input[@id='s2id_autogen2']");
	private By dropdown_curency = By.xpath("//div[@id='s2id_currency']");
	//detail curency
	
	private By txt_curency_symboy = By.xpath("//input[@id='currency_symbol']");
	private By txt_label = By.xpath("//input[@id='s2id_autogen4']");
	private By ckb_disableonlinepayment = By.xpath("//input[@id='disable_online_payment']");
	private By btn_close = By.xpath("(//button[@class='btn btn-default'])[1]");
	private By btn_save_continue = By.xpath("(//button[@class='btn btn-default'])[2]");	
	private By btn_save = By.xpath("(//button[@class='btn btn-default'])[3]");
}
