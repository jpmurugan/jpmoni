package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SelectPojo extends Baseclass {
	public static WebDriver driver;
public SelectPojo() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_0")
private WebElement radiobtn;

@FindBy(id="continue")
private WebElement button;

public WebElement getRadiobtn() {
	return radiobtn;
}
public WebElement getButton() {
	return button;
}


}
