package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		
	//Launch the chrome browser
	WebDriver driver=new ChromeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//Launch the web element
	driver.get("file:///C:/Users/Admin/Desktop/htmlcode/SimpleLoginPage.html");
	
	//stop the execution of browser for 2 sec
	Thread.sleep(2000);
	
	//identify the usernameTB pass input as a "admin"
	driver.findElement(By.id("11")).sendKeys("admin");
	
	//stop the execution of browser for 4 sec
	Thread.sleep(4000);
	
	//identify the usernameTB and pass input as a "manager"
	 driver.findElement(By.id("12")).sendKeys("manager");
	 
	 Thread.sleep(2000);
	 
	 //close the browser
	 driver.close();
	
	
	}

}
