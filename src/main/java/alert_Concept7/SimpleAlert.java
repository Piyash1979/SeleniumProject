package alert_Concept7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Click submit
		driver.findElementById("searchBtn").click();
		
		//switch control to Alert from HTML page and get the alert text
		//String simpleAlert = driver.switchTo().alert().getText();
		//System.out.println(simpleAlert);
		//driver.findElementById("searchBtn").click();
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		
		Thread.sleep(3000);
		
		//click on ok
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		
		//driver.close();
	}

}
