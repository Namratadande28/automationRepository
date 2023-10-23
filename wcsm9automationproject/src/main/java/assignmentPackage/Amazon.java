package assignmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//search the product in search text box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
		//click on search icon
		driver.findElement(By.id("nav-search-submit-button")).click();
		//click on customer review
		driver.findElement(By.xpath("//section[@aria-label='4 Stars & Up']")).click();
		//select brand
		driver.findElement(By.id("p_89/Fastrack")).click();
		//select price
		driver.findElement(By.xpath("//span[text()='₹2,000 - ₹5,000']")).click();
	}

}
