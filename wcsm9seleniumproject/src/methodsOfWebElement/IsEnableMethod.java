package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//identify login button
		WebElement loginbuttonelement = driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]"));
				
		//verify login button is disble or enable
		boolean status = loginbuttonelement.isEnabled();
		System.out.println(status);
		
		//will click on a button by using click Method
		
		driver.findElement(By.name("username")).sendKeys("Namrata");
		driver.findElement(By.name("password")).sendKeys("Dande@123");
		
		//verify login button is disable or not
		boolean disable = loginbuttonelement.isEnabled();
		System.out.println(disable);
		loginbuttonelement.click();
		
		
	}

}
