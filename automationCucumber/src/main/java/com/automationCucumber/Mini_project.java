package com.automationCucumber;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_project {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\AK\\eclipse-workspace\\automationCucumber\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.xpath("//*[@class='login']"));
		first.click();
		
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("(//*[@type='text'])[2]"));
		email.sendKeys("akghostrider28371@gmail.com");
		
		Thread.sleep(2000);
		WebElement create = driver.findElement(By.id("SubmitCreate"));
		create.click();
		
		Thread.sleep(8000);
		WebElement a = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		a.click();
		
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.id("customer_firstname"));
		b.sendKeys("The");
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.id("customer_lastname"));
		c.sendKeys("witcher");
		
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.id("passwd"));
		d.sendKeys("iamthekiller");
		
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.id("days"));
		e.click();
		
		Thread.sleep(5000);
		Select s1 = new Select (e);
		s1.selectByValue("25");
		
		Thread.sleep(2000);
		WebElement f = driver.findElement(By.id("months"));
		f.click();
		
		Thread.sleep(5000);
		Select s2 = new Select (f);
		s2.selectByValue("9");
		
		
		Thread.sleep(2000);
		WebElement g = driver.findElement(By.id("years"));
		g.click();
		
		Thread.sleep(5000);
		Select s3 = new Select (g);
		s3.selectByValue("1995");
		
		Thread.sleep(2000);
		WebElement h = driver.findElement(By.xpath("//input[@id='newsletter']"));
		h.click();
		
		Thread.sleep(2000);
		WebElement i = driver.findElement(By.id("address1"));
		i.sendKeys("23A,ramapuram street,chennai");
		
		Thread.sleep(2000);
		WebElement j = driver.findElement(By.id("city"));
		j.sendKeys("chennai");
		
		Thread.sleep(2000);
		WebElement k = driver.findElement(By.id("id_state"));
		k.click();
		
		Thread.sleep(5000);
		Select s4 = new Select (k);
		s4.selectByValue("14");

		Thread.sleep(2000);
		WebElement l = driver.findElement(By.id("postcode"));
		l.sendKeys("00001");

		//Thread.sleep(2000);
		//WebElement m = driver.findElement(By.id("id_country"));
		//m.click();
		
		//Thread.sleep(5000);
		//Select s5 = new Select (m);
		//s5.selectByVisibleText("United States");

		Thread.sleep(2000);
		WebElement n = driver.findElement(By.id("phone_mobile"));
		n.sendKeys("+1 45165467890");
		
		Thread.sleep(2000);
		WebElement o = driver.findElement(By.id("submitAccount"));
		o.click();
		
		Thread.sleep(2000);
		WebElement p = driver.findElement(By.xpath("(//*[@title='T-shirts'])[2]"));
		p.click();
		
		//Thread.sleep(2000);
		//WebElement q = driver.findElement(By.xpath("//*[@title='Add to cart']"));
		//q.click();

		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 800)", "");

		Thread.sleep(2000);
		WebElement r = driver.findElement(By.xpath("(//*[@title='Faded Short Sleeve T-shirts'])[3]"));
		r.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 200)", "");
		
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.id("quantity_wanted"));
		s.sendKeys("4");
		
		Thread.sleep(2000);
		WebElement t = driver.findElement(By.id("group_1"));
		t.click();
		
		Thread.sleep(5000);
		Select s5 = new Select (t);
		s5.selectByValue("3");
		
		Thread.sleep(2000);
		WebElement u = driver.findElement(By.id("color_14"));
		u.click();
		
		Thread.sleep(2000);
		WebElement v = driver.findElement(By.id("add_to_cart"));
		v.click();
		
		Thread.sleep(5000);
		WebElement w = driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		w.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		WebElement x = driver.findElement(By.xpath("(//*[@title='Proceed to checkout'])[2]"));
		x.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		WebElement y = driver.findElement(By.xpath("//*[@name='processAddress']"));
		y.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		WebElement z = driver.findElement(By.id("cgv"));
		z.click();
		
		Thread.sleep(2000);
		WebElement z1 = driver.findElement(By.xpath("//*[@name='processCarrier']"));
		z1.click();
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 400)", "");
		
		Thread.sleep(2000);
		WebElement a1 = driver.findElement(By.xpath("//*[@title='Pay by bank wire']"));
		a1.click();
		
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		Thread.sleep(2000);
		WebElement b1 = driver.findElement(By.xpath("(//*[@type='submit'])[2]"));
		b1.click();
		
		//Thread.sleep(5000);
		//TakesScreenshot ts1 = (TakesScreenshot) driver;
		//File source = ts1.getScreenshotAs(OutputType.FILE);
		//File destination = new File ("C:\\Users\\DELL\\eclipse-workspace\\selenium\\screenshot\\placedorder.png");
		//FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source1 = tss.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\AK\\eclipse-workspace\\automationCucumber\\screenshot\\order.png");
		FileUtils.copyFile(source1, des);
		
		Thread.sleep(5000);
		driver.close();
	}

}
