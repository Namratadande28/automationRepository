package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the chrom browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//launch the web application
		driver.get("https://www.instagram.com/accounts/login/");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
				
		//identify the username and password input as a "Namrata"
		driver.findElement(By.name("username")).sendKeys("Namrata");
				
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
				
		//identify the username and password input as a "123"
		driver.findElement(By.name("password")).sendKeys("123456");
		
		//stop the execution of browser for 2 sec
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1]")).click();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//close the browser
		driver.close();
	}

}
