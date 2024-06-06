package homework_5_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class Firefox_Private_Mode {

	public WebDriver driver;
	public FirefoxOptions options;
	
	@Test
	public void fireFox_Private_Mode() {
		   options = new FirefoxOptions(); 
		//Firefox Profiling
		     ProfilesIni profiles = new ProfilesIni();
	   	    FirefoxProfile prof = new FirefoxProfile();
			options.setProfile(prof);
			options.addArguments("-private"); // enable incognito mode
            options.addPreference("browser.tabs.remote.autostart", false); // disable infobar
            driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
			driver.get("https://amazon.com");

			
			
	

	}
	
}
