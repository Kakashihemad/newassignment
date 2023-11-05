package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\features",
glue = "com.adactin.stepdefinition",
monochrome = true
//dryRun = true
//strict = true,
//plugin = {"html:Report/Adactin_Report",
//		"pretty",
//		"json:Reporttt/Adac.json",
//		"com.cucumber.listener.ExtentCucumberFormatter:report/cucu.html"	
//}
		)


public class Test_Runner1 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setting() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\automationCucumber-20231105T074515Z-001\\automationCucumber\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public static void finall() {
		// TODO Auto-generated method stub
		
		//driver.close();

	}

}
