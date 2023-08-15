package maveenlocators;

import baseclass.baseclass;

public class validateurl extends baseclass{
	
	
//	Verify URL
	public static void Verify_URL() throws InterruptedException {
		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		if(driver.getCurrentUrl().equalsIgnoreCase(url)) {
			System.out.println("The current url was matched");
		}else {
			System.out.println("The current url was not matched");
		}
		System.out.println("The current url is..." + driver.getCurrentUrl());
		Thread.sleep(5000);
	}
//	Verify getTtile
	
	public static void verify_Title() throws InterruptedException {
		String title = "OrangeHRM";
		if(driver.getTitle().equals(title)) {
			System.out.println("The title was matched");
		}else {
			System.out.println("The title was not matched");
		}
		System.out.println("The title is...." + driver.getTitle());
	}

}
