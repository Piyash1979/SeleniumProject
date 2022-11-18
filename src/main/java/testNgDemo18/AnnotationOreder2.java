package testNgDemo18;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AnnotationOreder2 {
	
	
	public ChromeDriver driver;
	
  @Test(priority = 1)
	public void editLead() {
		
		// click leads link
		driver.findElementByLinkText("Leads").click();
		// click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
		// click Find lead button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
	}

	@Test(priority = 0)
	public void createLead() throws InterruptedException, IOException {
		
		// click leads
		driver.findElementByLinkText("Leads").click();
		// click create lead link
		driver.findElementByLinkText("Create Lead").click();
		// enter company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		// enter firstName
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		System.out.println("FirstName successfully Entered");
		// enter lastName
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		System.out.println("LastName successfully Entered");
		Thread.sleep(3000);
		
		//Take snapshot/ Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);
		
		//Path /Location-1 where it will store
		File dest=new File("C:\\Users\\ginic\\OneDrive\\Desktop\\SnapShot\\image.png");
		
		//Path /Location-2 where it will store
		FileUtils.copyFile(src, dest);//moved file source to destination

		// driver.findElementById("createLeadForm_lastName").sendKeys("J");
		// Choose source
		/*WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		// enter phone number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("1234567");
		// enter department
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");
		// Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567");
		// Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("hema@gmail.com");*/
		
		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
	}
	@Test(priority = 2)
	public void deleteLead() {
		
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
