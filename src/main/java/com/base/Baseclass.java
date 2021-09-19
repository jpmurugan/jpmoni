package com.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public  void launchUrl(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public  void credentials(WebElement element,String credent) {
		element.sendKeys(credent);
	
	}
	public void button(WebElement element) {
		element.click();
	}
	public void dropdown(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByValue(text);
		
	}
	public  String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
}
