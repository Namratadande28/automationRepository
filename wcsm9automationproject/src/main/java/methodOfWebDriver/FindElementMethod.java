package methodOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lmcetqj/login.do");
		//identify username textBox
		WebElement usnTB = driver.findElement(By.name("username"));
		System.out.println("usnTB");
		usnTB.sendKeys("admin");
	}

}
