package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod  {
	public static void main(String[] args) throws InterruptedException
	{
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Launch the web application by using navigate();
        Navigation nav=driver.navigate();
	    nav.to("https://www.selenium.dev");
	    Thread.sleep(2000);
	
	    //to perform backward operation
	    nav.back();
	    Thread.sleep(2000);
	
	    //to perform the forward operation
	    nav.forward();
	    Thread.sleep(2000);
	
	    //to perform refresh operation
	    nav.refresh();
	
	    //close the browser
	    driver.close();
	
	}

}
