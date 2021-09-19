package com.definitionss;

import org.openqa.selenium.support.ui.Select;
import org.pojo.BookHotelpojo;
import org.pojo.LoginPojo;
import org.pojo.SearchHotelPojo;
import org.pojo.SelectPojo;

import com.base.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Baseclass {
	
	LoginPojo lp;
	SearchHotelPojo sp;
	SelectPojo ps;
	BookHotelpojo bh;
	@Given("^i launced the adactin application in browser$")
    public void i_launced_the_adactin_application_in_browser() throws Throwable {
		launchUrl("https://adactinhotelapp.com");
    }

    @When("^i enters the valid userid and valid password$")
    public void i_enters_the_valid_userid_and_valid_password() throws Throwable {
    	LoginPojo lp = new LoginPojo();
    	credentials(lp.getUname(), "prakashmurugan");
    	credentials(lp.getpwd(), "Jpshiva@96");
    }
    @And("^i clicks the login Button$")
    public void i_clicks_the_login_button() throws Throwable {
    	 lp = new LoginPojo();
    	button(lp.getLogin());
        
    }
    @Then("^i verify navigation of home page is displayed$")
    public void i_verify_navigation_of_home_page_is_displayed() throws Throwable {
    	 String pageUrl = pageUrl();
    	 pageUrl.contains("search");
    	 System.out.println("search page displayed");
        
    }

    @When("^i enters the location,hotel,room type$")
    public void i_enters_the_locationhotelroom_type() throws Throwable {
    	sp=new SearchHotelPojo();
    	Thread.sleep(1000);
    	dropdown(sp.getLocation(),"Sydney");
    	dropdown(sp.getHotel(),"Hotel Sunshine");
    	dropdown(sp.getRoomType(),"Double");
    }
    @And("^i clicks on search Button$")
    public void i_clicks_on_search_button() throws Throwable {
    	sp=new SearchHotelPojo();
    	button(sp.getButton());
    }
    @Then("^i verify the navigation of search hotel page displayed$")
    public void i_verify_the_navigation_of_search_hotel_page_displayed() throws Throwable {
    	sp=new SearchHotelPojo();
    	String pageUrl = pageUrl();
    	pageUrl.contains("select");
    	System.out.println("select page displayed");
    }
    @And("^i clicks on radio Button and clicks continue Button$")
    public void i_clicks_on_radio_button_and_clicks_continue_button() throws Throwable {
    	ps = new SelectPojo();
    	button(ps.getButton());
    	button(ps.getRadiobtn());
    }
    @Then("^i verify the book a hotel page$")
    public void i_verify_the_book_a_hotel_page() throws Throwable {
    	ps =new SelectPojo();
    	String pageUrl = pageUrl();
    	pageUrl.contains("select");
    	System.out.println("select page displayed");
       
    }
    @When("^i enters name, billing address,credit card number and CCV number$")
    public void i_enters_name_billing_addresscredit_card_number_and_ccv_number() throws Throwable {
    	bh=new BookHotelpojo();
    	credentials(bh.getFirstName(), "jay");
    	credentials(bh.getLastName(), "prakash");
    	credentials(bh.getAddress(), "salem");
    	credentials(bh.getCardNumber(), "123456790123456");
    	Select s =new Select(bh.getCardType());
    	s.selectByValue("AMEX");
    	Select s1 =new Select(bh.getAddress());
    	s1.selectByValue("7");
    	Select s3 =new Select(bh.getYear());
    	s3.selectByValue("2012");
    	credentials(bh.getCcvNumber(), "455");
    }
    @And("^i clicks on book Button$")
    public void i_clicks_on_book_button() throws Throwable {
        button(bh.getBook());
    }

    @Then("^i verify navigation of order id$")
    public void i_verify_navigation_of_order_id() throws Throwable {
       
    }

   

    
}
