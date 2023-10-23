package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackUsingExplicitPM { 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://www.shoppersstack.com/");
		
		//click on samsung 
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		
		//click on pincode
		driver.findElement(By.id("Check Delivery")).sendKeys("413512");
		//Thread.sleep(2000);
		
		WebElement clickButton=driver.findElement(By.id("Check"));
		explicitWait(driver, 30, clickButton).click();
	}
	
	public static WebElement explicitWait(WebDriver driver, long sec, WebElement ele)
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
	WebElement element=wait.until(ExpectedConditions.elementToBeClickable(ele));
	return element;
	
	
	}

}
