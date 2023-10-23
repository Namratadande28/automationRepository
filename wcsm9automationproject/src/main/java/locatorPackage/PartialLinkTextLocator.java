package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/seleniumLink.html");
		
		//identify the link by using PartialLinkText locator
		driver.findElement(By.partialLinkText("Link")).click();
		
		//stop the browser fo 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
