package com.pageObejectModel;



//import java.io.File;
//import java.io.IOException;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

import com.baseClass.Base_class;

public class Adactin_main extends Base_class {
	
	public static WebDriver driver = Base_class.setpro("chrome");

	public static  Login_Page l = new Login_Page(driver);
	
	public static Search_Hotel s = new Search_Hotel(driver);
	
	public static Personal_Details pd = new Personal_Details(driver);

	public static void main(String[] args) throws Throwable {
		
		//driver = setpro("chrome");
		
		geturl("https://adactinhotelapp.com/");
		
		sendkey(l.getUser(), "vijisekar97");
		sendkey(l.getPass(), "viji@1234");
		clickon(l.getLog());
		
		
		selectByValue(s.getLoc(), "London");
		selectByValue(s.getHotel(), "Hotel Sunshine");
		selectByText(s.getRo_type(), "Deluxe");
		selectByValue(s.getRo_no(), "2");
		selectByIndex(s.getAdu_ro(), 2);
		selectByIndex(s.getChild_ro(), 2);
		clickon(s.getSub());
		
		clickon(s.getRadio_btn());
		clickon(s.getCont());
		
		sendkey(pd.getFi_name(), "nandha");
		sendkey(pd.getLa_name(), "s");
		sendkey(pd.getAdd(), "pari nagar,karur");
		sendkey(pd.getCc_no(), "9876543210123456");
		selectByIndex(pd.getCc_ty(), 2);
		selectByIndex(pd.getCc_ex_mo(), 5);
		selectByIndex(pd.getCc_ex_ye(), 6);
		sendkey(pd.getCvv(), "9876");
		clickon(pd.getBook());
		

		Thread.sleep(50000);
		screenshott("adacttt");
		
		close();
      		

	}

}
