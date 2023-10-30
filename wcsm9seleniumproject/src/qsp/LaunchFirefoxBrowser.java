package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Stop the execution of script for 2 sec
		System.out.println("Firefox is open....!");
		Thread.sleep(2000);
		
		//close the firefox 
		driver.close();
		System.out.println("Firefox is close.....!!");
		
		
	}

}
