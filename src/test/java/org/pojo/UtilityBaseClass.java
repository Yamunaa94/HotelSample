package org.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityBaseClass {
	public static WebDriver driver;
	
public static void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	
	public static void launchUrl(String Url) {
		driver.get(Url);
		
	}
	public static void fillvalue(WebElement e,String value) {
		e.sendKeys(value);

}
	public static void clickBtn(WebElement e) {
		e.click();
}
}