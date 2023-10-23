package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirVistaraUsingXpathLocator {
	public static void main(String[] args) throws InterruptedException {
		//handle notification popup in chrome browser
		 ChromeOptions co = new ChromeOptions();
		 co.addArguments("--disable-notifications");
		 
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		//Launch the web application of airvistara
		driver.get("https://www.airvistara.com/in/en");
		
		Thread.sleep(2000);
		
		// close the middle popup notification
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		
		//click on origin text box
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("pune");
		Thread.sleep(2000);
		
		//click on destination text box
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("mumbai");
		Thread.sleep(2000);
		
		//click on departure date text box
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
		//select the departure date
		driver.findElement(By.xpath("//a[@data-date='30']")).click();
		Thread.sleep(2000);
		//select the return date
		driver.findElement(By.xpath("//a[@data-date='30']")).click();
		Thread.sleep(2000);
		
		//click on passenger text box
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		Thread.sleep(2000);
		//select the premium economy
		driver.findElement(By.xpath("//button[@value='premium-economy']")).click();
		Thread.sleep(2000);
		//click on done button
		driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
		Thread.sleep(2000);
		
		//
		
		//click on search flights button
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
		

	}

}
