package alert_Concept7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		//by using alert class
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.getText();
		System.out.println(promptAlert.getText());
		
		Thread.sleep(3000);
		promptAlert.sendKeys("I am a human");
		
		//explicitly wait
		Thread.sleep(3000);
		promptAlert.accept(); 
		
		//driver.findElement(By.id("result")).getText();
		//System.out.println(driver.findElement(By.id("result")).getText());

		//or
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
