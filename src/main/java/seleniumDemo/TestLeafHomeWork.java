package seleniumDemo;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeafHomeWork {

	public static void main(String[] args) {
		//Launch ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Print Title
		System.out.println(driver.getTitle());
		
		//Implicitly wait
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Create Lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		//Enter First Name
		driver.findElementById("createLeadForm_companyName").sendKeys("Hema");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//Choose Source
		
		//Close browser
		driver.close();
		
		
		
	}

}
