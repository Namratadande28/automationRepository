package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
	
	//Launch the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	//maximize the chrome browser
	driver.manage().window().maximize();
	
	//Launch the web application
	driver.get("https://www.primevideo.com/");
	
	//Stop the execution of script of 8 sec
	Thread.sleep(8000);
	//get the url of current webpage
	System.out.println(driver.getCurrentUrl());
	
	//close the browser
	driver.close();
	}

}
