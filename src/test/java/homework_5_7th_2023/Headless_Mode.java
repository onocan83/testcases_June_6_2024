package homework_5_7th_2023;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Headless_Mode {

	public WebDriver driver;
	public FirefoxOptions options;
	
	@Test(priority = 1)
	
	public void headlessMode () {
		ChromeOptions options = new ChromeOptions();
		options = new ChromeOptions();
		options.addArguments("headless");
		options.addArguments("--no-sandbox");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nba.com/");
	    driver.quit();
	
	}
	@Test(priority = 2)
	public void headlessModeInFirefox() {
		options = new FirefoxOptions();
		options.addPreference("dom.webnotification.enabled", false);
		options.addArguments("--disable-gpu");
		options.setAcceptInsecureCerts(true);
		options.addArguments("--headless");
		driver = new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nba.com/");
		driver.quit();
		
		
		
		
		
		
	}
	
	
	
}
