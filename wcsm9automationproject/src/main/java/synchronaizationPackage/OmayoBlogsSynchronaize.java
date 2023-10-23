package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
																																																																											import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogsSynchronaize {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://omayo.blogspot.com/");
		 
		 driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		 driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
		 
		 //apply explicit wait
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 //WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.id("myDropdown")));
		 //ele.click();
		 
		 //handle pop up window
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
	}

}
