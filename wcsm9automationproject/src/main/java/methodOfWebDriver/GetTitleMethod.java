package methodOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
	
	//Launch the edge browser	
	WebDriver	driver=new EdgeDriver();
	
	//maximize the chrome browser
	driver.manage().window().maximize();
	
	//Launch the web application
	driver.get("http://desktop-lmcetqj/login.do");
	
	//Stop the execution of script of 2 sec
	Thread.sleep(2000);
	
	//get the title of current webpage
	String displayTitle = driver.getTitle();
	System.out.println(displayTitle);
	//System.out.println(driver.getTitle());
	
	//close the browser
	driver.close();
	}
}
