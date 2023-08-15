package testCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.baseclass;
import maveenlocators.LoginFunctionality;
import maveenlocators.errrValidatins;
import maveenlocators.validateurl;
import maveenscreenshot.screenshots;

public class SenkeysMethds extends baseclass{

	@Test(priority = 0)
	public void Verify_Printer() {
		System.out.println("Welcome to TestNG framework");
	}
	@Test(priority = 1)
	public void Validate_URl() throws InterruptedException {
		validateurl.Verify_URL();
		validateurl.verify_Title();
	}
	@Test(priority = 2)
	public void Validate_Text() throws InterruptedException {
		LoginFunctionality.Validate_Text();
	}
	@Test(priority = 3)
	public void Validate_username_nagetiveone() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("u1"));
		LoginFunctionality.Validate_password(prop.getProperty("p1"));
		Assert.assertEquals(LoginFunctionality.Validate_LoginButton(), "Login");
		errrValidatins.validateError();
	}
	@Test(priority = 4)
	public void Validate_username_nagetivetwo() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("u2"));
		LoginFunctionality.Validate_password(prop.getProperty("p2"));
		String actu = LoginFunctionality.Validate_LoginButton();
		String exp = "Login";
		Assert.assertEquals(actu, exp);
		errrValidatins.validateError();
	}
	@Test(priority = 5)
	public void Validate_username_nagetivethree() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("u3"));
		LoginFunctionality.Validate_password(prop.getProperty("p3"));
		LoginFunctionality.Validate_LoginButton();
		errrValidatins.validateError_one();
		errrValidatins.validateError_two();
	}
	@Test(priority = 6)
	public void Validate_username_Valid() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("fname"));
		LoginFunctionality.Validate_password(prop.getProperty("lname"));
		LoginFunctionality.Validate_LoginButton();
	}
	@AfterMethod
	public void Screenshot(ITestResult result) {
		screenshots.ScreenShot_TFC(result);
	}


	@BeforeClass
	public void OpenBrowser() {
		openwindow();
	}
	@AfterClass
	public void closewindow() {
		teardown();
	}

}
