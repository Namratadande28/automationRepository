package dropdownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Admin/Desktop/htmlcode/MultiSelectDropdown.html");
		WebElement dropdown = driver.findElement(By.id("idddd"));
		
		//handle the dropdown
		Select sel = new Select(dropdown);
		
		//get the options from by using getwrappedelement
		WebElement all = sel.getWrappedElement();
		//by the adress of menu (id-idddd)
		System.out.println(all);
		//all the list of menu
		System.out.println(all.getText());
		
		//get all the options from dropdown by sing getoptions
		List<WebElement> options = sel.getOptions();
		for(WebElement opt:options) 
		{
			Thread.sleep(2000);
			System.out.println(opt.getText());
		}
		
		//select the option from dropdown without using selection method
		for(WebElement opt:options)
		{
			Thread.sleep(2000);
			if(opt.getText().equals("Vadapav"))
			{
				opt.click();
				break;
			}
		}
		
	}

}
