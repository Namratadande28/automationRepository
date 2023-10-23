package assignmentPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		//Launch the ChromeBrowser
		WebDriver driver=new ChromeDriver(co);
		//maximize the browser
		driver.manage().window().maximize();
		//Launch the web application
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.switchTo().activeElement().sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'fa fa-window-close pull-right loginCloseBtn ng-tns-c19-13')]")).click();
		
		//driver.findElement(By.xpath("//a[@aria-label='Sweep from and to station.']")).click();
		
	
		
	}

}
