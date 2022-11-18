package windowHandle14_2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		// Click Try it Yourself
		driver.findElement(By.partialLinkText("Try it Yourself")).click();
				
		//To get all the window references
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		//Switching 1st window to 2nd window
		for(String eachwin:allwindow) {
			System.out.println(eachwin);
			driver.switchTo().window(eachwin);
			System.out.println(driver.getTitle());
		}

		driver.close();
		
		}
	}


