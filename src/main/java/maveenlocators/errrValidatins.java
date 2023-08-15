package maveenlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.baseclass;
import commanutils.waitcommands;

public class errrValidatins extends baseclass{

	static By error = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p");
	static By error1 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
	static By erro2 = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
	
//	error 1
	public static String validateError() throws InterruptedException {
		waitcommands.visibilityOfAllElementsLocatedBy(error);
		WebElement element = driver.findElement(error);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;
		
	}
	public static String validateError_one() throws InterruptedException {
		waitcommands.visibilityOfAllElementsLocatedBy(error1);
		WebElement element = driver.findElement(error1);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;
		
	}
	public static String validateError_two() throws InterruptedException {
		waitcommands.visibilityOfAllElementsLocatedBy(erro2);
		WebElement element = driver.findElement(erro2);
		String text = element.getText();
		System.out.println(text);
		Thread.sleep(2000);
		return text;
		
	}
}
