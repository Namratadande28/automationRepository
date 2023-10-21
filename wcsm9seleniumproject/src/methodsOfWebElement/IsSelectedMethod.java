package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	
	//verify check box in login page
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lmcetqj/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//identify check box for varify
		WebElement checkboxelement = driver.findElement(By.name("remember"));
		//check the chech box is selected or no
		boolean check = checkboxelement.isSelected();
		System.out.println(check);
		
		//select the checkbox and verify the status
		checkboxelement.click();
		
		boolean status = checkboxelement.isSelected();
		System.out.println(status);
		
	}

}
