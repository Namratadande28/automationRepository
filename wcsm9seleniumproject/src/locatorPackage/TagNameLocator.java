package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
	
	//Launch the chrome browser	
   WebDriver driver=new ChromeDriver();
   
   //maximize the browser
   driver.manage().window().maximize();
   
   //Launch the web application
   driver.get("file:///C:/Users/Admin/Desktop/htmlcode/SimpleLoginPage.html");
   
   //identify usernameTB and pass input as a "admin"
   driver.findElement(By.tagName("input")).sendKeys("admin");
   
   //stop the execution  of browser foe 4 sec
   Thread.sleep(4000);
   
   //identify usernameTB and Pass input as a "manager"
   driver.findElement(By.tagName("input")).sendKeys("manager");
   
   //stop the execution of browser for 4 sec
   Thread.sleep(4000);
   
   //close the browser
   driver.close();
	}

}
