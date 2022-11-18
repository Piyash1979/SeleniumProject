package aUI_Concept12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://mrbool.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		
		//selectElement and store it in variable
		WebElement contant=driver.findElementByClassName("menulink");
		
		Thread.sleep(2000);
		
		//Create object of Action class and pass the driver
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);

		//perform moveToElement(Mouse hover on)action pass the element
		action.moveToElement(contant).perform();
		 
		Thread.sleep(2000);

		//click the Article Element
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		
		Thread.sleep(2000);
		//go back to the previous page 
		driver.navigate().back();
		
		Thread.sleep(2000);

		//click the courses element
	   driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
		
		Thread.sleep(2000);
	    driver.navigate().back();

		//click the single videos
		driver.findElementByXPath("//a[contains(text(),'Sin')]").click();
		Thread.sleep(2000);
        driver.navigate().back();
        
        Thread.sleep(2000);
		
		//Go to the page we had came from > Should be used after back
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        

		
		
		//wait for 3 second
		Thread.sleep(3000);
		
		driver.close();
	
	}

}
