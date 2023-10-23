package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIDXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/");
	    // identify the search button and click on mobile
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress material");
	    //click on search button
	    driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]")).click();
	    //select 3rd dress
	    driver.findElement(By.xpath("(//span[text()='EthnicJunction']/ancestor::div[@class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro']/descendant::span[@class='a-price-whole'])[3]")).click();
	}

}
