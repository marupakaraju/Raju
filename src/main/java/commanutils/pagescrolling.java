package commanutils;

import org.openqa.selenium.JavascriptExecutor;

import baseclass.baseclass;


public class pagescrolling extends baseclass {

	private static JavascriptExecutor driver;
	private static JavascriptExecutor js;
	public static void page_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("window.scrollBy(0, 200)", " ");
	}
	public static void page_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(200, 400)", " ");
	}
	public static void page_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(400, 600)", " ");

	}
	public static void page_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 200)", " ");

	}
	public static void page_five() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 200)", " ");

	}
	public static void pageup_one() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(200, -200)", " ");

	}
	public static void pageup_two() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(400, -200)", " ");

	}
	public static void pageup_three() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(500, -100)", " ");
	}
	public static void pageup_four() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(700, -200)", " ");

	}
}
