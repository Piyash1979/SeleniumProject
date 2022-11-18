package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_TestLeafCreateLead6 {

	public static void main(String[] args) throws InterruptedException {
		//Launch ChromeDriver
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				
				ChromeDriver driver=new ChromeDriver();
				
				//Load URL/Navigate to Leaftaps URL
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//Maximize Window
				driver.manage().window().maximize();
				
				//Print Title
				System.out.println(driver.getTitle());
				
				//Implicitly wait
				//Thread.sleep(3000);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//Enter User Name
				driver.findElementById("username").sendKeys("DemoSalesManager");
				
				//Enter Password
				driver.findElementById("password").sendKeys("crmsfa");
				
				//Click login
				driver.findElementByClassName("decorativeSubmit").click();
				
				//Click crm/sfa link
				driver.findElementByLinkText("CRM/SFA").click();
				
				Thread.sleep(2000);
				
				//Click Lead link
				 driver.findElementByLinkText("Leads").click();
				
				//Click Create Lead link
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
				driver.navigate().back();
				
				Thread.sleep(2000);
				
				//Go to the page we had came from > Should be used after back
                driver.navigate().forward();
                
                Thread.sleep(3000);
                
                driver.navigate().refresh();
                
                //Close browser
				//driver.close();
				
				// It will close the .exe driver and it will close all browsers which opened by Selenium
                driver.quit(); 

				
				

				

	}

}
