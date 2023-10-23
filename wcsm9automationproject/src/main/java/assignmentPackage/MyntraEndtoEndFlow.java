package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyntraEndtoEndFlow {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.myntra.com/wishlist");
	    
	    driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shooes");
	    driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	    //get the address of parent window
	    String parentHandle = driver.getWindowHandle();
	    //click on first shooes
	   driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
	   //Thread.sleep(2000);
	   
	   //get the address of all the window
	   Set<String> allHandles = driver.getWindowHandles();
	   
	   for(String wh:allHandles)
	   {
		 if(!parentHandle.equals(wh))
		 {
			driver.switchTo().window(wh);
		 }
	   }
	   
	   //Thread.sleep(2000);
	   driver.findElement(By.xpath("//p[text()='6']")).click();
	   //click on add to cart button
	   driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
	   //click on go to bag button
	   driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	   
	   //click on remove button
	   //driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
	}

}
