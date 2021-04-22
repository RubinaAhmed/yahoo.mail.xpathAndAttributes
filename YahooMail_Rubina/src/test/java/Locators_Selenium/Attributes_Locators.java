package Locators_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Attributes_Locators {

	WebDriver driver;
	@BeforeTest
	public void openbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/account/create");

	}
	@Test
	public void NameTest() {
		
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Rubina2004");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Ahmed");
		driver.findElement(By.className("ureg-fname input-with-icon icon-name")).sendKeys("hahaha");
		driver.findElement(By.className("ureg-lname ")).sendKeys("ahmed");
		
	}
	@Test
	public void otherTest() {
		driver.findElement(By.name("firstName")).sendKeys("RJ");
		driver.findElement(By.name("lastName")).sendKeys("Ahmed");
		
	}
	@AfterTest
	public void tearDownTest() {
		driver.quit();
	}
}




