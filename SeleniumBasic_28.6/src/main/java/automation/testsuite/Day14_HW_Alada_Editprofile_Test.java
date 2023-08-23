package automation.testsuite;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.support.FindBy;
import automation.common.CommonBase;
import automation.constant.D13_Account_Constant;
import automation.pagelocator.Day14_HW_Alada_Profilepage_locator;
import automation.pagelocator.Day14_Alada_DSkhoahoc;
import automation.pagelocator.Day14_HW_Alada_Login_page;
import automation.pagelocator.Day14_Alada_RegisterPageFactory;
import org.openqa.selenium.Alert;

public class Day14_HW_Alada_Editprofile_Test extends CommonBase {
	@BeforeTest
	public void openApplication() {
		//driver= initChromeDriver(D13_Account_Constant.alazaURL);
		driver =initChromeDriver("https://alada.vn/thong-tin-ca-nhan");

	}
	
	@Test
	public void edit_pass_successfully() {
		// register
		//Day14_Alada_RegisterPageFactory register = new Day14_Alada_RegisterPageFactory(driver);
		//register.openpage_Register();
		//register.RegisterFunctionFactory("NAME","giang23@test.com","giang23@test.com", "riseDemo","riseDemo","0987671733");
        
		// login
        Day14_HW_Alada_Login_page login1 = new Day14_HW_Alada_Login_page(driver);
        login1.openpage_Login();
        login1.Login_Function("giang22@test.com", "123456");
        
		// open profile
		Day14_Alada_DSkhoahoc openprofile  = new Day14_Alada_DSkhoahoc(driver);
		openprofile.openpage_Editprofile();
		
		//edit pass function
		Day14_HW_Alada_Profilepage_locator profilepage = new Day14_HW_Alada_Profilepage_locator(driver);
		profilepage.Editpass_Function("123456","1234567", "1234567");
		
		//alert	
		//Wait.until(ExpectedConditions.alertIsPresent()!=null);
        if(profilepage.alert().getText()== "Cập nhật mật khẩu mới thành công!") {
        	profilepage.alert().accept();
        }
        
        //logout
        openprofile.Logout_Function();
        
        // login again
        login1.openpage_Login();
        login1.Login_Function("giang22@test.com", "1234567");
        
	}
}
