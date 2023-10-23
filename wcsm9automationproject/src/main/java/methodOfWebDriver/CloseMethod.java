package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) throws InterruptedException {
	
	//Launch the chrome browser	
	WebDriver driver=new ChromeDriver();
	
	//Maximize the Chrome browser
	driver.manage().window().maximize();
	
	//Launch the Web application
	driver.get("https://www.flipkart.com/");
	
	//Stop the execution of script for 2 sec
	Thread.sleep(2000);
	
	//close the browser
	driver.close();
	}

}
