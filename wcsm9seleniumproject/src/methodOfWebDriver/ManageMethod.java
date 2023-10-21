package methodOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//open the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	//maximize the browser
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	//minimize the browser
	driver.manage().window().minimize();
	
	//stop the execution of browser for 4 sec
	Thread.sleep(4000);
	
	//Full screen of window
	driver.manage().window().fullscreen();
	
	//stop the execution of browser for 4 sec
	Thread.sleep(4000);
	
	//set of the browser
	Dimension targetSize=new Dimension(350, 450);
	driver.manage().window().setSize(targetSize);
	
	//stop the execution of browser for 4 sec
	Thread.sleep(4000);
	
	//set the browser position
	Point targetPosition=new Point(350,150);
	driver.manage().window().setPosition(targetPosition);
	
	//close the browser
	driver.close();

	}

}
