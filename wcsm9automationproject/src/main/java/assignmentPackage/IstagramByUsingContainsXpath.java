package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IstagramByUsingContainsXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		//identify the username by using contains xpath
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Namrata");
		Thread.sleep(2000);
		//identify the password by using contains xpath
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("Dande@123");
		Thread.sleep(2000);
		//identify the login button by using contains xpath
		driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		//driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
