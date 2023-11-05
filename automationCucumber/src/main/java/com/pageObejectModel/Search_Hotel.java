package com.pageObejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	
	public  WebDriver driver;
	
	@FindBy(name="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement ro_type;
	
	@FindBy(id="room_nos")
	private WebElement ro_no;
	
	public WebElement getCont() {
		return cont;
	}

	public void setCont(WebElement cont) {
		this.cont = cont;
	}

	@FindBy(id="adult_room")
	private WebElement adu_ro;
	
	@FindBy(id="child_room")
	private WebElement child_ro;
	
	@FindBy(id="Submit")
	private WebElement sub;
	
	@FindBy(id="radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id="continue")
    private WebElement cont;
	
	
	
	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public void setRadio_btn(WebElement radio_btn) {
		this.radio_btn = radio_btn;
	}

	public Search_Hotel(WebDriver driver2) {
      this.driver=driver2;
      PageFactory.initElements(driver2, this);
	}

	public WebElement getSub() {
		return sub;
	}

	public void setSub(WebElement sub) {
		this.sub = sub;
	}

	public WebElement getChild_ro() {
		return child_ro;
	}

	public void setChild_ro(WebElement child_ro) {
		this.child_ro = child_ro;
	}

	public WebElement getAdu_ro() {
		return adu_ro;
	}

	public void setAdu_ro(WebElement adu_ro) {
		this.adu_ro = adu_ro;
	}

	public WebElement getRo_no() {
		return ro_no;
	}

	public void setRo_no(WebElement ro_no) {
		this.ro_no = ro_no;
	}

	public WebElement getRo_type() {
		return ro_type;
	}

	public void setRo_type(WebElement ro_type) {
		this.ro_type = ro_type;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getLoc() {
		return loc;
	}

	public void setLoc(WebElement loc) {
		this.loc = loc;
	}
	
	
	
}
