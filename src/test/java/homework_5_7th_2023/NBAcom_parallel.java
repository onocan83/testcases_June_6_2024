package homework_5_7th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class NBAcom_parallel {
	
	public WebDriver driver;
	
    @Test
    @Parameters({"Browser"})
	public void setUp(String Browser) throws Exception {
	if(Browser.equals("chrome")) {
		driver =new ChromeDriver();
	}
	else if(Browser.equals("edge")) {
		driver = new EdgeDriver();
	}
	else 
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nba.com/");
    Thread.sleep(5000);
	
	
}



	
}