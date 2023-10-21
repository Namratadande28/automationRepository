package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VistaraUsingCssSelector { 
	public static void main(String[] args) throws InterruptedException {
		//handle notification popup in chrome browser
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications");
		 
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Launch the web application of airvistara
		driver.get("https://www.airvistara.com/in/en");
		
		// close the middle popup notification
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		
		//identify origin text box by using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Select Departure City']")).sendKeys("pune");
		Thread.sleep(2000);
		
		//identify the select arrival city text box by using cssSelector
		driver.findElement(By.cssSelector("input[placeholder='Select Arrival City']")).sendKeys("mumbai");
		Thread.sleep(2000);
		
		//click on travle date text box
		driver.findElement(By.id("travel-Dates")).click();
		Thread.sleep(2000);
		//click on departure
		driver.findElement(By.id("depart-radio")).click();
		Thread.sleep(2000);
		//select departure date
		driver.findElement(By.cssSelector("a[data-date='30']")).click();
		Thread.sleep(2000);
		//select return date
		driver.findElement(By.cssSelector("a[data-date='30']")).click();
		Thread.sleep(2000);
		
		//click on passenger text box
		driver.findElement(By.id("passengers")).click();
		Thread.sleep(2000);
		//select business
		driver.findElement(By.cssSelector("button[value='business']")).click();
		Thread.sleep(2000);
		//click on done button
		driver.findElement(By.cssSelector("button[class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		Thread.sleep(2000);
		
		//button[contains(@class,'col-xs-12 d')]
		
		//click on search flights button
		driver.findElement(By.cssSelector("button[id='book-flight-widget']")).click();
		Thread.sleep(4000);
		
		//close the browser
		driver.close();

		
		
		
	}

}
