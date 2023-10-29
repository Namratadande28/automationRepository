package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		//store all the drag element
		WebElement scr1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement scr2 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement scr3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement scr4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
	    //store all the drop element	
		WebElement target1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement target2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement target3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		WebElement target4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		
		//perform drag and drop for mobile
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(scr1, target1).perform();
		
		Thread.sleep(2000);
		act.dragAndDrop(scr2, target2).perform();
		
		//perform drag and drop for laptop
		Thread.sleep(2000);
		act.dragAndDrop(scr3, target3).perform();
		
		Thread.sleep(2000);
		act.dragAndDrop(scr4, target4).perform();
	}

}
