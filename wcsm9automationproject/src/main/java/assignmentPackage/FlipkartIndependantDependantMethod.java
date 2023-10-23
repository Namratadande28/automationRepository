package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIndependantDependantMethod {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("https://www.flipkart.com/");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//close the popup window or handle hidden  divison pop up
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//click on search box 
		driver.findElement(By.name("q")).sendKeys("mobile");
		Thread.sleep(2000);
		
		//click on search button
		//driver.findElement(By.xpath("button[contains(@aria-label,'Brand and more')]").click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//identify the 2 nd mobile
       driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1'])[2]")).click();
	   //System.out.println("price");
	}

}
