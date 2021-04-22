package Locators_Selenium;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Attributes {

	WebDriver driver;

	@BeforeTest 
	public void OpenBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void XPathRegularTest() {

		driver.findElement(By.xpath("//input[@class='ureg-fname input-with-icon icon-name ']")).sendKeys("Rubina2004");
		driver.findElement(By.xpath("//input[@name=browser-fp-data']")).click();
		driver.findElement(By.xpath("//input[@classname='ureg-fname input-with-icon icon-name']")).sendKeys("hahaha");
		driver.findElement(By.xpath("//input[@classname='ureg-lname']")).sendKeys("ahmed");

	}
	@Test
	public void XpathOtherTests() {

		
	
		WebElement text=driver.findElement(By.linkText("Create a Yahoo email address"));
		System.out.println(text);
		
		
		
	}




}
