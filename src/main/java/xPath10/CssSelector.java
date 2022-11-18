package xPath10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		//Find element by direct locator
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");
		//driver.findElement(By.className("inputLogin")).sendKeys("DemoSalesManager");
		//Find element by customize locator
		//Attribute base Xpath
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		//Partial attribute base xpath
		//driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("DemoSalesManager");
		//Find element by css selector
		driver.findElement(By.ByCssSelector.id("#username")).sendKeys("DemoSalesManager");
		//driver.findElement(By.ByCssSelector.cssSelector(".inputLogin")).sendKeys("DemoSalesManager");
		//driver.findElement(By.ByCssSelector.name("input[name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.ByCssSelector.id("input[id^='p']")).sendKeys("crmsfa");
		driver.findElement(By.cssSelector("input[class$='t']")).click();
		//driver.findElement(By.cssSelector(""));
		
		Thread.sleep(3000);
		driver.close();
		
	
	}

}
