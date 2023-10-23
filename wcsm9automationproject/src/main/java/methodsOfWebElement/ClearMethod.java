package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lmcetqj/login.do");
		
		WebElement usernameTB = driver.findElement(By.name("username"));
		usernameTB.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		Thread.sleep(2000);
		
		//clear usernameTB and passTB
         usernameTB.clear();
         passTB.clear();
		
		
	}

}
