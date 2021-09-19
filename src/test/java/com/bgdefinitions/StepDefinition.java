package com.bgdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	@Given("^I launced the adactin web application in browser$")
    public void i_launced_the_adactin_web_application_in_browser()  {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://adactinhotelapp.com");
        driver.manage().window().maximize();
    }

    @When("^I enters the invalid username and invalid password$")
    public void i_enters_the_invalid_username_and_invalid_password()  {
    	driver.findElement(By.id("username")).sendKeys("prakahmurugan");
        driver.findElement(By.id("password")).sendKeys("Jpshiva@96");
       
    }

    @When("^I enters the valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void i_enters_the_valid_something_and_valid_something(String userName, String passWord) {
    	driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(passWord);
    }

    @Then("^i verify the navigation of homepage$")
    public void i_verify_the_navigation_of_homepage()  {
    	WebElement findElement = driver.findElement(By.className("login_title"));
    	String text = findElement.getText();
    	if (text.contains("Search")) {
    		System.out.println("search hotel page displayed");
    	}
    }

    @And("^I clicks the login Button$")
    public void i_clicks_the_login_button()  {
    	driver.findElement(By.id("login")).click();
    }
}
