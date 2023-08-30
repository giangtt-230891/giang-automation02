package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class D15_Rise_Client_page {
	private WebDriver driver;
	// khai báo constructor
	public D15_Rise_Client_page(WebDriver _driver) {
		this.driver =_driver;
	}
	// mở popup add client
	private By client_add = By.xpath("//a[@title ='Add client']");
	
	public void open_add_client() {
		WebElement btn_Addclient =driver.findElement(client_add);
		btn_Addclient.click();
	}
	
	// item trên popup add client
	private By radio_organization = By.xpath("//div[@class='col-md-9']/input[@id='type_organization']");
	private By radio_person = By.xpath("//div[@class='col-md-9']/input[@id='type_person']");
	private By txt_name = By.xpath("//div[@class='col-md-9']/input[@id='company_name']");
	private By dropdown_owner = By.xpath("//div[@id='s2id_created_by']");
	// từng item trong drop down
	private By owner_value = By.xpath("(//ul[@role='listbox' and @id='select2-results-3']/li)[1]");
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
	private By curency_value = By.xpath("(//ul[@role='listbox' and @id='select2-results-1']/li)[1]");
	private By txt_curency_symboy = By.xpath("//input[@id='currency_symbol']");
	private By txt_label = By.xpath("//input[@id='s2id_autogen4']");
	private By ckb_disableonlinepayment = By.xpath("//input[@id='disable_online_payment']");
	private By btn_close = By.xpath("(//button[@class='btn btn-default'])[1]");
	private By btn_save_continue = By.xpath("(//button[@class='btn btn-default'])[2]");	
	private By btn_save = By.xpath("(//button[@class='btn btn-default'])[3]");
	
	public void add_client(String company_name) {

		WebElement dropdown_owner_01 =driver.findElement(dropdown_owner);
		WebElement owner_value_01 =driver.findElement(owner_value);
			dropdown_owner_01.click();
			owner_value_01.click();
		WebElement textboxname =driver.findElement(txt_name);
			textboxname.clear();
			textboxname.sendKeys(company_name);
		WebElement btn_save_01 =driver.findElement(btn_save);
			btn_save_01.click();
		
	}
}
