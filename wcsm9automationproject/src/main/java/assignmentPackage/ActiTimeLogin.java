package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the web browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("http://desktop-lmcetqj/login.do");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the username input as a "Admin"
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the password input as a "manager"
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		
		
	}

}
