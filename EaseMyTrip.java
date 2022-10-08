package JavaScriptExecutorADV;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EaseMyTrip 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.easemytrip.com/");
		
	/*	driver.findElement(By.id("ddate")).sendKeys("05/08/2022");
	 * we cannot pass sendkeys() 
	 * instead of that we need to use function() in that "arguments[0].value='05/08/2022'" 
	 * */
		
		WebElement element = driver.findElement(By.id("ddate"));
		
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].value='05/08/2022'", element);
	}
}
