package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the web application
		driver.get("https://omayo.blogspot.com/");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//get the address of current window
		String displayHandle = driver.getWindowHandle();
		System.out.println(displayHandle);
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
