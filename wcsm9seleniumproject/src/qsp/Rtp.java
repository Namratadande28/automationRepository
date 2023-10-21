package qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		//to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser value");
        String browserValue = sc.next();
        
		if(browserValue.equalsIgnoreCase("Chrome"))
        {
                	
        	//driver=new ChromeDriver();
        //	driver.manage().window().maximize();
        	Thread.sleep(2000);
         }
        
        else if(browserValue.equalsIgnoreCase("firefox"))
        {
        	//driver=new FirefoxDriver();
        	
        	
        }
	}

}
