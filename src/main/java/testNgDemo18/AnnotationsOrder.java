package testNgDemo18;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsOrder {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Enter User Name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(300);
		
	}
	
	
	@Test(priority =0)
	public void createlead() throws InterruptedException {
		
		//Click Lead link
		 driver.findElementByLinkText("Leads").click();
		
		
		
		//driver.findElementByLinkText("Create Lead").click();
		driver.findElementByPartialLinkText("Create").click();
		
		//Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		//Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		
		//Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		
		//Choose Source
		/*WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd= new Select(src);
		dd.deselectByVisibleText("Conference");*/
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd=new Select(src);
		//dd.selectByVisibleText("Conference");
		//dd.selectByValue("LEAD_CONFERENCE");
		dd.selectByIndex(2);
		
		//Enter First name local
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Hema");
		
		//Last Name local
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Mali");
		
		//Enter salutation
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Ms.");
		
		
		//Enter Title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
		
		//Choose Industry
		WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1= new Select(ind);
		dd1.selectByValue("IND_SOFTWARE");
		
		//Choose Ownership
		WebElement ons = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd2 =new Select(ons);
		dd2.selectByIndex(1);
		
		//Enter Description
		driver.findElementById("createLeadForm_description").sendKeys("TCS");
		
		//Enter Country Code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
		
		//Enter Area Code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("682");
		
		//EnterDepartment
		driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
		
		//Enter Number Of Employees
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		
		//Enter Web Url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
		
		//Enter City
		driver.findElementById("createLeadForm_generalCity").sendKeys("FreshMeadows");
		
		
		//Choose State/Province
		WebElement st = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd3 =new Select(st);
		dd3.selectByValue("NY");
		
		
		//Choose Country
		WebElement cnt = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd4 = new Select(cnt);
		dd4.selectByVisibleText("United States");
		
		
		//Enter Zip/Postal Code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("11365");
		
		//Choose Marketing Campaign
		//WebElement camp = driver.findElementById("createLeadForm_marketingCampaignId");
		//Select dd5 = new Select(camp);
		//dd3.selectByVisibleText("Automobile");
		WebElement mcmp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd5 =new Select(mcmp);
		dd5.selectByValue("DEMO_MKTG_CAMP");
		
		//Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		
		//Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
		
		//Click Create lead
		driver.findElementByName("submitButton").click();
		
		Thread.sleep(2000);
		
		//go back to the previous page 
		/*driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Go to the page we had came from > Should be used after back
        driver.navigate().forward();
        
        Thread.sleep(3000);
        
        driver.navigate().refresh();*/

	}
	@Test(priority =1)
	public void editlead() {
		
	
		
		//Click Lead link
		 driver.findElementByLinkText("Leads").click();
		 
		 //click create lead link
		 driver.findElementByXPath("//a[text()='Create Lead']").click();

		 //compani name
		 driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		 
		 // Enter First name
		 driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
		 
		 //Enter Last name
		 driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
		 
		 //Choose source
		 WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		 Select dd= new Select(src);
		 dd.selectByVisibleText("Website");
		 
		 //Choose industry
		 WebElement ind = driver.findElementById("createLeadForm_industryEnumId");
		 Select dd1=new Select(ind);
		 dd1.deselectByIndex(1);
		 
		 //Choose ownership
		 WebElement ons = driver.findElementById("createLeadForm_ownershipEnumId");
		 Select dd2=new Select(ons);
		 dd2.deselectByIndex(2);
		 
		 
		 //Click create lead button
	     driver.findElementByCssSelector(".smallSubmit").click();
	     
	     //verify the title of the page
	     String title = driver.getTitle();
	     System.out.println(title);
	      
	     //using containts
	     if(title.contains("View")) {
	    	 System.out.println("Title matched");
	     }else
	    	 System.out.println("Title doesen't matched");
	     

	     //Using equals
	     if(title.equals(title)) {
	    	 System.out.println("Title matched");

	     }else
	    	 System.out.println("Title doesen't matched");



	}
	@Test(priority =2)
	public void deletLead() {
		
				
		// click Leads
		driver.findElementByLinkText("Leads").click();
		// click Find lead link
		driver.findElementByLinkText("Find Leads").click();
		// click on phone
		driver.findElementByXPath("//span[text()='Phone']").click();
		// click on email
		// driver.findElementByXPath("//span[text()='Email']").click();
		// enter phone number(areaCode)
		driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
		// enter phone number
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
		// enter email address
		// driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
	}

	
	
	
	@Test
	public void mergeLead() {
		System.out.println("mergeLead");
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}


}
