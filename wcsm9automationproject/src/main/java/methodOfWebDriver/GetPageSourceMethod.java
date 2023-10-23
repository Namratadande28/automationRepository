package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSourceMethod {
	public static void main(String[] args) throws InterruptedException 
	{
	//Launch the Edge browser
	WebDriver	driver=new EdgeDriver();
	
	//maximize the Edge browser
	driver.manage().window().maximize();
	
	//Launch the web application
	driver.get("https://amc.amazon.com/");
	
	//source code of secure exam browser
	System.out.println(driver.getPageSource());
		
	//stop the execution of script of 2 sec
	Thread.sleep(4000);
	
	//close the browser
	driver.close();
	
	}

}
