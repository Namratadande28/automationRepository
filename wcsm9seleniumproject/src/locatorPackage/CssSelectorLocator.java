package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
public static void main(String[] args) throws InterruptedException {
	
	//Launch the chrome browser
	WebDriver driver=new ChromeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//Launch the web application
	driver.get("http://desktop-lmcetqj/login.do");
	
	//stop the browser for 2 sec
	Thread.sleep(2000);
	
	// identify the username input as a "admin"
	driver.findElement(By.name("username")).sendKeys("admin");
	
	Thread.sleep(2000);
	
	//identify the password input as a manager
	driver.findElement(By.name("pwd")).sendKeys("manager");
	
	Thread.sleep(2000);
	
	//click on login button
	driver.findElement(By.cssSelector("a[id='loginButton']")).click();
	
	Thread.sleep(4000);
	
	//close the browser
	driver.close();
	
	
	
}

}
