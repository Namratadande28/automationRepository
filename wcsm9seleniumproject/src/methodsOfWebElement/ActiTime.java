package methodsOfWebElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
   public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-lmcetqj/login.do");
	WebElement usn = driver.findElement(By.name("username"));
	usn.sendKeys("admin");
	WebElement pass = driver.findElement(By.name("pwd"));
	pass.sendKeys("manager");
	
	
	
     List<WebElement> abd = driver.findElements(By.xpath("//table[@class='textFieldsTable']"));
     
	for(WebElement ab:abd )
	{
		System.out.println(ab.getText());
		
		
	}
}	
}
