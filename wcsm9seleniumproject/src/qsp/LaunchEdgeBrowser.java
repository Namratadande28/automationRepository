package qsp;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//stop the execution of script for 2 sec
		System.out.println("Edge is open!!");
		Thread.sleep(2000);
		
		//close the edge browser
		driver.close();
		
		System.out.println("Edge is close!!!!");
		
		
	}
}
