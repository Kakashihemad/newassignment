package com.baseClass;

//import java.awt.AWTException;
//import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
//import java.io.IOException;
//import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.json.StaticInitializerCoercer;
//import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_class {

	// webdriver method
	public static WebDriver driver;
	{

	}
	
	
	

	// system.setproperty method
	public static WebDriver setpro(String value) {
		// this is the another type
		// value = ("chrome");
		value.equalsIgnoreCase("chrome");
		// this is used to avoid capital and small letter
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\AK\\\\eclipse-workspace\\\\automationCucumber\\\\driver\\\\chromedriver.exe");

		return driver = new ChromeDriver();

	}

	// get url method
	public static void geturl(String url) {
		driver.get(url);

	}

	// maximize method
	public static WebDriver maxi() throws Throwable {
		Thread.sleep(1000);
		driver.manage().window().maximize();
		return driver;

	}

	// screenshot method
	public static void screenshott(String value) throws Throwable {
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source = ts1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\AK\\eclipse-workspace\\automationCucumber\\screenshot\\" + value + ".png");
		FileHandler.copy(source, destination);
	}

	// navigate to method
	public static void navigate_to(String url) {
		driver.navigate().to(url);

	}

	// navigate forward method
	public static void navigate_forward() throws Throwable {
		Thread.sleep(1000);
		driver.navigate().forward();
	}

	// naviagte back method
	public static void navigate_back() throws Throwable {
		Thread.sleep(1000);
		driver.navigate().back();

	}

	// navigate refresh method
	public static void navigate_refresh() throws Throwable {
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

	// get title method
	public static void get_tit() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// get current url method and print the method
	public static void curr_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	// sendkeys method
	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	// click method
	public static void clickon(WebElement element) {
		element.click();

	}

	// scroll up and down method
	public static void scroll_up_down(String value) throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, " + value + ")", "");

	}

//		public static void scroll_up(String value) throws Throwable {
//			Thread.sleep(2000);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0, "+value+")", "");
//			
//		}

	// implicit method
	public static void implicit_wait(long value) {
		driver.manage().timeouts().implicitlyWait(+value++, TimeUnit.SECONDS);

	}

	// explicit method
	public static void expli_wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// alert accept method
	public static void accept() {
		Alert acc = driver.switchTo().alert();
		acc.accept();

	}

	// alert dismiss method
	public static void dismisss() {
		Alert dis = driver.switchTo().alert();
		dis.dismiss();

	}

	//// alert accept and sendkeys method
	public static void alertt() {
		Alert g = driver.switchTo().alert();
		// Thread.sleep(2000);
		g.sendKeys("aravinth");
		g.accept();

	}

	//// alert get text method
	public static void gettextt() {
		Alert i = driver.switchTo().alert();
		System.out.println(i.getText());
		i.accept();

	}

	// robot page down method
	public static void ro_page_down() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	// robot page up method
	public static void ro_page_up() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);

	}
	
	//robot class left,right,enter
	public static void robot_class(String type) throws Throwable {
		Robot r = new Robot();
		if (type.contains("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		}
		else if (type.contains("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
		else if (type.contains("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);	
		}
			
		
	}

	// frame switch to by using webelement
	public static void first_frame(WebElement element) throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame(element);
		driver.switchTo().defaultContent();

	}

	// frame switch to by using id or name
	public static void frame_id(String value) throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame(value);
		driver.switchTo().defaultContent();
	}

	// frame switch to by using int
	public static void frame_index(int index) throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame(index);
		driver.switchTo().defaultContent();
	}

	// action move to element
	public static void actionn(WebElement element1, WebElement element2) throws Throwable {
		Actions c = new Actions(driver);
		Thread.sleep(2000);
		c.clickAndHold(element1).moveToElement(element2).build().perform();

	}

	// action drop and drag
	public static void actionn_dropdrag(WebElement element1, WebElement element2) throws Throwable {
		Actions c = new Actions(driver);
		Thread.sleep(2000);
		c.dragAndDrop(element1, element2).build().perform();

	}

	// action click option
	public static void act_click(WebElement element) {
		Actions c = new Actions(driver);
		c.click(element);
	}

	// action right click
	public static void act_rightclick(WebElement element) {
		Actions c = new Actions(driver);
		c.contextClick(element);

	}

	// action double click
	public static void act_doubleclick(WebElement element) {
		Actions c = new Actions(driver);
		c.doubleClick(element);
	}
	
	//*************dropdown method**************
	
	public static void selectByText(WebElement element, String text ) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
	}
	
		public static void selectByIndex(WebElement element, int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
			
		}
		
		public static void selectByValue(WebElement element, String value ) {
			Select s = new Select(element);
			s.selectByValue(value);
			
		}
		
		public static void deselByText(String text, WebElement element) {
			Select s = new Select(element);
			s.deselectByVisibleText(text);
			
		}
		
		public static void deselectByIndex(WebElement element, int index) {
			Select s = new Select(element);
			s.deselectByIndex(index);
			
		}
		
		public static void deselectByValue(String value, WebElement element) {
			Select s = new Select(element);
			s.deselectByValue(value);
			
		}
		
		public static void desel_all(WebElement element) {
			Select s = new Select(element);
			s.deselectAll();
			
		}
		
		//***************************************

	// close method
	public static void close() {
		driver.close();

	}

	// quit method
	public static void quit() {
		driver.quit();
	}

	

}
