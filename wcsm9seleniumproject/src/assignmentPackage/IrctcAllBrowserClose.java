package assignmentPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcAllBrowserClose {
	public static void main(String[] args) throws InterruptedException {
		//handle notification popup in chrome browser 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver(co);
		//maximize the browser
		driver.manage().window().maximize();
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		//Launch the web application
		driver.get("https://www.irctc.co.in/nget/train-search");
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		//close the browser
		driver.close();
	}

}
