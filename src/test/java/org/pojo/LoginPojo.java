package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class LoginPojo extends Baseclass {
	
 public LoginPojo() {
	 PageFactory.initElements(driver, this);
 }
 @FindBy(id="username")
 private WebElement Uname; 
 @FindBy(id="password")
 private WebElement pwd;
 @FindBy(id="login")
 private WebElement login;
 public WebElement getUname() {
	return Uname;
}
public WebElement getpwd() {
	return pwd;
}
public WebElement getLogin() {
	return login;
}

}
