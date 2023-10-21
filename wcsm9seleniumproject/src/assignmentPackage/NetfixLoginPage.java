package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetfixLoginPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch the netflix
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		//identify phone or mail text box
		driver.findElement(By.id("id_userLoginId")).sendKeys("abcde");
		Thread.sleep(2000);
		driver.findElement(By.id("id_password")).sendKeys("973636");
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small'")).click();
		
		
		
	}

}
