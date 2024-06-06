package homework_5_7th_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven_Test_Cases {

public WebDriver driver;
public ChromeOptions options;
	
	@DataProvider(name = "dataForTN")
	public static Object[][] getNinjaData (){
		Object[][] data = {{"cnonur@yahoo.com", "onur@123"},
                                    {"cnonur@hotmail.com", "onur@124"},
                                    {"cnonur@gmail.com", "onur@125"}};
		return data;
	}
	@DataProvider(name = "dataForRediff")
	     public static Object[][] getRediffData(){
		Object[][] data = {{"cnonur@yahoo.com", "onur@123"},
                                    {"cnonur@hotmail.com", "onur@124"}};
		return data; 
	}
	@Test(priority = 1, dataProvider = "dataForTN")
	public void loginTestForTN(String username, String password) throws IOException {
		options = new ChromeOptions();
		//Properties prop = new Properties();
		//FileInputStream ip = new FileInputStream(System.getProperty(("user.dir") + "\\src\\test\\java\\homework_5_7th_2023\\config.properties")	);	
		//prop.load(ip);
		options.addArguments("headless");
		options.addArguments("--no-sandbox");
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobar"));
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//options.setBinary("path");
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);
		//options.addArguments("--start-maximized--");
		driver = new ChromeDriver(options);
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}
	@Test(priority = 2, dataProvider = "dataForRediff")
	public void loginTestForRediff(String username, String password) {
		options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--no-sandbox");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation","disable-infobar"));
		driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("passord")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();
	}
	
	
	
	
	
}
