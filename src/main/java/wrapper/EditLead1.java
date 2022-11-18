package wrapper;

import org.testng.annotations.Test;

public class EditLead1 extends ProjectSpecificWrapper{
	@Test
	public void editLead1() {
	// click leads link
	driver.findElementByLinkText("Leads").click();
	// click Find leads link
	driver.findElementByLinkText("Find Leads").click();
	// Enter first name
	driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
	// click Find lead button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	}


}
