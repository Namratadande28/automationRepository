package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminatesDuplicates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/SingleSelectDropdown.html");
		
		//identify the dropdown and store into a reference variable
		WebElement menuDropdown = driver.findElement(By.id("idddd"));
		
		//get all the options of menuDropdown
		Select sel = new Select(menuDropdown);
		List<WebElement> allops = sel.getOptions();
		
		//to eliminates duplicate we use has set
		HashSet<String> hs = new HashSet<String>();
		
		//read the list by using for loop and eliminates duplicates
		for(int i=0;i<allops.size();i++)
		{
			WebElement op = allops.get(i);
			
			//get the text of element
			String dropdownoption = op.getText();
		
			
			//add the dropdownoption into has set and remove we gets from dropdown
			hs.add(dropdownoption);
		}
		Thread.sleep(2000);
		
		//read the option from hasset by using foe each loop
		for(String opt:hs)
		{
		  Thread.sleep(2000);
		  System.out.println(opt);
		}
	}

}
