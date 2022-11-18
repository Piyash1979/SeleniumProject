package alert_Concept7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		driver.findElementByLinkText("Merge").click();
		
		String confirmationAlert = driver.switchTo().alert().getText();
		System.out.println(confirmationAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	  //driver.switchTo().alert().dismiss();
		
		driver.close();
	}

}
