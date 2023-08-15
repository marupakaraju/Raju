package maveenscreenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

import baseclass.baseclass;

public class screenshots extends baseclass{

	public static void ScreenShot_TFC(ITestResult result) {
		if(ITestResult.FAILURE==result.getStatus()) {
			try {
				TakesScreenshot tfc = (TakesScreenshot)driver;
				File source = tfc.getScreenshotAs(OutputType.FILE);
				File dest = new File("ScreenShots/Screenshot"+result.getClass()+"_OF_"+result.getName()+".png");
				FileUtils.copyFile(source, dest);
				System.out.println("The screenshot taken as...." + result.getName());
			} catch (Exception e) {
				System.out.println("The Exception taken as...."+ e.getMessage());
			}
		}


	}

}
