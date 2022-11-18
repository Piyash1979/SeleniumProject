package testNGTestCases18_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MergeLead {
	
	public ChromeDriver driver;
	@Test
	public void mergeLead() throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();
	    ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// Enter Username 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter Password 
		driver.findElementById("password").sendKeys("crmsfa");
		// Click Login Button 
		driver.findElementByClassName("decorativeSubmit").click();
		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(2000);
	
	
    
	   System.out.println("MergeLead");
    
	   //Close browser
	   driver.close();
}
}
