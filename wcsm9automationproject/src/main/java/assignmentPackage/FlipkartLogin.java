package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
   public static void main(String[] args) throws InterruptedException {
	
	   //launch the chrome browser
	   WebDriver driver=new ChromeDriver();
	   
	   //maximize the browser
	   driver.manage().window().maximize();
	   
	   //launch the web application
	   driver.get("https://affiliate.flipkart.com/login");
	   
	 //stop the execution of browser for 2 sec
	 Thread.sleep(2000);
	 						
	 //identify the username and password input as a "Khushi"
	 driver.findElement(By.id("inputEmail")).sendKeys("namudande1998@gmail.com");
	 						
	 //stop the execution of browser for 2 sec
	 Thread.sleep(2000);
	 						
	 //identify the username and password input as a "2017"
	 driver.findElement(By.id("inputPassword")).sendKeys("Dande@123");
	 				
	 //stop the execution of browser for 2 sec
	 Thread.sleep(2000);
	 
	 driver.findElement(By.cssSelector("input[type='submit']")).click();
	 
	 Thread.sleep(6000);
	 				
	 //close the browser
	 driver.close();

    }
}
