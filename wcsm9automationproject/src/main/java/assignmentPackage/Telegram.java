package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Telegram {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the web application
		driver.get("https://telegr.am/user_mgt/login");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
						
		//identify the username and password input as a "Namita"
		driver.findElement(By.name("username")).sendKeys("Namita");
						
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
						
		//identify the username and password input as a "1998"
		driver.findElement(By.name("password")).sendKeys("1998");
				
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		Thread.sleep(4000);
				
		//close the browser
		driver.close();
	}

}
