package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	
	//verify the logout link in home page of actiTime
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lmcetqj/login.do");
		
		//identify username text box and pass admin
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//identify login button and click
		driver.findElement(By.id("loginButton")).click();
		
		//identify logout link verify
		WebElement logoutlinkelement = driver.findElement(By.partialLinkText("Logout"));
		
		//check is displayed or not
		boolean status = logoutlinkelement.isDisplayed();
		System.out.println(status);
	}

}
