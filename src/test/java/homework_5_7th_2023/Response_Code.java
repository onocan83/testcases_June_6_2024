package homework_5_7th_2023;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Response_Code {

	public WebDriver driver;
	public ChromeOptions options;

	
	
	@Test
	public void determineResponseCode() throws Exception {
		options = new ChromeOptions();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\homework_5_7th_2023\\config.properties");
	     prop.load(ip);
		
		
		int responsecode = Request.Get(prop.getProperty("TN_URL")).execute().returnResponse().getStatusLine().getStatusCode();
	    System.out.println("The Response Code of TN is "  + responsecode);
		
		if(responsecode == 200) {
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			}
		else {
				System.out.println("Response code is not 200");
		
			}	
		
		
	}
}
	

