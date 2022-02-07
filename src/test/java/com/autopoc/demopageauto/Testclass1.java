package com.autopoc.demopageauto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void LanchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\gecko\\chrome97\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
	}
	
	@Test
	public void Test1() {
		
		driver.navigate().to("https://www.google.co.in");
		System.out.println("test 1 title is"+driver.getTitle());
		
		
	}
	
	@Test
	public void Test2() {
		

		driver.navigate().to("https://www.techlistic.com/2020/07/automation-testing-demo-websites.html");
		System.out.println("test 2 title is"+driver.getTitle());

		
	}
	
	@Test
	public void Test3() {
		

		driver.navigate().to("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/");
		System.out.println("test 3 title is"+driver.getTitle());

		
	}
	
	@AfterMethod
	public void quit() {
		System.out.println("closing the Browser");
		driver.quit();
	}

}
