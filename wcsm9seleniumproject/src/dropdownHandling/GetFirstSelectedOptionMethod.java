package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/MultiSelectDropdown.html");
		
		//single select dropdown
		WebElement dropdown1 = driver.findElement(By.id("idddd"));
		//handle the dropdown
		Select sel = new Select(dropdown1);
		//select the option from dropdown
		sel.selectByValue("v1");
		//get the option which is selected first
		WebElement firstopt = sel.getFirstSelectedOption();
		//get the text of firstopt option()
		System.out.println(firstopt.getText());
		
		//multi select dropdown
		driver.navigate().to("file:///C:/Users/Admin/Desktop/htmlcode/MultiSelectDropdown.html");
		//identify dropdown
		WebElement dropdown2 = driver.findElement(By.id("idddd"));
		//handle the multi select dropdown
		Select sel2 = new Select(dropdown2);
		//select multiple option from multi select dropdown
		for(int i=0;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		
		//getOption which is selected first
		Thread.sleep(2000);
		System.out.println(sel2.getFirstSelectedOption().getText());
	}

}
