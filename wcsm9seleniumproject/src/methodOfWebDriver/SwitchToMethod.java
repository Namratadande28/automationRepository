package methodOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the web application
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("https://www.google.com/");
		
		//Stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//Switch the controls to active element
		driver.switchTo().activeElement().sendKeys("Selenium",Keys.ENTER);
		
		//close the browser
		driver.close();
	}
	

}
