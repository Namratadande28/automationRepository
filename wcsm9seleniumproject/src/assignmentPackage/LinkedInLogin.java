package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Launch the web application
		driver.get("https://www.linkedin.com/login");
	
		//stop the execution of browser for 2 sec
		 Thread.sleep(2000);
		 						
		 //identify the username and password input as a "Pari"
		 driver.findElement(By.name("session_key")).sendKeys("namudande1998@gmail.com");
		 						
		 //stop the execution of browser for 2 sec
		 Thread.sleep(2000);
		 						
		 //identify the username and password input as a "0987"
		 driver.findElement(By.name("session_password")).sendKeys("Dande@123");
		 				
		 //stop the execution of browser for 2 sec
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector("button[class='btn__primary--large from__button--floating']")).click();
		 
		 //stop the browser for 4 sec
		 Thread.sleep(4000);
		 				
		 //close the browser
		 driver.close();
	}

}
