package wrapper;

import org.testng.annotations.Test;

public class DeleteLead1 extends ProjectSpecificWrapper{
	@Test
	public void deleteLead1() {
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
}