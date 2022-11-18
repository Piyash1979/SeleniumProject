package aUI_Concept12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventTab {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElementById("email").sendKeys("abc@yahoo.com");
		//driver.findElementById("pass").sendKeys(args)

		//by using action class - enter password as Parisa using Tab key on facebook.com

		Actions action=new Actions(driver);
		//hit Tab key from keyboard-Tab action will perform
		action.sendKeys(Keys.TAB).sendKeys("Parisa").build().perform();
		
		//we can use Enter key after Tab-Hit Enter facebook.com
		action.sendKeys(Keys.ENTER).perform();
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(3000);
		//driver.close();
	}

}
