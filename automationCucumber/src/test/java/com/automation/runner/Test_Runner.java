package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseClass.Base_class;

//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automation\\features",
glue = "com.automation.stepdefinition"
//monochrome = true,
//dryRun = true,
//strict = true,
//plugin = {"html:Report/Adactin_Report",
//		"pretty",
//		"json:Reporttt/Adac.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:report/cucu.html"	
//}
		)

		

public class Test_Runner {
	
	public static  WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable  {
		
		driver = Base_class.setpro("chrome");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\AK\\eclipse-workspace\\automationCucumber\\driver\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		// driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver = Base_class.maxi();
	}

	@AfterClass
	public static void last_Step() {
		// TODO Auto-generated method stub
		
		driver.close();

	}

	
	
}
