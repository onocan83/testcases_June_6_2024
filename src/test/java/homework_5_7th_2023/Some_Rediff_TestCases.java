package homework_5_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Some_Rediff_TestCases {
	
	public WebDriver driver;
    public ChromeOptions options;
    
	
	@BeforeMethod 
	@Parameters({"Browser"})
	public void openOnBrave(String Browser) throws Exception {
		//options = new ChromeOptions();
		//Properties prop = new Properties();
		//FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\homework_5_7th_2023\\config.properties");
		//prop.load(ip);
		//options.setBinary("path");
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		//options.addArguments("--start-maximized");
		if(Browser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else 
			driver=new FirefoxDriver();
	     //options.addArguments("headless");
        //options.addArguments("--no-sandbox");
		//options.addArguments("incognito");
		driver.get("https://www.rediff.com/");
		 Thread.sleep(5000);
		}
		
		
	
		
		@Test(priority = 1)
		public void clickOnMyAccount() {
			driver.findElement(By.className("signin")).click();
		}
		
		
		@Test(priority=2)
		public void loginCredentials() {
			driver.findElement(By.className("signin")).click();
			driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		    driver.findElement(By.id("password")).sendKeys("Selenium@123");
		    driver.findElement(By.className("signinbtn")).click();
			
			}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		
		
		
		
		
	}
	
	

	
}
