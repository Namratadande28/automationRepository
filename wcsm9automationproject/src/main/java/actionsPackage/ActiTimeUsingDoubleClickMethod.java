package actionsPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeUsingDoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-lmcetqj/login.do");
		
		//identify username
		driver.findElement(By.name("username")).sendKeys("admin");
		//identify password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on login button
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//click on setting
		driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		//click on logo and color scheme
		driver.findElement(By.partialLinkText("Logo & Color Scheme")).click();
		
		//click on use custom logo checkbox
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		
		//driver.findElement(By.xpath("//input[@name='formCustomInterfoceLogo']")).click();
		
		//double click on choose file button
		WebElement ChooseFile = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		Actions act = new Actions(driver);
		act.doubleClick(ChooseFile).perform();
	}

}
