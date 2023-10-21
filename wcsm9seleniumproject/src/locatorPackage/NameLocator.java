package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/Radio.html");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify C radio button by using name locator
		driver.findElement(By.name("name3")).click();
				
		//wait for 2 sec			
		Thread.sleep(2000);
		
		//identify A  radio button by using name locator
		driver.findElement(By.name("name1")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//close browser
		driver.close();
		
	}

}
