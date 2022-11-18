package xPath10;

import java.awt.ItemSelectable;
import java.nio.channels.SelectableChannel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildNavigating_Xpath {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//Syntax:Parent basic xpath/child tagname
		
		// driver.findElementByXPath("//div[contains(@class,'ui')]/h3[1]").click();

		 driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		 driver.findElementByXPath("//ul[@id='sortable']/li[2]").click();
		 
		 Thread.sleep(3000);
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
		
		
		
		driver.close();

	}

}
