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

public class Assert_Validation extends baseclass{
	
	@Test(priority = 0)
	public void Verify_Printer() {
		System.out.println("Welcome to TestNG framework");
	}
	@Test(invocationCount = 10)
	public void Validate_URl() throws InterruptedException {
		validateurl.Verify_URL();
		validateurl.verify_Title();
	}
	@Test(priority = 2)
	public void Validate_Text() throws InterruptedException {
	 String actu = LoginFunctionality.Validate_Text();
	 String expe = "Login\n" + "Username : Admin\n" + "Password : admin123\n" +
	 "Username\n" + "Password\n" + "Login\n" + "Forgot your password?\n" + "\n" +
	 "OrangeHRM OS 5.5\n" + "© 2005 - 2023 OrangeHRM, Inc. All rights reserved.";
	 Assert.assertEquals(actu, expe);	 
	}
	@Test(priority = 3)
	public void Validate_username_nagetiveone() throws InterruptedException {
		LoginFunctionality.Validate_username(prop.getProperty("fname"));
		LoginFunctionality.Validate_password(prop.getProperty("lname"));
//		Assert.assertEquals(LoginFunctionality.Validate_LoginButton(), "Login");
		String act = LoginFunctionality.Validate_LoginButton();
		String exp = "Login";
		Assert.assertEquals(act, exp);
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
