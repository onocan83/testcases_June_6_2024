package homework_5_7th_2023;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class InfoBar_Disabling {

	public WebDriver driver;
	public ChromeOptions options;
	
	@Test(priority =1)
	public void disablingInfoBars() throws Exception {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		driver = new ChromeDriver(options);
		driver.get("https://www.nba.com/");
		Thread.sleep(8000);

	}
		
	   @Test(priority = 2)
		public void disableInfoBarOnFirefoxBrowser() {
			FirefoxOptions options = new FirefoxOptions();
		
			
			//disable infobar in Chrome
			options.addPreference("browser.tabs.remote.autostart", false);
	        String[] excludedSwitches = {"disable-infobars"};
			options.setCapability("moz:firefoxOptions", ImmutableMap.of("excludeSwitches", excludedSwitches));

			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.nba.com/");
			driver.quit();
			
			
			
			
			
		}
		
	}
	
	
	
