package com.pageObejectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
    @FindBy(id = "username")
	private WebElement user;
    
    @FindBy(name = "password")
    private  WebElement pass;
    
    @FindBy(id = "login")
    private WebElement log;


	public WebElement getLog() {
		return log;
	}

	public void setLog(WebElement log) {
		this.log = log;
	}

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getUser() {
		return user;
	}

	public void setUser(WebElement user) {
		this.user = user;
	}
	

	

	
}
