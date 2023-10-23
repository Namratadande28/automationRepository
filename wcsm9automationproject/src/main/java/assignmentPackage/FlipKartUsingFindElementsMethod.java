package assignmentPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartUsingFindElementsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		//handle popup
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		//identify name in search box
		driver.findElement(By.name("q")).sendKeys("Laptop");
		//click on search icon
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//identify processor and click on 33 more 
		driver.findElement(By.xpath("//span[text()='33 MORE']")).click();
		//select the processor of core i7
		driver.findElement(By.xpath("//div[@title='Core i7']")).click();
		Thread.sleep(2000);
		//click on apply filters button
		driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
		Thread.sleep(2000);
		
		//click on brand
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Brand']")).click();
		//select hp
		driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']/descendant::div[text()='HP']")).click();
		Thread.sleep(2000);
		
		//click operating system
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Operating System']")).click();
		//select windows 11
		driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']/descendant::div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		
		//select customer rating
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		
		//identify all the suggestions of laptop
		//List<WebElement> ListOfWebElement = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		  List<WebElement> ListOfWebElement = driver.findElements(By.xpath("//div[@class='_4rR01T' or (@class='_30jeq3 _1_WHN1')]"));
		//read all the suggestions of bike by using for loop
		Thread.sleep(2000);
		for(WebElement op:ListOfWebElement)
		{
		  String options = op.getText();
		  Thread.sleep(2000);
		  System.out.println(options);
		}
		
		
		driver.close();
		
	}

}
