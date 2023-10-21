package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		
		//lauch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the web application
		driver.get("https://www.facebook.com/");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//identify the username and password input as a "Avishkar"
		driver.findElement(By.id("email")).sendKeys("Avishkar@1.com");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//identify the username and password input as a "Avi@09"
		driver.findElement(By.id("pass")).sendKeys("Avi@09");
		
		//click on login page
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
