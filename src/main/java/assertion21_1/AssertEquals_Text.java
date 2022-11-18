package assertion21_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertEquals_Text {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		
		//Assertion
		Assert.assertEquals(title, "Bank of America | Online Banking | Log In | User ID","Verify page title");
		
		//isDisplay(); "Bank of America" Logo is displayed(true/False)
		boolean logo = driver.findElementByXPath("//img[@alt='Bank of America']").isDisplayed();
		System.out.println(logo);
		//Assertion
		Assert.assertTrue(logo, "logo is displayed");
		
		if (logo==true) {
			System.out.println("logo is displayed");
		}else {
			System.out.println("False");
		}
	//isEnabled() Get the App link is Enable (true/false)
			boolean getTheAppLink = driver.findElementByXPath("//a[@id='choose-device-get-the-app']/span[1]").isEnabled();
			
		if( getTheAppLink==true) {
			System.out.println("Get the App link is Enable");
		}else
			System.out.println("Get the App link is not Enable/Disable");
		
	//First click on the "Save this online Id CheckBox"(select) then verify isSeleceted()	
	driver.findElementByXPath("//div[@class='remember-info']/input").click();
	boolean SaveOnlineUserIdCheckBox = driver.findElementByXPath("//div[@class='remember-info']/input").isSelected();
    System.out.println(SaveOnlineUserIdCheckBox);
    
    //Assertion
   Assert.assertTrue(SaveOnlineUserIdCheckBox, "Save this online id checkbox is selected");
   
   //Validation
   if(SaveOnlineUserIdCheckBox==true) {
	   System.out.println("Save this online id checkbox is selected");
   }else
	   System.out.println("Save this online id checkbox is notselected");
   
	
	
		driver.close();
	}

}
