package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		// launch Chrome browse
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("driver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
				
		
		//ChromeDriver driver= new ChromeDriver();
		ChromeDriver driver=new ChromeDriver();
		
		//load url
		driver.get("http://leaftaps.com/opentaps/control/main ");
				
		//Maximize window
		//driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		//Print Title of the window
		//System.out.println(driver.getTitle());
		System.out.println(driver.getTitle());
		
		//Implicitly wait
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		
		//Enter Password
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		//Click login button
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click CRM/SFA
		//driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("").click();
		
		//Click create lead
		driver.findElementByLinkText("Create Lead").click();
		
		//write company name
		driver.findElementByName("companyName").sendKeys("MVB");
		
		//write first name
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
        //write last name
        driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
        
        //Click create lead
        driver.findElementByClassName("smallSubmit").click();
		
		Thread.sleep(8000);
		
		//Close browser
		//driver.close();
		driver.close();
	}

}
