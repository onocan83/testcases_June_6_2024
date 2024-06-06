package homework_5_7th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Priceline_Framework {

	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	
    @BeforeMethod
	public void setUp(){
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.get("https://www.priceline.com/");
	}
	   @Test(priority =1)
	    public void clickingSignInButton() {
		driver.findElement(By.id("user-nav-sign-in")).click();
		softassert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),  'or sign in with email')]")).isDisplayed());
	    softassert.assertAll();
	   }
	    
	    @Test(priority=2)
	    public void loginWithValidEmailandPassword() {
	    	driver.findElement(By.id("user-nav-sign-in")).click();
	    	driver.findElement(By.xpath("//input[@data-testid='signin-first-name']")).sendKeys("cnonur@yahoo.com");
	    	driver.findElement(By.xpath("//input[@data-testid='password']")).sendKeys("Onur@123!");
	    	driver.findElement(By.xpath("//input[@class='button button-primary']")).click();
	    	
	    }
	   		
		
	}
	

