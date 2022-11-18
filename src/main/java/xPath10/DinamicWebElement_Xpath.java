package xPath10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DinamicWebElement_Xpath {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ginic\\OneDrive\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver	 driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		//collection xpath Syntax:(any xpath)[]
		driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("(//input[@class='inputLogin'])[2]").sendKeys("crmsfa");
		System.out.println(driver.getTitle());
		
		Thread.sleep(4000);
		driver.close();
	}

}
