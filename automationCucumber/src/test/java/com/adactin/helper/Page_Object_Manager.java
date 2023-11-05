package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//import com.pageObejectModel.Details_check;
import com.pageObejectModel.Login_Page;
import com.pageObejectModel.Personal_Details;
import com.pageObejectModel.Search_Hotel;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private Login_Page login;

	public Login_Page getLogin() {
		login = new Login_Page(driver);
		return login;
	}
	

	private Search_Hotel searchhotel;
	
	public Search_Hotel getSearchhotel() {
		searchhotel = new Search_Hotel(driver);
		return searchhotel;
	}
	
	private Personal_Details personaldetails;

	public Personal_Details getPersonaldetails() {
		personaldetails = new Personal_Details(driver);
		return personaldetails;
	}
	
//	private Details_check detailscheck;
//	
//		public Details_check getDetailscheck() {
//			detailscheck = new Details_check(driver);
//		return detailscheck;
//	}



	


		public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}
		
	
	
	
	
	
}
