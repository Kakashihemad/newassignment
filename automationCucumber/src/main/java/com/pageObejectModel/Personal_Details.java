package com.pageObejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Details {
	
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fi_name;
	
	@FindBy(id="last_name")
	private WebElement la_name;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc_no;
	
	@FindBy(id="cc_type")
	private WebElement cc_ty;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_ex_mo;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_ex_ye;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	
	

	public Personal_Details(WebDriver driver2) {
       this.driver=driver2;
       PageFactory.initElements(driver2, this);
	}

	public WebElement getAdd() {
		return add;
	}

	public void setAdd(WebElement add) {
		this.add = add;
	}

	public WebElement getCc_no() {
		return cc_no;
	}

	public void setCc_no(WebElement cc_no) {
		this.cc_no = cc_no;
	}

	public WebElement getCc_ty() {
		return cc_ty;
	}

	public void setCc_ty(WebElement cc_ty) {
		this.cc_ty = cc_ty;
	}

	public WebElement getCc_ex_mo() {
		return cc_ex_mo;
	}

	public void setCc_ex_mo(WebElement cc_ex_mo) {
		this.cc_ex_mo = cc_ex_mo;
	}

	public WebElement getCc_ex_ye() {
		return cc_ex_ye;
	}

	public void setCc_ex_ye(WebElement cc_ex_ye) {
		this.cc_ex_ye = cc_ex_ye;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

	public WebElement getLa_name() {
		return la_name;
	}

	public void setLa_name(WebElement la_name) {
		this.la_name = la_name;
	}

	public WebElement getFi_name() {
		return fi_name;
	}

	public void setFi_name(WebElement fi_name) {
		this.fi_name = fi_name;
	}
}
