package methodOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
	public static void main(String[] args) throws InterruptedException {
	
	//Lauch the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	//maximize the chrome browser
	driver.manage().window().maximize();
	
	//Lauch the web application
	driver.get("https://omayo.blogspot.com/");
	
	//stop the execution of script for 2 sec
	Thread.sleep(2000);
	
	//click on open a popup window link
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	
	//close the browser
	driver.quit();
	}

}
