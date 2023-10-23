package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValue_GetTagnameMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get the attribute value of username textbox i.e.name attribut
		WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		String attributevalue = usnTB.getAttribute("class");
		System.out.println(attributevalue);
		
		//get the css property of username textbox i.e. color
		String cssValue = usnTB.getCssValue("color");
		System.out.println(cssValue);
		
		//get the tagname of username textbox 
		String tag = usnTB.getTagName();
		System.out.println(tag);
	}
}