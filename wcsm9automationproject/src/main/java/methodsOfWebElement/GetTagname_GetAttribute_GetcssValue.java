package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname_GetAttribute_GetcssValue {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//get the tagname of login button
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	String tag = login.getTagName();
	System.out.println(tag);
	
	//get the attribute of login button i.e. class attribute
	  String attributevalue = login.getAttribute("type");
	  System.out.println(attributevalue);
      
	  //get the css value of lagin button i.e. width
	  String cssValue = login.getCssValue("width");
	  System.out.println(cssValue);
}
}
