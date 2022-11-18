package verification_usingIfElse17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfThePage {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		
		//Click Lead link
		 driver.findElementByLinkText("Leads").click();
		 driver.findElementByXPath("//a[text()='Create Lead']").click();

		 //company name
		driver.findElementByCssSelector("input[id^='createLeadForm_c']").sendKeys("TCS");
		//driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
        String firstName = driver.findElementByCssSelector("input[id$='rstName']").getText();
        
        System.out.println("First name");
        if(firstName.equals("Hema")) {
        	System.out.println("FirstName is matched");
        }else
        	System.out.println("FirstName isn't matced");
        
         
        
		//driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
       //String lastName = driver.findElementByCssSelector("#createLeadForm_lastName").getText();
       System.out.println("Last name is Mali");
       
      /* if(lastName.contains("Mali")) {
    	   System.out.println("LastName is matched");
    	   
       }else
    	   System.out.println("LastName doesnot matched");
		
        driver.findElementByCssSelector(".smallSubmit").click();*/
        
        //To verify title of the page
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        
       // if(title.contains("View")) {
        if(title.equals("View")) {
        	System.out.println("Title mathched");
        
        }else {
        	System.out.println("Title not matched");
        }
        
        Thread.sleep(3000);
        driver.close();
        	
        }
	}


