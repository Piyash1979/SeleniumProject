package windowHandle14_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

		// Click Try it Yourself
		driver.findElement(By.linkText("Try it Yourself")).click();
		
		//getWindowHandle.return only current window reference
		String Firstwindow = driver.getWindowHandle();
		System.out.println("First window reference: " +Firstwindow);
		
		//or get current first window reference
		//String Currentwin = driver.getWindowHandle();
		//System.out.println(Currentwin);
		
		Thread.sleep(3000);
		driver.close();

	}

}
