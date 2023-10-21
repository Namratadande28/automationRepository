package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/MultiSelectDropdown.html");
		
		//perform multiple dropdown
		WebElement menudropdown = driver.findElement(By.id("idddd"));
		
		
		Select sel2 = new Select(menudropdown);
		//Thread.sleep(2000);
		////sel2.selectByIndex(200);
		//Thread.sleep(2000);
		//sel2.deselectByIndex(2);
        
		for(int i=0;i<=4;i++) 
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		Thread.sleep(2000);
		for(int i=0;i<=4;i++)
		{
		 Thread.sleep(200);
		 sel2.deselectByIndex(i);
		}
		
		//select and deselect option by using value
		sel2.selectByValue("v9");
		Thread.sleep(2000);
		sel2.deselectByValue("v9");
		
		//select and deselect option by using visible text
		sel2.selectByVisibleText("Misal");
		Thread.sleep(2000);
		sel2.deselectByVisibleText("Misal");
	}

}
