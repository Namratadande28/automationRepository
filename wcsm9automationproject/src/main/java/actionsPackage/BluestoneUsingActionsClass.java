package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneUsingActionsClass {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//handle popup
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		
		//perform mousehover jewellery
		WebElement watchJewelleryTarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(watchJewelleryTarget).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		driver.close();
	
	}
	
}
