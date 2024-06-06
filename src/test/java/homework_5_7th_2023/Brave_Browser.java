package homework_5_7th_2023;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Brave_Browser {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@Test 
	
	public void codingInBraveBrowser () throws Exception {
		options = new ChromeOptions();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\homework_5_7th_2023\\config.properties");
		prop.load(ip);
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		options.addArguments("--start-maximized--");
		driver = new ChromeDriver(options);
		driver.get("https://www.nba.com/");
		
		
		
				
		
				
		
		
		
	}

}
