package org.sample;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojo.UtilityBaseClass;
import org.pojoss.PlainObject;
public class Testing extends UtilityBaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		launchbrowser();		//browser launch
		launchUrl("http://adactinhotelapp.com/");  //launch url
		driver.manage().window().maximize(); //maximize the browser
		PlainObject p = new PlainObject(); // its logopojo this will created in pojo class 
		fillvalue(p.getUsername(),"vignesh4"); 		// username
		fillvalue(p.getPassword(), "12vignesh34");	//password
		clickBtn(p.getLogins());   //login
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']")); //Drop Down
		Select s = new Select(location); //syntax
		s.selectByVisibleText("Sydney");
		Thread.sleep(5000);
		Select Hotls = new Select(driver.findElement(By.xpath("//*[@id=\"hotels\"]")));
		Hotls.selectByVisibleText("Hotel Cornice");
		Select Room = new Select(driver.findElement(By.xpath("//*[@id=\"room_type\"]")));
		Room.selectByVisibleText("Standard");
		Select Ofrooms = new Select(driver.findElement(By.xpath("//*[@id=\"room_nos\"]")));
		Ofrooms.selectByIndex(2);
		Select Adult = new Select(driver.findElement(By.xpath("//*[@id=\"adult_room\"]")));
		Adult.selectByIndex(1);
		Select child = new Select(driver.findElement(By.xpath("//*[@id=\"child_room\"]")));
		child.selectByIndex(1);
		clickBtn(p.getSearch());
		clickBtn(p.getRadio());
		clickBtn(p.getContu());    
		
		fillvalue(p.getFirstname(),"Yasithra");  
		fillvalue(p.getLastname(), "Venkat");
		fillvalue(p.getAddress(), "Easwaran kovil");
		fillvalue(p.getCredit(), "1234567891234567");
		Select type = new Select(driver.findElement(By.xpath("//*[@id=\"cc_type\"]")));
		type.selectByIndex(2);
		Select exdate = new Select(driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]")));
		exdate.selectByIndex(5);
		Select date = new Select(driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]")));
		date.selectByIndex(6);
		fillvalue(p.getCcv(), "123456789");
		clickBtn(p.getBooknow());
		
	}

}


