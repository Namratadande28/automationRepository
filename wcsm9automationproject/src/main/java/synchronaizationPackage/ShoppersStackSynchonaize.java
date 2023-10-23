package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackSynchonaize {
	
	public static void main(String[] args) throws InterruptedException {
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
		
		//apply explicit wait

		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30)); 
		//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		//ele.click();
		
		//click on check button
		//driver.findElement(By.id("Check")).click();
		
	}
	
	

}
