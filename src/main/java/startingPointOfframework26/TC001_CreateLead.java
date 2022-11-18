package startingPointOfframework26;

import org.testng.annotations.Test;

public class TC001_CreateLead extends GenericWrapper{
	
	@Test
	public void createLead() throws InterruptedException {
		launchBrowser("http://leaftaps.com/opentaps/control/main");
		enterById("username","DemoSalesManager");
		enterByName("PASSWORD","crmsfa");
		clickByXpath("//input[@class='decorativeSubmit']");
		clickBYLinkText("CRM/SFA");
		clickBYLinkText("Leads");
		clickBYLinkText("Create Lead");
		
		Thread.sleep(2000);
		
		enterById("createLeadForm_companyName","TCS");
		enterById("createLeadForm_firstName","Hema");
		enterById("createLeadForm_lastName","M");
		enterById("createLeadForm_firstNameLocal","Hema");
		enterByXpath("//input[@id='createLeadForm_lastNameLocal']","M");
		enterByXpath("//input[@name='personalTitle']","Ms.");
		selectVesebleTextById("createLeadForm_dataSourceId","Website");
		enterByXpath("//input[@name='generalProfTitle']","Ms");
		enterByXpath("//input[@name='annualRevenue']","1000");
		selectVesebleTextById("createLeadForm_industryEnumId","Insurance");
		selectVesebleTextById("createLeadForm_ownershipEnumId","Partnership");
		enterByXpath("//input[@name='sicCode']","1010");
		enterByXpath("//textarea[@name='description']","It is a software development company");
		enterById("createLeadForm_importantNote","it is a trusted company");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneCountryCode']","0088");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']","123");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneExtension']","101");
		enterByXpath("//input[@id='createLeadForm_departmentName']","QA");
		selectVesebleTextById("createLeadForm_currencyUomId","USD - American Dollar");
		enterByXpath("//input[@id='createLeadForm_numberEmployees']","1002");
		enterByXpath("//input[@name='tickerSymbol']","$");
		enterByXpath("//input[@name='primaryPhoneAskForName']","Hema");
		enterByXpath("//input[@name='primaryWebUrl']","www.google.com");
		enterByXpath("//input[@name='generalToName']","Ma");
		enterByXpath("//input[@name='generalAddress1']","6420193rd street");
		enterByXpath("//input[@name='generalAddress2']","Apt 252");
		enterByXpath("//input[@name='generalCity']","DAL");
		
		selectVesebleTextById("createLeadForm_generalStateProvinceGeoId","Texas");
		Thread.sleep(2000);
		selectVesebleTextById("createLeadForm_generalCountryGeoId","Bangladesh");
		enterByXpath("//input[@id='createLeadForm_generalPostalCode']","75061");
		enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']","111");
		selectVesebleTextById("createLeadForm_marketingCampaignId","Car and Driver");
		enterById("createLeadForm_primaryPhoneNumber","347-612-1535");
		enterById("createLeadForm_primaryEmail","abc@gmail.com");
		
		Thread.sleep(2000);
		clickByXpath("//input[@name='submitButton']");
		
		
		//verifyTextById("viewLead_firstName_sp","Hema");
		
		
		
		
		
		
		
		
		
		
		
	}

}
