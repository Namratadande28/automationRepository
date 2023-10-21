package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-lmcetqj/login.do");
		
		//identify the username by using Xpath 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		//identify the password by using Xpath
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		//select the checkbox by using Xpath
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		Thread.sleep(2000);
		//click on login button by using Xpath
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		//click on users text Xpath
		driver.findElement(By.className("sizer")).click();
		Thread.sleep(2000);
		//click on project and customers textbox
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		//click on create new customer button
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		Thread.sleep(2000);
		
		//click on customer name text box
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		//click on create customer button
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		
		//click on create new project button
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		Thread.sleep(2000);
		//click on customer textbox
		driver.findElement(By.xpath("//select[@name='customerId']")).sendKeys("Vaibhav");
		Thread.sleep(2000);
		//click on project textbox
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("System administrative");
		Thread.sleep(2000);
		//click on create project button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		}

}
