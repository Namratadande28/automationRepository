package methodOfWebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch the Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("https://omayo.blogspot.com/");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
				
		//click on popup window link
		driver.findElement(By.partialLinkText("Open a popup window")).click();
	   
		// Set<String> displayAllHandles = driver.getWindowHandles();
		//System.out.println(displayAllHandles);
		
		//get the address of current window
		System.out.println(driver.getWindowHandles());
		
		//close the browser
		driver.quit();
	}

}
