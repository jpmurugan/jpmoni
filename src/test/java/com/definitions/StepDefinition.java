package com.definitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	@Given("i launced the adactin application")
	public void i_launced_the_adactin_application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    Thread.sleep(3000);
	    driver.get("https://adactinhotelapp.com");
	    driver.manage().window().maximize();
	}

	@When("i enters the valid {string} and valid {string}")
	public void i_enters_the_valid_and_valid(String userId , String password)  {
		driver.findElement(By.id("username")).sendKeys(userId);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("i clicks the login Button")
	public void i_clicks_the_login_Button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("i verify the navigation and the home page is displayed")
	public void i_verify_the_navigation_and_the_home_page_is_displayed() {
		WebElement findElement = driver.findElement(By.className("login_title"));
		String text = findElement.getText();
		if (text.contains("Search")) {
			System.out.println("search hotel page displayed");
		}
	}

	@When("i enters the {string},{string},{string}")
	public void i_enters_the(String location, String hotel, String roomType) {
		WebElement findElement = driver.findElement(By.name("location"));
		Select s =new Select(findElement);
		s.selectByValue(location);
		WebElement findElement2 = driver.findElement(By.id("hotels"));
		Select s1 =new Select(findElement2);
		s1.selectByVisibleText(hotel);
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select s2 =new Select(findElement3);
		s2.selectByValue(roomType);
		
	}

	@When("i clicks on search Button")
	public void i_clicks_on_search_Button() {
		driver.findElement(By.id("Submit")).click();
		
	}

	@Then("i verify the navigation and search hotel page displayed")
	public void i_verify_the_navigation_and_search_hotel_page_displayed() {
		WebElement findElement = driver.findElement(By.className("login_title"));
		String text = findElement.getText();
		if (text.contains("Select")) {
			System.out.println("Select hotel page displayed");
		}
		
	}

	@Then("i clicks on radio Button and clicks continue Button")
	public void i_clicks_on_radio_Button_and_clicks_continue_Button() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
	}

	@Then("i verify the book a hotel page")
	public void i_verify_the_book_a_hotel_page() {
		WebElement findElement = driver.findElement(By.className("login_title"));
		String text = findElement.getText();
		if (text.contains("back")) {
			System.out.println("book hotel page displayed");
		}
	}
	@When("i enters {string},{string} {string},{string},{string}{string},{string}and {string}")
	public void i_enters_and(String firstName, String lastName, String billingAddress, String creditCardNumber, String cardType, String month, String year, String ccvNumber) {
		driver.findElement(By.id("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys(lastName);
		driver.findElement(By.id("address")).sendKeys(billingAddress);
		driver.findElement(By.id("cc_num")).sendKeys(creditCardNumber);
	    driver.findElement(By.id("cc_cvv")).sendKeys(ccvNumber);
	    WebElement findElement = driver.findElement(By.id("cc_type"));
	    Select s=new Select(findElement);
	    s.selectByValue(cardType);
	    WebElement findElement2 = driver.findElement(By.id("cc_exp_month"));
	    Select s1=new Select(findElement2);
	    s1.selectByValue(month);
	    WebElement findElement3 = driver.findElement(By.id("cc_exp_year"));
	    Select s3=new Select(findElement3);
	    s3.selectByVisibleText(year);
	}

	

	@When("i clicks on book Button")
	public void i_clicks_on_book_Button() {
		driver.findElement(By.id("book_now")).click();  
	}

	@Then("i verify the order id is displayed")
	public void i_verify_the_order_id_is_displayed() throws InterruptedException {
	    WebElement f = driver.findElement(By.xpath("//input[@disabled='disabled']"));
		String att = f.getAttribute("value");
		Thread.sleep(3000);
		System.out.println(att);
	}
	
	}


	
