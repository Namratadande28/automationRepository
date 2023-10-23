package assignmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartEndtoEndFlow {
	
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	 driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.flipkart.com/");
	  //handle popup
	  driver.findElement(By.xpath("//span[text()='✕']")).click();
	  //identify iphone
	  driver.findElement(By.name("q")).sendKeys("iphone");
	  //click on enter button
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  //get the address of parent window
	  String parentHandle = driver.getWindowHandle();
	  
	  //click on 2 nd mobile
	  driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")).click();
	  Thread.sleep(2000);
	  //get the address of all the windows
	  Set<String> allHandles = driver.getWindowHandles();
	  
	  for(String wh:allHandles)
	  {
		  if(!parentHandle.equals(wh))
		  {
			driver.switchTo().window(wh);  
		  }
	  }
		  
	  Thread.sleep(2000);
	  //select the color
	  //driver.findElement(By.xpath("//div[@class='_2C41yO']/ancestor::a/following-sibling::div/descendant::div[text()='(PRODUCT)RED']")).click();
	   driver.findElement(By.xpath("(//div[@class='_2C41yO'])[1]")).click();
	   driver.findElement(By.partialLinkText("256 GB")).click();
	  driver.findElement(By.id("pincodeInputId")).clear();
	   driver.findElement(By.id("pincodeInputId")).sendKeys("413512");
	   driver.findElement(By.xpath("//span[text()='Check']")).click();
	   //driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2U9uOA _3v1-ww')]")).click();
	   driver.findElement(By.xpath("//span[text()='GO TO CART']")).click();
	   
	 // WebElement removeButton=driver.findElement(By.xpath("//div[text()='Remove']"));
	   // Point loc = removeButton.getLocation();
	   // int xaxis=loc.getX();
	   // int yaxis=loc.getY();
	     //  JavascriptExecutor jse=(javascriptExecutor).driver;
	     //  jse.executeScript(""window.scrollBy ("+xaxis+ ":" +yaxis));
	   
	         
	  
	  

	 
	}

}
