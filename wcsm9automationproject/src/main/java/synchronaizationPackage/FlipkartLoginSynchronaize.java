package synchronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLoginSynchronaize {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		
		//handle pop up window
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		//Thread.sleep(2000);
		
		//click on cart
		//driver.findElement(By.xpath("//a[@class='_1krdK5' and (@title='Cart')]")).click();
	    driver.findElement(By.xpath("//a[text()='Cart']")).click();
	    //Thread.sleep(2000);
		
	    //click on login button
		//driver.findElement(By.xpath("//button[contains(@class,'_2')]\"")).click();
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
	   //Thread.sleep(2000);
		
	   //enter mobile number
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9637642847");
	   //Thread.sleep(2000);
	   
	   //click on request otp button
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	 
	}

}
