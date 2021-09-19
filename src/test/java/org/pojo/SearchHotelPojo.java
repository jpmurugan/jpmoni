package org.pojo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class SearchHotelPojo extends Baseclass {
	public static WebDriver driver;
	public SearchHotelPojo() {
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id="location")
  private WebElement location;
	
	@FindBy(id="hotels")
  private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="Submit")
	private WebElement button;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	

}
