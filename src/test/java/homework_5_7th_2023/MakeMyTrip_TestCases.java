package homework_5_7th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(homework_5_7th_2023.Onurs_MyListeners.class)


public class MakeMyTrip_TestCases 

{

	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@Test(priority=1)
		public void chooseFromMiami() throws Exception {
			driver.findElement(By.xpath("//li[@data-cy = 'roundTrip']")).click();
			driver.findElement(By.id("fromCity")).click();
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Mia");
			Thread.sleep(2000);
			int i = 0;
			while (i < 1) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
				i++;
			}
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		
		@Test(priority=2)
		public void choosetoMunich() throws Exception {
			driver.findElement(By.xpath("//li[@data-cy = 'roundTrip']")).click();
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Fra");
			int j = 0;
			while (j < 3) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
				j++;
			}
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);

			}	
		
		@Test(priority=3)
		public void bothChooseAndToInTheSameTestCase() throws Exception {
			driver.findElement(By.xpath("//li[@data-cy = 'roundTrip']")).click();
			driver.findElement(By.id("fromCity")).click();
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Mia");
			Thread.sleep(2000);
			int i = 0;
			while (i < 1) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.DOWN);
				i++;
			}
			driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.id("toCity")).click();
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Fra");
			int j = 0;
			while (j < 3) {
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.DOWN);
				j++;
			}
			driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys(Keys.ENTER);
			
		}
			
			@Test(priority=4)
			public void chooseDeparture() {
				
				    JavascriptExecutor js = ((JavascriptExecutor) driver);
					js.executeScript("document.getElementById('departure').value='27/07/2023' ");
				
				
				
					
				
					
					
			}
				
					
			
		}

			
			
		
		
		
		
		
		
			
		
		
		
		
	
	
	

