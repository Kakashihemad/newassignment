package com.automationCucumber;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\automationCucumber-20231105T074515Z-001\\automationCucumber\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

		driver.navigate().to("https://adactinhotelapp.com/index.php");

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("kakashihatake");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("India123$");

		WebElement login = driver.findElement(By.id("login"));
		login.click();

		WebElement location = driver.findElement(By.xpath("//*[@name='location']"));
		location.click();

		Select s1 = new Select(location);
		s1.selectByValue("London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.click();

		Select s2 = new Select(hotel);
		s2.selectByValue("Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		room.click();

		Select s3 = new Select(room);
		s3.selectByVisibleText("Deluxe");

		WebElement roomnos = driver.findElement(By.id("room_nos"));
		roomnos.click();

		Select s4 = new Select(roomnos);
		s4.selectByValue("2");

		WebElement adult = driver.findElement(By.id("adult_room"));
		adult.click();

		Select s7 = new Select(adult);
		s7.selectByIndex(2);

		WebElement child = driver.findElement(By.id("child_room"));
		child.click();

		Select s8 = new Select(child);
		s8.selectByIndex(2);
		
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();

		
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
		
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("nandha");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("s");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("pari nagar,karur");
		
		WebElement ccnumber = driver.findElement(By.id("cc_num"));
		ccnumber.sendKeys("9876543210123456");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.click();
		
		Select s9 = new Select(cctype);
		s9.selectByIndex(2);
		
		WebElement expdate = driver.findElement(By.id("cc_exp_month"));
		expdate.click();
		
		Select s10 = new Select(expdate);
		s10.selectByIndex(5);
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		expyear.click();
		
		Select s11 = new Select(expyear);
		s11.selectByIndex(6);
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("9876");
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		Thread.sleep(8000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000)", "");// scroll down
		Thread.sleep(2000);
		

//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("D:\\Selenium\\automationCucumber-20231105T074515Z-001\\automationCucumber\\screenshot");
//		FileUtils.copyFile(source, destination);
	
	
		
		//driver.close();
		
		
	}

}
