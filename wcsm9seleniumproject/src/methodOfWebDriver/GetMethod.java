package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
	
		//To launch the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	//maximize the chrome browser
	driver.manage().window().maximize();
	
	//Launch the web application
	driver.get("https://omayo.blogspot.com/");
	
	//Stop the execution of script of 2 sec
	Thread.sleep(2000);
	
	//close the browser
	driver.close();
	}
}
