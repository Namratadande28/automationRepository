package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		//Thread.sleep(2000);
		
		//identify the username tb
		driver.findElement(By.name("username")).sendKeys("Avishkar");
		
		//identify password tb
		driver.findElement(By.name("password")).sendKeys("Dande@123");
		
		//identify the login button
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
