package com.testng_Retry_FailedTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TnRediffTest {
	
	public WebDriver driver;
	
	@Test(retryAnalyzer = MyRetry.class)
	public void rediffLoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Assert.fail();
	}

	public void tnLoginTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-lastname")).sendKeys("selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	
	}
}
