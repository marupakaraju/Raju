package commanutils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.baseclass;

public class waitcommands extends baseclass {
	
	
	public static int num = 40;
	
	public static void visibilityOfAllElementsLocatedBy(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
	}
	public static void visibilityOfElementLocated(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	public static void presenceOfElementLocated(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
	}
	public static void presenceOfAllElementsLocatedBy(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public static void presenceOfNestedElementLocatedBy(WebElement By) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(num));
		wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(By, null));
	}
}
