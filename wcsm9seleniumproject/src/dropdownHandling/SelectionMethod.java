package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		//identify dropdown option and click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		//identify the phone no dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[contains(@class,'border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-5/12')]"));
		
		Select sel = new Select(dropdown1);
		//Thread.sleep(2000);
		
		//select the option
		sel.selectByIndex(2);
		
		//identify the country dropdown
		WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel2 = new Select(dropdown2);
		sel2.selectByValue("India");
		
		//identify state dropdown
		WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select sel3 = new Select(dropdown3);
		sel3.selectByVisibleText("Assam");
		Thread.sleep(2000);
		
		//handle multi select dropdown
		driver.navigate().to("file:///C:/Users/Admin/Desktop/htmlcode/MultiSelectDropdown.html");
		Thread.sleep(2000);
		
		//identify a dropdown
		WebElement dropdown4 = driver.findElement(By.id("idddd"));
		
		Select sel4 = new Select(dropdown4);
		sel4.selectByIndex(5);
		Thread.sleep(2000);
		
		//select multiple options from multi select dropdown
		for(int i=0;i<=5;i++)
		{
		  sel4.selectByIndex(i)	;
		}
		
		driver.navigate().to("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.partialLinkText("Multi Select")).click();
		WebElement dropdown5 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel5 = new Select(dropdown5);
		sel5.selectByIndex(4);
		}

}
