package homework_5_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ToolTip {

	public WebDriver driver;
	public ChromeOptions options;
	
	@Test
      public void determinigToolTips() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

		
		WebElement moneyLink = driver.findElement(By.linkText("Money"));
		String toolTipValue = moneyLink.getAttribute("title");
		System.out.println("ToolTip Value for Money link is "  +  toolTipValue);
		
		WebElement businessEmailLink = driver.findElement(By.linkText("Business Email"));
		String toolTipValue1 = businessEmailLink.getAttribute("title");
		System.out.println("ToolTip Value for Business Email is " + toolTipValue1);
		
		driver.quit();
		
			
				
		
		
		
		
	}
	
}
