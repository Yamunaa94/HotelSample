package org.pojoss;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.pojo.UtilityBaseClass;

public class PlainObject extends UtilityBaseClass {  // class PlainObject that class name only pojo method will be same
	public  PlainObject() {							// so here also same method name PlainObject
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="password")
private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindAll({
		@FindBy(xpath="//input[@type='Submit']"),
		})
		private WebElement logins;

	
	public WebElement getLogins() {
		return logins;
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}

@FindBy(id="last_name")
private WebElement lastname;

public WebElement getLastname() {
	return lastname;
}
@FindBy(id="address")
private WebElement address;
public WebElement getAddress() {
	return address;
}

@FindBy(id="cc_num")
private WebElement Credit;


public WebElement getCredit() {
	return Credit;
}
@FindBy(id="book_now")
private WebElement booknow;

public WebElement getBooknow() {
	return booknow;
}
@FindBy(id="cc_cvv")
private WebElement ccv;

public WebElement getCcv() {
	return ccv;
}
@FindBy(id="continue")
private WebElement contu;

public WebElement getContu() {
	return contu;
}
@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement radio;

public WebElement getRadio() {
	return radio;
}
@FindBy(id="Submit")
private WebElement search;

public WebElement getSearch() {
	return search;
}
}





