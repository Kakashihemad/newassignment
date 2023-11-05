package com.adactin.stepdefinition;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner1;
import com.baseClass.Base_class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Step_Definition1 extends Base_class{
	
	public static WebDriver driver= Test_Runner1.driver;
	
	public static Page_Object_Manager po = new Page_Object_Manager(driver);

	@Given("^user launch the website$")
	public void user_launch_the_website() throws Throwable {
		Thread.sleep(2000);
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@When("^user enter the user name$")
	public void user_enter_the_user_name() throws Throwable {
		sendkey(po.getLogin().getUser(), "kakashihatake" );
		
		//Thread.sleep(2000);
//		WebElement username = driver.findElement(By.id("username"));
//		username.sendKeys("spnandha");
	}

	@When("^user enter the password$")
	public void user_enter_the_password() throws Throwable {
		sendkey(po.getLogin().getPass(), "India123$");
		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("India123$#");
	}

	@Then("^login the application$")
	public void login_the_application() throws Throwable {
		clickon(po.getLogin().getLog());
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
	}

	@When("^user can select the location by using dropdown$")
	public void user_can_select_the_location_by_using_dropdown() throws Throwable {
		
		selectByValue(po.getSearchhotel().getLoc(), "London");
		
		
//		WebElement location = driver.findElement(By.xpath("//*[@name='location']"));
//		location.click();
//		
//		Select s1 = new Select(location);
//		s1.selectByValue("London");
	}

	@When("^user can select the hotel name by using dropdown$")
	public void user_can_select_the_hotel_name_by_using_dropdown() throws Throwable {
		selectByValue(po.getSearchhotel().getHotel(), "Hotel Sunshine");
		
//		WebElement hotel = driver.findElement(By.id("hotels"));
//		hotel.click();
//
//		Select s2 = new Select(hotel);
//		s2.selectByValue("Hotel Sunshine");
	}

	@When("^user can select the room type by using dropdown$")
	public void user_can_select_the_room_type_by_using_dropdown() throws Throwable {
		
		selectByText(po.getSearchhotel().getRo_type(), "Deluxe");
		
//		WebElement room = driver.findElement(By.id("room_type"));
//		room.click();
//
//		Select s3 = new Select(room);
//		s3.selectByVisibleText("Deluxe");
	}

	@When("^user can select the number rooms needed by using dropdown$")
	public void user_can_select_the_number_rooms_needed_by_using_dropdown() throws Throwable {
		
		selectByValue(po.getSearchhotel().getRo_no(), "2");
		
//		WebElement roomnos = driver.findElement(By.id("room_nos"));
//		roomnos.click();
//
//		Select s4 = new Select(roomnos);
//		s4.selectByValue("2");
	}

	@When("^user can enter the adult no of person by using dropdown$")
	public void user_can_enter_the_adult_no_of_person_by_using_dropdown() throws Throwable {
		
		selectByIndex(po.getSearchhotel().getAdu_ro(), 2);
		
//		WebElement adult = driver.findElement(By.id("adult_room"));
//		adult.click();
//
//		Select s7 = new Select(adult);
//		s7.selectByIndex(2);
	}

	@When("^user can enter the no of children by using dropdown$")
	public void user_can_enter_the_no_of_children_by_using_dropdown() throws Throwable {
		
		selectByIndex(po.getSearchhotel().getChild_ro(), 2);
		
//		WebElement child = driver.findElement(By.id("child_room"));
//		child.click();
//
//		Select s8 = new Select(child);
//		s8.selectByIndex(2);
	}

	@Then("^search the given details to next page$")
	public void search_the_given_details_to_next_page() throws Throwable {
		
		clickon(po.getSearchhotel().getSub());
		
//		WebElement search = driver.findElement(By.id("Submit"));
//		search.click();

	}

	@When("^user can click the radio button you have selected$")
	public void user_can_click_the_radio_button_you_have_selected() throws Throwable {
		
		clickon(po.getSearchhotel().getRadio_btn());
		
//		WebElement button = driver.findElement(By.id("radiobutton_0"));
//		button.click();
		
			}

	@Then("^continue to the next page$")
	public void continue_to_the_next_page() throws Throwable {
		
		clickon(po.getSearchhotel().getCont());
		
//		WebElement continu = driver.findElement(By.id("continue"));
//		continu.click();
	}

	@When("^user can enter the first name$")
	public void user_can_enter_the_first_name() throws Throwable {
		
		sendkey(po.getPersonaldetails().getFi_name(), "nandha");
		
//		WebElement firstname = driver.findElement(By.id("first_name"));
//		firstname.sendKeys("nandha");
	}

	@When("^user can enter the last name$")
	public void user_can_enter_the_last_name() throws Throwable {
		
		sendkey(po.getPersonaldetails().getLa_name(), "s");
		
//		WebElement lastname = driver.findElement(By.id("last_name"));
//		lastname.sendKeys("s");
	}

	@When("^user can enter the billing address$")
	public void user_can_enter_the_billing_address() throws Throwable {
		
		sendkey(po.getPersonaldetails().getAdd(), "pari nagar,karur" );
		
//		WebElement address = driver.findElement(By.id("address"));
//		address.sendKeys("pari nagar,karur");
	}

	@When("^user can enter the credit card no:$")
	public void user_can_enter_the_credit_card_no() throws Throwable {
		
		sendkey(po.getPersonaldetails().getCc_no(), "9876543210123456" );
		
//		WebElement ccnumber = driver.findElement(By.id("cc_num"));
//		ccnumber.sendKeys("9876543210123456");
	}

	@When("^user can enter the card type$")
	public void user_can_enter_the_card_type() throws Throwable {
		
		selectByIndex(po.getPersonaldetails().getCc_ty(), 2);
		
//		WebElement cctype = driver.findElement(By.id("cc_type"));
//		cctype.click();
//		
//		Select s9 = new Select(cctype);
//		s9.selectByIndex(2);
	}

	@When("^user can enter the expiry month$")
	public void user_can_enter_the_expiry_month() throws Throwable {
		
		selectByIndex(po.getPersonaldetails().getCc_ex_mo(), 5);
		
//		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
//		expdate.click();
//		
//		Select s10 = new Select(expdate);
//		s10.selectByIndex(5);
	}

	@When("^user can enter the expiry year$")
	public void user_can_enter_the_expiry_year() throws Throwable {
		
		selectByIndex(po.getPersonaldetails().getCc_ex_ye(), 6);
		
//		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
//		expyear.click();
//		
//		Select s11 = new Select(expyear);
//		s11.selectByIndex(6);
	}

	@When("^user can enter the cvv number$")
	public void user_can_enter_the_cvv_number() throws Throwable {
		
		sendkey(po.getPersonaldetails().getCvv(), "9876");
		
//		WebElement cvv = driver.findElement(By.id("cc_cvv"));
//		cvv.sendKeys("9876");
	}

	@Then("^Book the hotel$")
	public void book_the_hotel() throws Throwable {
		
		clickon(po.getPersonaldetails().getBook());
		
//		WebElement book = driver.findElement(By.id("book_now"));
//		book.click();
		Thread.sleep(8000);
	}

	@Then("^confirmation of hotel room$")
	public void confirmation_of_hotel_room() throws Throwable {
	}
}
