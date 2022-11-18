package learnTestNGParameters1_22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificWrapper {
   	public ChromeDriver driver;
   	
   	@Parameters({"url","uname","pwd"})

	@BeforeMethod
	public void login(String url,String uname,String pwd) {
	
	//Launch ChromeDriver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			
			ChromeDriver driver=new ChromeDriver();
			
			//Load URL
			driver.get(url);
			
			//Maximize Window
			driver.manage().window().maximize();
			
			//Print Title
			System.out.println(driver.getTitle());
			
			//Implicitly wait
			//Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//Enter User Name
			driver.findElementById("username").sendKeys(uname);
			
			//Enter Password
			driver.findElementById("password").sendKeys(pwd);
			
			//Click login
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();
			
}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		
	}
}
