package xPath10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_AttributeBase_Xpath {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.navigate().to("https://www.bankofamerica.com");
		driver.navigate().to("http://leaftaps.com/opentaps/control/main ");
		driver.manage().window().maximize();
		
		//Syntex://tagname[@attribute='value']
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
		System.out.println("Login successfully");
		
		Thread.sleep(3000);
		driver.close();
	}

}
