package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/seleniumLink.html");
		
		//identify the links by using LinkText locator
		driver.findElement(By.linkText("SeleniumLink")).click();
		
		//stop for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
	}

}
