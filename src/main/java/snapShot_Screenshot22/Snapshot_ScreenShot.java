package snapShot_Screenshot22;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot_ScreenShot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// launch Chrome browse
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
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
		driver.findElementByLinkText("CRM/SFA").click();
		//driver.findElementByLinkText("").click();
		
		//Click create lead
		driver.findElementByLinkText("Create Lead").click();
		
		//write company name
		driver.findElementByName("companyName").sendKeys("MVB");
		
		//write first name
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        System.out.println("FirstName entered successfully");
		
        //write last name
        driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
        System.out.println("LastName entered successfully");
        
        
		//Take snapshot/ Screenshot
        File src = driver.getScreenshotAs(OutputType.FILE);
        
		//Path /Location-1 where it will store
        File dest=new File("C:\\Users\\ginic\\OneDrive\\Desktop\\SnapShot\\image.png");
        
       //Path /Location-1 where it will store
        FileUtils.copyDirectory(src, dest);//moved file source to destination
        
        //Click create lead
        driver.findElementByClassName("smallSubmit").click();
		
		Thread.sleep(8000);
		
		//Close browser
		//driver.close();
		driver.close();
	}


}
