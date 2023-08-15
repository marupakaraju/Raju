package testCases;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.baseclass;
import maveenlocators.LoginFunctionality;
import maveenlocators.validateurl;
import maveenscreenshot.screenshots;

public class Validate_Login extends baseclass{
	
	@Test(priority = 0)
	public void Verify_Printer() {
		System.out.println("Welcome to TestNG framework");
	}
	
	@Test(priority = 1)
	public void Validate_URl() throws InterruptedException {
		validateurl.Verify_URL();
	}
	@Test(priority = 2)
	public void Validate_Title() throws InterruptedException {
		validateurl.verify_Title();
	}
	
	@Test(priority = 3)
	public void Validate_Text() throws InterruptedException {
		LoginFunctionality.Validate_Text();
	}
	@Test(priority = 4)
	public void Validate_username_pass() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("fname"));
		LoginFunctionality.Validate_password(prop.getProperty("lname"));
	}
	@Test(priority = 5)
	public void Validate_LoginClick() throws InterruptedException {
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
